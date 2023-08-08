package com.hstar.firstkopring.demo.repository

import com.hstar.firstkopring.demo.entity.LogEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface LogRepository : JpaRepository<LogEntity, Any> {
    //TODO: jpa형식으로 생성!! ex) findByPackageName

}