package com.hstar.firstkopring.demo.repository

import com.hstar.firstkopring.demo.entity.LogRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LogRequestRepository : JpaRepository<LogRequest, Any> {
    fun findByStoreIdAndDeviceId(storeId: Int, deviceId: String?): Optional<List<LogRequest?>>?
    fun findByType(type: String): Optional<List<LogRequest>>
    //fun findByStoreIdAndDeviceId(storeId: Int?, deviceId: String?): Optional<LogRequest?>?

}