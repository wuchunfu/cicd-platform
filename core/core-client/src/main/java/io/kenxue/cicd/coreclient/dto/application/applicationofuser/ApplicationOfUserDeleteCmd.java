package io.kenxue.cicd.coreclient.dto.application.applicationofuser;

import io.kenxue.cicd.coreclient.dto.common.command.CommonCommand;
import lombok.Data;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotNull;

/**
 * 应用关联用户
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Data
@Accessors(chain = true)
public class ApplicationOfUserDeleteCmd extends CommonCommand {
    @NotNull
    private Long[] ids;
}
