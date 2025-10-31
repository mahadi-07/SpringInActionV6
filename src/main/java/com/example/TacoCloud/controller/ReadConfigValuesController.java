package com.example.TacoCloud.controller;

import com.example.TacoCloud.config.ReadValuesFromConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ReadConfigValuesController {

    private final ReadValuesFromConfig readValuesFromConfig;

    @GetMapping("/get-config-values")
    public String getConfigValues() {
        log.info("values = {}", readValuesFromConfig.toString());
        return readValuesFromConfig.toString();
    }
}
