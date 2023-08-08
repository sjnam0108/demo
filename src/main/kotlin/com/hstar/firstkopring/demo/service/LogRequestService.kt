package com.hstar.firstkopring.demo.service


import com.hstar.firstkopring.demo.dto.LogRequestDto
import com.hstar.firstkopring.demo.repository.LogRequestRepository
import com.hstar.firstkopring.demo.util.logger
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

        val currentLogHistory = logRequestRepository.findByType("LogIn")
        this.logger().info("Test DB list : $currentLogHistory")

        val target = with(logRequestDto) {
            createAt = Date()
            lastLoginAt = Date()
            this
        }
        this@LogRequestService.logger().info("translated data : $target")
        return logRequestRepository.save(target.toEntity()).id
    }
}