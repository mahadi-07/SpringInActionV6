package com.example.TacoCloud.repo;

import com.example.TacoCloud.pojo.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
