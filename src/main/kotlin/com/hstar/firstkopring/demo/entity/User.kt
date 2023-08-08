package com.hstar.firstkopring.demo.entity

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name="User")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "USER_NAME")
    var username: String = "",

    @Column(name = "FAMILIAR_NAME")
    val familiaName: String = "",

    @Column(name = "SALT")
    var salt: String = "",

    @Column(name = "PASSWORD")
    val password: String = "",

    @Column(name = "EFFECTIVE_START_DATE")
    val effectiveStartDate: Date,

    @Column(name = "EFFECTIVE_END_DATE")
    var effectiveEndDate: Date,

    @Column(name = "CREATION_DATE")
    val whoCreationDate: Date,

    @Column(name = "LAST_UPDATE_DATE")
    var whoLastUpdateDate: Date,

    @Column(name = "CREATED_BY")
    val whoCreatedBy: Date,

    @Column(name = "LAST_UPDATED_BY")
    var whoLastUpdatedBy: Int = 0,

    @Column(name = "LAST_UPDATE_LOGIN")
    val whoLastUpdateLogin: Int = 0,

) {

}