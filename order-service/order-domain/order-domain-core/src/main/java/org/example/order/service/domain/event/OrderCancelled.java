package org.example.order.service.domain.event;

import org.example.domain.event.DomainEvent;
import org.example.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelled extends OrderEvent {

    public OrderCancelled(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
