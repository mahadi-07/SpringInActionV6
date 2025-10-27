package com.example.TacoCloud.repo;

import com.example.TacoCloud.pojo.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
