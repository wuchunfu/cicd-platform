package io.kenxue.cicd.application.application.application.applicationofuser.command.query;

import io.kenxue.cicd.application.application.application.applicationofuser.assembler.ApplicationOfUser2DTOAssembler;
import io.kenxue.cicd.coreclient.dto.common.response.MultiResponse;
import io.kenxue.cicd.coreclient.dto.application.applicationofuser.ApplicationOfUserDTO;
import io.kenxue.cicd.coreclient.dto.application.applicationofuser.ApplicationOfUserListQry;
import io.kenxue.cicd.domain.domain.application.ApplicationOfUser;
import io.kenxue.cicd.domain.repository.application.ApplicationOfUserRepository;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;
/**
 * 应用关联用户
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Component
public class ApplicationOfUserListQryExe {
    @Resource
    private ApplicationOfUserRepository applicationOfUserRepository;
    @Resource
    private ApplicationOfUser2DTOAssembler applicationOfUser2DTOAssembler;

    public MultiResponse<ApplicationOfUserDTO> execute(ApplicationOfUserListQry qry) {
        List<ApplicationOfUser> applicationOfUserDTOList = applicationOfUserRepository.list(qry);
        return MultiResponse.of(applicationOfUser2DTOAssembler.toDTOList(applicationOfUserDTOList));
    }
}
