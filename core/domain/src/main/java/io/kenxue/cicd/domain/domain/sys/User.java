package io.kenxue.cicd.domain.domain.sys;

import io.kenxue.cicd.domain.common.CommonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工档案
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends CommonEntity {
    private String userId;
    private String userName;
    private String userPassword;
    private String email;
    private Integer status;
}
