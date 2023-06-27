package com.hstar.firstkopring.demo.controller

import com.hstar.firstkopring.demo.dto.BoardFromDto
import com.hstar.firstkopring.demo.dto.LogFromDto
import com.hstar.firstkopring.demo.service.logService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("log")
class FirstRestController @Autowired constructor(val logService: logService){

    @GetMapping("/hello")
    fun hello(): String = "Test Hello"

    @PostMapping
    fun addPost(logFromDto: LogFromDto): ResponseEntity<Any> {
        val save = logService.save(logFromDto)
        return ResponseEntity.ok().body(save)
    }

}