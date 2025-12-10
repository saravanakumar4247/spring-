package com.fazon.simplybytespringboot.controller;

import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health")
@AllArgsConstructor
public class TestingController {

    @GetMapping
    public String health() {
    return "Hi I am Saravana From Stackly this is my first pipeline";
    }

}
