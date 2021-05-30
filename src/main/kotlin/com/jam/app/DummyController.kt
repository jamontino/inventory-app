package com.jam.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController {

    @GetMapping("/hello")
    fun index(): String {
        return "hello world"
    }
}