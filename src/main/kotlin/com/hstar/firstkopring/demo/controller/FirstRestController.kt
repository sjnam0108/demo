package com.hstar.firstkopring.demo.controller

import com.hstar.firstkopring.demo.dto.LogFromDto
import com.hstar.firstkopring.demo.service.logService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping
class FirstRestController @Autowired constructor(val logService: logService){

    @GetMapping("/log/hello")
    fun hello(): String = "Test Hello"

    @PostMapping
    fun addPost(logFromDto: LogFromDto): ResponseEntity<Any> {
        val save = logService.save(logFromDto)
        return ResponseEntity.ok().body(save)
    }

    @GetMapping("/log/{id}")
    fun getPost(@PathVariable id: Long): ResponseEntity<Any> {
        val post = logService.getPost(id)
        return ResponseEntity.ok().body(post)
    }

    @DeleteMapping("/log/{id}")
    fun deletePost(@PathVariable id: Long): ResponseEntity<Any> {
        logService.deletePost(id)
        return ResponseEntity.ok().body(true)
    }

    @GetMapping("/log/list")
    fun listPost(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(logService.getPostList())
    }

}