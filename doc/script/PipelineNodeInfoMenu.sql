use `cicd-platform`;
set @uuid=REPLACE(UUID(), '-', '');
-- 菜单
INSERT INTO `sys_menu` (`uuid`,`menu_parent_uuid`, `menu_name`, `menu_url`, `menu_perms`, `menu_type`, `menu_icon`, `menu_order`,`gmt_create`,`gmt_modified`)
    VALUES (@uuid,null, '流水线节点详情', '/pipeline/info', NULL, '1', 'component', '6',now(),now());
-- 按钮
set @uuidinfo=REPLACE(UUID(), '-', '');
INSERT INTO `sys_menu` (`uuid`,`menu_parent_uuid`, `menu_name`, `menu_url`, `menu_perms`, `menu_type`, `menu_icon`, `menu_order`,`gmt_create`,`gmt_modified`)
    VALUES (@uuidinfo,@uuid, '查看', null, 'pipeline:pipelinenodeinfo:page,pipeline:pipelinenodeinfo:info,pipeline:pipelinenodeinfo:list', '2', null, '6',now(),now());

set @uuidadd=REPLACE(UUID(), '-', '');
INSERT INTO `sys_menu` (`uuid`,`menu_parent_uuid`, `menu_name`, `menu_url`, `menu_perms`, `menu_type`, `menu_icon`, `menu_order`,`gmt_create`,`gmt_modified`)
    VALUES (@uuidadd,@uuid, '新增', null, 'pipeline:pipelinenodeinfo:add', '2', null, '6',now(),now());

set @uuidupdate=REPLACE(UUID(), '-', '');
INSERT INTO `sys_menu` (`uuid`,`menu_parent_uuid`, `menu_name`, `menu_url`, `menu_perms`, `menu_type`, `menu_icon`, `menu_order`,`gmt_create`,`gmt_modified`)
    VALUES (@uuidupdate,@uuid, '修改', null, 'pipeline:pipelinenodeinfo:update', '2', null, '6',now(),now());

set @uuiddel=REPLACE(UUID(), '-', '');
INSERT INTO `sys_menu` (`uuid`,`menu_parent_uuid`, `menu_name`, `menu_url`, `menu_perms`, `menu_type`, `menu_icon`, `menu_order`,`gmt_create`,`gmt_modified`)
    VALUES (@uuiddel,@uuid, '删除', null, 'pipeline:pipelinenodeinfo:delete', '2', null, '6',now(),now());