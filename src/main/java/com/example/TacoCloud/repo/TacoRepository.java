package com.example.TacoCloud.repo;

import com.example.TacoCloud.pojo.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
