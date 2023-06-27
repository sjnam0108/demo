package com.hstar.firstkopring.demo.dto

import com.hstar.firstkopring.demo.entity.ErrorBody
import jakarta.persistence.Column

data class LogFromDto(
        val id: Long = 0,
        var packageName: String = "",
        val version: String = "",
        val errorBody: ErrorBody
)

data class ErrorBodyFromDto(
        val createAt: String? = null,
        val errorMsg: String? = null,
        val causedAt: String? = null,
        val extraData: String? = null,
)

{
}