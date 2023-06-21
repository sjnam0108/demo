package com.hstar.firstkopring.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstRestController {

    @GetMapping("/hello")
    fun hello(): String = "Test Hello"

}