package com.hstar.firstkopring.demo.service

import com.hstar.firstkopring.demo.dto.BoardFromDto
import com.hstar.firstkopring.demo.entity.Board
import com.hstar.firstkopring.demo.repository.BoardRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardService @Autowired constructor(
        val boardRepository: BoardRepository,
        val modelMapper: ModelMapper
){
    fun save(boardFromDto: BoardFromDto): Long? {
        return boardRepository.save(modelMapper.map(boardFromDto, Board::class.java)).id
    }

    fun getPost(id: Long): Board? {
        return boardRepository.findById(id).get()
    }

    fun deletePost(id: Long) {
        boardRepository.deleteById(id)
    }

    fun updatePost(id:Long, boardFromDto: BoardFromDto): Board {
        val post = boardRepository.findById(id).get()
        post.updatePost(boardFromDto)
        return post
    }

    fun getPostList(): List<Board> {
        return boardRepository.findAll()
    }
}