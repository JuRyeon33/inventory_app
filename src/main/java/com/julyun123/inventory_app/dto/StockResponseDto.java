package com.julyun123.inventory_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class StockResponseDto {
    private Long id;
    private Integer quantity;
    private Long productId;
    private String productName;
    private Long warehouseId;
    private String warehouseName;
}
