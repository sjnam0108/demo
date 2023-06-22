package com.hstar.firstkopring.demo.entity

import com.hstar.firstkopring.demo.dto.BoardFromDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Board (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var writer: String,
        var password: String,
        var title: String,
        var content: String
){
    fun updatePost(boardFromDto: BoardFromDto){
        writer = boardFromDto.writer
        title = boardFromDto.title
        password = boardFromDto.password
        content = boardFromDto.content
    }
}