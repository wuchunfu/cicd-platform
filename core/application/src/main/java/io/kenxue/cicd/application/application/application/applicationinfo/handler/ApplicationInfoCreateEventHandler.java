package io.kenxue.cicd.application.application.application.applicationinfo.handler;

import io.kenxue.cicd.application.common.event.EventHandler;
import io.kenxue.cicd.application.common.event.EventHandlerI;
import io.kenxue.cicd.coreclient.dto.common.response.Response;
import io.kenxue.cicd.coreclient.dto.application.applicationinfo.event.ApplicationInfoCreateEvent;
import lombok.extern.slf4j.Slf4j;
/**
 * 应用
 * @author mikey
 * @date 2021-12-26 17:17:54
 */
@Slf4j
@EventHandler
public class ApplicationInfoCreateEventHandler implements EventHandlerI<Response, ApplicationInfoCreateEvent> {

    public Response execute(ApplicationInfoCreateEvent event) {
        log.debug("Handling Event:{}",event);
        return Response.success();
    }
}
