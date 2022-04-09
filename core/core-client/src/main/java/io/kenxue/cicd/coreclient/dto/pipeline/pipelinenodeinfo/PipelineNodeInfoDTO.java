package io.kenxue.cicd.coreclient.dto.pipeline.pipelinenodeinfo;

import io.kenxue.cicd.coreclient.dto.common.command.CommonDTO;
import io.kenxue.cicd.sharedataboject.common.group.Insert;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * 流水线节点详情
 * @author mikey
 * @date 2022-04-09 22:04:25
 */
@Data
@Accessors(chain = true)
public class PipelineNodeInfoDTO extends CommonDTO {
    /**
     * 唯一标示做关联
     */
    @NotNull(groups = {Insert.class})
    private String nodeUuid;
    /**
     * 节点详细内容
     */
    private String info;
}
