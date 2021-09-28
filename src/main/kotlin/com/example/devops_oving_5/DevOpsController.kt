package com.example.devops_oving_5

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class DevOpsController {

    @GetMapping(path = ["/"])
    fun hello(): String? {
        return "Hello World<3 fra Øydis<3"
    }
}