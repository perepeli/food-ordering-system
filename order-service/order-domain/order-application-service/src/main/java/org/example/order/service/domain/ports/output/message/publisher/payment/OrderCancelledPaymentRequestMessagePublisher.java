package org.example.order.service.domain.ports.output.message.publisher.payment;

import org.example.domain.event.publisher.DomainEventPublisher;
import org.example.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
