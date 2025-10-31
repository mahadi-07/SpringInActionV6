package com.example.TacoCloud.config;

import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Data
@Validated
@ConfigurationProperties(prefix = "read.values")
public class ReadValuesFromConfig {

    @NotNull
    public Integer x = 100;

    @NotNull
    private Integer y;

    @NotNull
    private Integer z;

    @NotNull
    @Min(value = 5, message = "must be between 5 and 25")
    @Max(value = 25, message = "must be between 5 and 25")
    private Integer pageSize;

    @PostConstruct
    public void postConstruct() {
        log.info("x = {}, y = {}, z = {}", x, y, z);
        log.info("pageSize = {}", pageSize);
    }
}
