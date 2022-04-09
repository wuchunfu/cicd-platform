package io.kenxue.cicd.domain.repository.application;

import io.kenxue.cicd.coreclient.dto.common.page.Page;
import io.kenxue.cicd.coreclient.dto.pipeline.pipelinenode.PipelineNodeListQry;
import io.kenxue.cicd.coreclient.dto.pipeline.pipelinenode.PipelineNodePageQry;
import io.kenxue.cicd.domain.domain.application.PipelineNode;
import java.util.List;
/**
 * 流水线节点类型
 * @author mikey
 * @date 2022-02-26 00:19:20
 */
public interface PipelineNodeRepository {
    void create(PipelineNode pipelineNode);
    void update(PipelineNode pipelineNode);
    PipelineNode getById(Long id);
    List<PipelineNode> list(PipelineNodeListQry pipelineNodeListQry);
    Page<PipelineNode> page(PipelineNodePageQry qry);
}
