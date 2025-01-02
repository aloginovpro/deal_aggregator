package com.my.deal_aggregator.controller;

import com.my.deal_aggregator.api.TickerInfoResponse;
import com.my.deal_aggregator.api.V1Api;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class DealAggregatorController implements V1Api {

    @Override
    public TickerInfoResponse getTicker(String ticker) {
        return new TickerInfoResponse(
                BigDecimal.ONE,
                BigDecimal.ONE,
                BigDecimal.ONE
        );
    }
}
