package com.geekbrains.webapp.dtos;

import com.geekbrains.webapp.model.Order;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class OrderDto {
    private Long id;
    private List<OrderItemDto> items;
    private String address;
    private String phone;
    private int price;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.items = order.getItems().stream().map(OrderItemDto::new).collect(Collectors.toList());
        this.address = order.getAddress();
        this.phone = order.getPhone();
        this.price = order.getPrice();
    }
}
