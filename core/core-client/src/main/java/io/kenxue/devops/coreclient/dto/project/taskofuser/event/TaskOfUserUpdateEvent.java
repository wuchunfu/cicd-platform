package io.kenxue.devops.coreclient.dto.project.taskofuser.event;

import io.kenxue.devops.coreclient.dto.common.event.DomainEventI;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 任务关联用户
 * @author 麦奇
 * @date 2022-06-04 00:21:17
 */
@Data
@AllArgsConstructor
public class TaskOfUserUpdateEvent implements DomainEventI {
    private String uuid;
}
