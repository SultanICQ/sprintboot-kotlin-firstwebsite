package com.sultanicq.firstwebsite

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorldController {
    @GetMapping("/hi")
    fun hello(): String {
        return "Hello! I salute you from inside a Sprint Boot via Kotlin! 🤣"
    }
}