package com.hstar.firstkopring.demo.controller

import com.hstar.firstkopring.demo.dto.LogRequestDto
import com.hstar.firstkopring.demo.service.LogRequestService
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
@Slf4j
@RestController
class LogRequestController @Autowired constructor(val logRequestService: LogRequestService) {
    val logger: Logger = LoggerFactory.getLogger(LogRequestController::class.java)
    @ResponseBody
    @PostMapping("/store/api/sendLog")
    fun addLog(@RequestBody logRequestDto: LogRequestDto): ResponseEntity<Any> {
        println(logRequestDto)
        val save = logRequestService.save(logRequestDto)
        val res = ResResult(200, "OK", save != 0L)
        return ResponseEntity.ok().body(res)
        logger.info("바보")
    }

}

data class ResResult(
    val data: Int,
    val message: String? = "",
    val success: Boolean
)