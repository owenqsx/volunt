package com.qisixiao.volunt.voluntary.event.resource.adapter.api.event;

import com.qisixiao.volunt.voluntary.event.application.EventApplication;
import com.qisixiao.volunt.voluntary.event.domain.event.Event;
import org.springframework.web.bind.annotation.PostMapping;

public class EventApi {

    @PostMapping("/event/save")
    public Event save(Event event) {
        return EventApplication.save(event);
    }
}
