package com.hstar.firstkopring.demo.dto

import com.hstar.firstkopring.demo.entity.LogRequest
import jakarta.persistence.Column
import java.util.*

data class LogRequestDto(
    @Column(insertable=false, updatable=false)
    val type: String?,   // 로그 타입 : 로그인, 결제, 주문 등등..
    @Column(insertable=false, updatable=false)
    val storeId: Int?,
    @Column(insertable=false, updatable=false)
    val deviceId: String?,
    @Column(insertable=false, updatable=false)
    var createAt: Date?,
    @Column(insertable=false, updatable=false)// 로그 발생시간 - server
    var lastLoginAt: Date?,
    @Column(insertable=false, updatable=false)// 최근 로그 발생 시간(업데이트 개념) - server
    val extraMsg: String?,
    @Column(insertable=false, updatable=false)// "성공 여부, 실패시 실패 메시지 전송"
    val extraData: String?  // 추가 데이터 키:밸류 ex) 결제데이터 - <payment, List<MenuObject>>
) {
    fun toEntity(): LogRequest {
        return LogRequest(
            type = type,
            storeId = storeId,
            deviceId = deviceId,
            createAt = createAt,
            lastLoginAt = lastLoginAt,
            extraMsg =  extraMsg,
            extraData =  extraData
        )
    }

}