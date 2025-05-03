package com.my.deal_aggregator;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TickerInfoApiTest extends BaseTest {

    @Test
    public void shouldGetTickerInfo() {
        ResponseEntity<String> response = restTemplate.getForEntity("/v1/ticker/ABC", String.class);
        assertThat(response.getStatusCode().value()).isEqualTo(200);
        assertThat(response.getBody()).isEqualTo("""
                {"min":1,"max":1,"avg":1}
                """.trim());
    }

}
