package com.example.TacoCloud.repo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepo;


    @Test
    public void findAll() {
        orderRepo.findAll().forEach(order -> {
            log.info(order.toString());
        });
    }

}