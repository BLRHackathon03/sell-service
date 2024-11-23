package com.stock.sell_service.controller;


import com.stock.sell_service.model.Stock;
import com.stock.sell_service.model.StockUpdateRequestDTO;
import com.stock.sell_service.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SellServiceController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @GetMapping("/stocksale/{id}/stockQuanity/{stockQuantity}/userID/{userId}")
    public @ResponseBody Stock sellStock(@PathVariable int id, @PathVariable String userId,
                                         @PathVariable String stockQuantity) {
        System.out.println(id + userId + stockQuantity);

        StockUpdateRequestDTO ob = new StockUpdateRequestDTO();
        ob.setUserId(userId);
        ob.setStockId(id);
        ob.setStockQuantity(Integer.valueOf(stockQuantity));

        kafkaProducerService.updateStock(ob);
        return findStockById(id);
    }

    private Stock findStockById(int id) {
      Stock stock1 = new Stock();
      stock1.setStockId(101);
      stock1.setStockName("101");

      return stock1;
    }
}
