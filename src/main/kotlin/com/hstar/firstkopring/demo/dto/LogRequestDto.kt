package com.hstar.firstkopring.demo.dto

import java.util.*

data class LogRequestDto(
    val type: String?,   // 로그 타입 : 로그인, 결제, 주문 등등..
    val storeId: Int?,
    val deviceId: String?,
    val createAt: Date?, // 로그 발생시간 - server
    val lastLoginAt: Date?, // 최근 로그 발생 시간(업데이트 개념) - server
    val extraMsg: String?, // "성공 여부, 실패시 실패 메시지 전송"
    val extraData: String?  // 추가 데이터 키:밸류 ex) 결제데이터 - <payment, List<MenuObject>>
) {


}