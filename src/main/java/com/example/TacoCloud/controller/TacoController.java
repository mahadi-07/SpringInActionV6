package com.example.TacoCloud.controller;

import com.example.TacoCloud.pojo.Taco;
import com.example.TacoCloud.pojo.TacoOrder;
import com.example.TacoCloud.repo.OrderRepository;
import com.example.TacoCloud.repo.TacoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "api/tacos", produces = {"application/json", "text/xml"})
@CrossOrigin("*")
@RequiredArgsConstructor
public class TacoController {

    private final TacoRepository tacoRepo;

    @GetMapping("recent")
    public ResponseEntity<List<Taco>> recentsTacos() {
        var page = PageRequest.of(0, 12, Sort.by("createdAt").descending());
        return new ResponseEntity<>(tacoRepo.findAll(page).stream().toList(), HttpStatus.OK);
    }
}
