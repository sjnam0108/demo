package com.hstar.firstkopring.demo.service


import com.hstar.firstkopring.demo.dto.LogRequestDto
import com.hstar.firstkopring.demo.repository.LogRequestRepository
import jakarta.transaction.Transactional
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class LogRequestService @Autowired constructor() {

    @Autowired
    lateinit var logRequestRepository: LogRequestRepository

    @Transactional
    fun save(logRequestDto: LogRequestDto): Long {
        println("LogRequest DTO : $logRequestDto")
        val target = with(logRequestDto) {
            createAt = Date()
            lastLoginAt = Date()
            this
        }
        println("translated data : $target")
        return logRequestRepository.save(target.toEntity()).id
    }
}