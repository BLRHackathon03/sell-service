package com.stock.sell_service.service;

import com.stock.sell_service.model.StockUpdateRequestDTO;
import com.stock.sell_service.model.StockUpdateResponseDO;

public interface StockService {
        public StockUpdateResponseDO updateStatus(StockUpdateRequestDTO stockUpdateRequest);

}
