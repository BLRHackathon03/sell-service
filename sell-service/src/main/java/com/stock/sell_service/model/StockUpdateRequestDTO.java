package com.stock.sell_service.model;

import lombok.Data;

@Data
public class StockUpdateRequestDTO {
    private int stockId;
    private String userId;

    private String stockAlias;
    private Double stockPrice;
    private Integer stockQuantity;
}


