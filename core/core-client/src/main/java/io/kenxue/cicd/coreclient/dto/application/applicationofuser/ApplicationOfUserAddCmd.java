package io.kenxue.cicd.coreclient.dto.application.applicationofuser;

import io.kenxue.cicd.coreclient.dto.common.command.CommonCommand;
import lombok.Data;
import javax.validation.constraints.NotNull;
import lombok.experimental.Accessors;

/**
 * 应用关联用户
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Data
@Accessors(chain = true)
public class ApplicationOfUserAddCmd extends CommonCommand {
    @NotNull
    private ApplicationOfUserDTO applicationOfUserDTO;
}
