package com.example.TacoCloud.repo;

import com.example.TacoCloud.pojo.Taco;
import com.example.TacoCloud.pojo.TacoOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

import java.net.ContentHandler;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
