package com.hstar.firstkopring.demo.repository

import com.hstar.firstkopring.demo.entity.LogRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LogRequestRepository : JpaRepository<LogRequest, Any> {
    //TODO: jpa형식으로 생성!! ex) findByPackageName

}