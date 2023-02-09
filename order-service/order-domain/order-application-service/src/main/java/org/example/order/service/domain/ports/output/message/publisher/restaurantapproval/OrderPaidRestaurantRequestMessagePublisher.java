package org.example.order.service.domain.ports.output.message.publisher.restaurantapproval;

import org.example.domain.event.publisher.DomainEventPublisher;
import org.example.order.service.domain.event.OrderCreatedEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
