package io.kenxue.cicd.application.application.sys.role.command.query;


import io.kenxue.cicd.application.application.sys.role.assembler.Role2DTOAssembler;
import io.kenxue.cicd.coreclient.dto.sys.role.RoleDTO;
import io.kenxue.cicd.coreclient.dto.common.response.SingleResponse;
import io.kenxue.cicd.coreclient.dto.sys.role.RoleGetQry;
import io.kenxue.cicd.domain.domain.sys.Role;
import io.kenxue.cicd.domain.domain.sys.RoleOfMenu;
import io.kenxue.cicd.domain.repository.sys.RoleRepository;
import io.kenxue.cicd.domain.repository.sys.RoleOfMenuRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 角色表
 * @author mikey
 * @date 2021-11-17 14:27:15
 */
@Component
public class RoleGetQryExe {

    @Resource
    private RoleRepository roleRepository;
    @Resource
    private RoleOfMenuRepository roleOfMenuRepository;
    @Resource
    private Role2DTOAssembler role2DTOAssembler;

    public SingleResponse<RoleDTO> execute(RoleGetQry qry) {
        Role role = roleRepository.getById(qry.getId());
        RoleDTO roleDTO = role2DTOAssembler.toDTO(role);
        List<RoleOfMenu> roleOfMenu = roleOfMenuRepository.getRoleOfMenu(roleDTO.getUuid());
        roleDTO.setMenuList(roleOfMenu.stream().map(v->v.getMenuUuid()).collect(Collectors.toList()));
        return SingleResponse.of(roleDTO);
    }

}
