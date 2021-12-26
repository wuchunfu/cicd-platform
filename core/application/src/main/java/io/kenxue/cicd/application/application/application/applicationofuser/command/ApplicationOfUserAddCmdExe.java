package io.kenxue.cicd.application.application.application.applicationofuser.command;

import io.kenxue.cicd.application.application.application.applicationofuser.assembler.ApplicationOfUser2DTOAssembler;
import io.kenxue.cicd.coreclient.dto.common.response.Response;
import io.kenxue.cicd.domain.repository.application.ApplicationOfUserRepository;
import io.kenxue.cicd.domain.domain.application.ApplicationOfUser;
import io.kenxue.cicd.coreclient.dto.application.applicationofuser.ApplicationOfUserAddCmd;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
/**
 * 应用关联用户
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Component
public class ApplicationOfUserAddCmdExe {

    @Resource
    private ApplicationOfUserRepository applicationOfUserRepository;
    @Resource
    private ApplicationOfUser2DTOAssembler applicationOfUser2DTOAssembler;

    public Response execute(ApplicationOfUserAddCmd cmd) {
        ApplicationOfUser applicationOfUser = applicationOfUser2DTOAssembler.toDomain(cmd.getApplicationOfUserDTO());
        applicationOfUserRepository.create(applicationOfUser);
        return Response.success();
    }
}
