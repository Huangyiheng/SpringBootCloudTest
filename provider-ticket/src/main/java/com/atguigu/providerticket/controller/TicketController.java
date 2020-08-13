package com.atguigu.providerticket.controller;

import com.atguigu.providerticket.service.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    TickerService tickerService;

    @GetMapping("/ticket")
    public String getTicket() {
        return tickerService.getTicket();
    }
}
