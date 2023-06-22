package com.hstar.firstkopring.demo.repository

import com.hstar.firstkopring.demo.entity.Board
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository: JpaRepository<Board, Long> {
}