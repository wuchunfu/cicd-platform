package io.kenxue.cicd.application.application.application.applicationinfo.command;

import io.kenxue.cicd.application.application.application.applicationinfo.assembler.ApplicationInfo2DTOAssembler;
import io.kenxue.cicd.domain.domain.application.ApplicationInfo;
import io.kenxue.cicd.coreclient.dto.common.response.Response;
import io.kenxue.cicd.coreclient.dto.application.applicationinfo.ApplicationInfoUpdateCmd;
import io.kenxue.cicd.domain.repository.application.ApplicationInfoRepository;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
/**
 * 应用
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Component
public class ApplicationInfoUpdateCmdExe {

    @Resource
    private ApplicationInfoRepository applicationInfoRepository;
    @Resource
    private ApplicationInfo2DTOAssembler applicationInfo2DTOAssembler;

    public Response execute(ApplicationInfoUpdateCmd cmd) {
        ApplicationInfo applicationInfo = applicationInfo2DTOAssembler.toDomain(cmd.getApplicationInfoDTO());
        applicationInfoRepository.update(applicationInfo);
        return Response.success();
    }
}