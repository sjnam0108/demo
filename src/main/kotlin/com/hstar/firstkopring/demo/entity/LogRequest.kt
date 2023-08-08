package com.hstar.firstkopring.demo.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "logRequest")
data class LogRequest(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "TYPE")
    val type: String?,   // 로그 타입 : 로그인, 결제, 주문 등등..
    @Column(name = "STORE_ID")
    val storeId: Int?,
    @Column(name = "DEVICE_ID")
    val deviceId: String?,
    @Column(name = "CREATE_AT")
    val createAt: Date?, // 로그 발생시간 - server
    @Column(name = "LAST_LOGIN_AT")
    val lastLoginAt: Date?, // 최근 로그 발생 시간(업데이트 개념) - server
    @Column(name = "EXTRA_MSG")
    val extraMsg: String?, // "성공 여부, 실패시 실패 메시지 전송"
    @Column(name = "EXTRA_DATA")
    val extraData: String?  // 추가 데이터 키:밸류 ex) 결제데이터 - <payment, List<MenuObject>>
) {

}