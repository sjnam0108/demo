package com.hstar.firstkopring.demo.repository

import com.hstar.firstkopring.demo.entity.LogEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LogRepository : JpaRepository<LogEntity, Long> {
    //TODO: jpa형식으로 생성!! ex) findByPackageName
}