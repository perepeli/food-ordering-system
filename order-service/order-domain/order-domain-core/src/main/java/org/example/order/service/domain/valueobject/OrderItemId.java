package org.example.order.service.domain.valueobject;

import org.example.domain.entity.BaseEntity;
import org.example.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
