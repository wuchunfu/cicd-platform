package io.kenxue.cicd.application.application.application.applicationconfig.handler;

import io.kenxue.cicd.application.common.event.EventHandler;
import io.kenxue.cicd.application.common.event.EventHandlerI;
import io.kenxue.cicd.coreclient.dto.common.response.Response;
import io.kenxue.cicd.coreclient.dto.application.applicationconfig.event.ApplicationConfigUpdateEvent;
import lombok.extern.slf4j.Slf4j;
/**
 * 流水线
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Slf4j
@EventHandler
public class ApplicationConfigUpdateEventHandler implements EventHandlerI<Response, ApplicationConfigUpdateEvent> {
    
    public Response execute(ApplicationConfigUpdateEvent event) {
        log.debug("Handling Event:{}",event);
        return Response.success();
    }
}
