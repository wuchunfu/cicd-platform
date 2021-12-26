package io.kenxue.cicd.coreclient.dto.sys.applicationofuser;

import io.kenxue.cicd.coreclient.dto.common.command.PageQuery;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 应用关联用户
 * @author mikey
 * @date 2021-12-26 16:56:03
 */
@Data
@Accessors(chain = true)
public class ApplicationOfUserPageQry extends PageQuery {

    private ApplicationOfUserDTO applicationOfUserDTO;

}
