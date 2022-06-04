package io.kenxue.devops.domain.domain.project;

import io.kenxue.devops.domain.common.CommonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
/**
 * 项目任务
 * @author 麦奇
 * @date 2022-06-03 23:20:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task extends CommonEntity {
    /**
     * 状态
     */
    private String status;
    /**
     * 任务开始时间
     */
    private Date startTime;
    /**
     * 任务组uuid
     */
    private String groupUuid;
    /**
     * 执行人
     */
    private String userUuid;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务结束时间
     */
    private Date endTime;
    /**
     * 任务详细内容（富文本）
     */
    private String taskDesc;
    /**
     * 父级任务uuid
     */
    private String parentUuid;
    /**
     * 优先级
     */
    private String priority;
    /**
     * 标签
     */
    private String label;
    /**
     * 预计工时
     */
    private Integer taskTime;
}
