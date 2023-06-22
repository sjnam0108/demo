package com.hstar.firstkopring.demo.controller

import com.hstar.firstkopring.demo.dto.BoardFromDto
import com.hstar.firstkopring.demo.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("board")
class BoardController @Autowired constructor(val boardService: BoardService) {

    @PostMapping
    fun addPost(boardFromDto: BoardFromDto): ResponseEntity<Any> {
        val save = boardService.save(boardFromDto)
        return ResponseEntity.ok().body(save)
    }

    @GetMapping("/{id}")
    fun getPost(@PathVariable id: Long): ResponseEntity<Any> {
        val post = boardService.getPost(id)
        return ResponseEntity.ok().body(post)
    }

    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable id: Long): ResponseEntity<Any> {
        boardService.deletePost(id)
        return ResponseEntity.ok().body(true)
    }

    @PutMapping("/{id}")
    fun updatePost(
            @PathVariable id: Long,
            boardFromDto: BoardFromDto
    ): ResponseEntity<Any> {
        val post = boardService.updatePost(id, boardFromDto)
        return ResponseEntity.ok().body(post)
    }

    @GetMapping("/list")
    fun listPost(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(boardService.getPostList())
    }
}