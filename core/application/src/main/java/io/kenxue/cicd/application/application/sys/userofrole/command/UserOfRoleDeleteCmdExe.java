package io.kenxue.cicd.application.application.sys.userofrole.command;

import io.kenxue.cicd.coreclient.context.UserThreadContext;
import io.kenxue.cicd.domain.domain.sys.UserOfRole;
import io.kenxue.cicd.coreclient.dto.common.response.Response;
import io.kenxue.cicd.coreclient.dto.sys.userofrole.UserOfRoleDeleteCmd;
import io.kenxue.cicd.domain.repository.sys.UserOfRoleRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.stream.Stream;

/**
 * 用户关联角色表
 * @author mikey
 * @date 2021-11-19 15:22:41
 */
@Component
public class UserOfRoleDeleteCmdExe {
    @Resource
    private UserOfRoleRepository userOfRoleRepository;

    public Response execute(UserOfRoleDeleteCmd cmd) {
        Stream.of(cmd.getIds()).forEach(id->{
            UserOfRole userOfRole = userOfRoleRepository.getById(id);
            userOfRole.deleted(UserThreadContext.get());
            userOfRoleRepository.update(userOfRole);
        });
        Stream.of(cmd.getUserUuids()).forEach(uuid->{
            userOfRoleRepository.removeByUserUuid(uuid);
        });
        return Response.success();
    }
}
