package io.kenxue.cicd.coreclient.dto.sys.applicationinfo;

import io.kenxue.cicd.coreclient.dto.common.command.CommonCommand;
import lombok.Data;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotNull;

/**
 * 应用
 * @author mikey
 * @date 2021-12-26 16:56:03
 */
@Data
@Accessors(chain = true)
public class ApplicationInfoDeleteCmd extends CommonCommand {
    @NotNull
    private Long[] ids;
}
