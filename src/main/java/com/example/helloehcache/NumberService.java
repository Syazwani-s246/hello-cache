package com.example.helloehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class NumberService {

    // @Cacheable - Spring will handle the caching
    @Cacheable(value = "squareCache", key = "#number", condition = "#number > 10")
    public BigDecimal square(Long number) {
        BigDecimal square = BigDecimal.valueOf(number)
                .multiply(BigDecimal.valueOf(number));
        return square;
    }


}