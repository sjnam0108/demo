package com.hstar.firstkopring.demo.service

import com.hstar.firstkopring.demo.dto.LogFromDto
import com.hstar.firstkopring.demo.entity.LogEntity
import com.hstar.firstkopring.demo.repository.LogRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class logService @Autowired constructor(
        val logRepository: LogRepository,
        val modelMapper: ModelMapper,

) {
    fun save(logFromDto: LogFromDto): Long? {
        return logRepository.save(modelMapper.map(logFromDto, LogEntity::class.java)).id
    }
}