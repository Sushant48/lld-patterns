package sushant.lldPatterns.observerPattern.orderNotificationSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private BigDecimal amount;
}
