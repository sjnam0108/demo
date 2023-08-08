package com.hstar.firstkopring.demo.service


import com.hstar.firstkopring.demo.dto.LogRequestDto

import com.hstar.firstkopring.demo.entity.LogRequest
import com.hstar.firstkopring.demo.repository.LogRequestRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LogRequestService @Autowired constructor(
    val logRequestRepository: LogRequestRepository,
    val modelMapper: ModelMapper

    ) {
    fun save(logRequestDto: LogRequestDto): Long {

        val target: LogRequest? = null
        target?.createAt = logRequestDto.createAt
        target?.storeId = logRequestDto.storeId
        target?.deviceId = logRequestDto.deviceId
        target?.extraMsg = logRequestDto.extraMsg
        target?.lastLoginAt = logRequestDto.lastLoginAt

        return logRequestRepository.save(modelMapper.map(logRequestDto, LogRequest::class.java)).id
    }

//    fun getPost(id: Long): LogRequest? {
//        return logRequestRepository.findById(id).get()
 //   }

 //   fun deletePost(id: Long) {
 //       logRequestRepository.deleteById(id)
 //   }

 //   fun getPostList(): List<LogRequest> {
  //      return logRequestRepository.findAll()
  //  }

}