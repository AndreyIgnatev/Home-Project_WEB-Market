package com.geekbrains.webapp.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class OrderDetailsDto {
    private String phone;
    private String address;
}
