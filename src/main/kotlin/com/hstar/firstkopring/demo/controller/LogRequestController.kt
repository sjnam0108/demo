package com.hstar.firstkopring.demo.controller

import com.hstar.firstkopring.demo.dto.LogRequestDto
import com.hstar.firstkopring.demo.service.LogRequestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LogRequestController @Autowired constructor(val logRequestService: LogRequestService) {

    @ResponseBody
    @PostMapping("/store/api/sendLog")
    fun addLog(@RequestBody logRequestDto: LogRequestDto): ResponseEntity<Any> {
        println(logRequestDto)
        val save = logRequestService.save(logRequestDto)
        val res = ResResult(200, "OK", save != 0L)
        return ResponseEntity.ok().body(res)
    }

}

data class ResResult(
    val data: Int,
    val message: String? = "",
    val success: Boolean
)