package com.example.TacoCloud.controller;

import com.example.TacoCloud.pojo.Taco;
import com.example.TacoCloud.pojo.TacoOrder;
import com.example.TacoCloud.repo.OrderRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    private OrderRepository orderRepo;

    @Autowired
    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @GetMapping("/current")
    public String orderFrom(Model model) {
        if (!model.containsAttribute("tacoOrder")) {
            model.addAttribute("tacoOrder", new TacoOrder());
        }
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order,
                               Errors errors,
                               SessionStatus sessionStatus) {
        if(errors.hasErrors()) {
            return "orderForm";
        }
        log.info("Order submitted: {}", order);
        orderRepo.save(order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
