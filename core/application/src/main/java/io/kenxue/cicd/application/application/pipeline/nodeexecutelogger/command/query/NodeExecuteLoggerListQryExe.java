package io.kenxue.cicd.application.application.pipeline.nodeexecutelogger.command.query;

import io.kenxue.cicd.application.application.pipeline.nodeexecutelogger.assembler.NodeExecuteLogger2DTOAssembler;
import io.kenxue.cicd.coreclient.dto.common.response.MultiResponse;
import io.kenxue.cicd.coreclient.dto.pipeline.nodeexecutelogger.NodeExecuteLoggerDTO;
import io.kenxue.cicd.coreclient.dto.pipeline.nodeexecutelogger.NodeExecuteLoggerListQry;
import io.kenxue.cicd.domain.domain.pipeline.NodeExecuteLogger;
import io.kenxue.cicd.domain.repository.pipeline.NodeExecuteLoggerRepository;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;
/**
 * 节点执行记录
 * @author mikey
 * @date 2022-05-05 11:24:39
 */
@Component
public class NodeExecuteLoggerListQryExe {
    @Resource
    private NodeExecuteLoggerRepository nodeExecuteLoggerRepository;
    @Resource
    private NodeExecuteLogger2DTOAssembler nodeExecuteLogger2DTOAssembler;

    public MultiResponse<NodeExecuteLoggerDTO> execute(NodeExecuteLoggerListQry qry) {
        List<NodeExecuteLogger> nodeExecuteLoggerDTOList = nodeExecuteLoggerRepository.list(qry);
        return MultiResponse.of(nodeExecuteLogger2DTOAssembler.toDTOList(nodeExecuteLoggerDTOList));
    }
}
