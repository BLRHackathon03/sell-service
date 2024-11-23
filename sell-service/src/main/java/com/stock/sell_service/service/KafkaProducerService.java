package com.stock.sell_service.service;


import com.stock.sell_service.model.StockUpdateRequestDTO;

public interface KafkaProducerService {

    public void updateStock(StockUpdateRequestDTO stockUpdateRequestDTO);
}
