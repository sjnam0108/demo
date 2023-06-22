package com.hstar.firstkopring.demo.entity

import jakarta.persistence.*

@Entity
@Table(name = "logs")
class LogEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        @Column(name = "package_name")
        var packageName: String = "",
        @Column(name = "version")
        val version: String = "",
        @Column(name = "error_body")
        val errorBody: ErrorBody
) {
    constructor(): this(packageName = "", version = "", errorBody = ErrorBody())    //TODO: jpa 에서 사용하려면 기본생성자를 추가해야하는지 확인?
}

data class ErrorBody(
        @Column(name = "create_at")      // 발생 시간
        val createAt: String? = null,
        @Column(name = "error_msg")     // 원인
        val errorMsg: String? = null,
        @Column(name = "caused_at")     // 발생 지점(함수명..)
        val causedAt: String? = null,
        @Column(name = "extra_data")     // 발생 지점(함수명..)
        val extraData: Any? = null,
)

