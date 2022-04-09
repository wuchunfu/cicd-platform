package io.kenxue.cicd.domain.factory.pipeline;

import io.kenxue.cicd.domain.domain.pipeline.PipelineNodeInfo;
/**
 * 流水线节点详情
 * @author mikey
 * @date 2022-04-09 22:04:25
 */
public class PipelineNodeInfoFactory {
    public static PipelineNodeInfo getPipelineNodeInfo(){
        return new PipelineNodeInfo();
    }
}
