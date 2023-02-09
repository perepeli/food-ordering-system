package org.example.order.service.domain.ports.input.service;

import jakarta.validation.Valid;
import org.example.order.service.domain.dto.create.CreateOrderCommand;
import org.example.order.service.domain.dto.create.CreateOrderResponse;
import org.example.order.service.domain.dto.track.TrackOrderQuery;
import org.example.order.service.domain.dto.track.TrackOrderResponse;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand creteOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
