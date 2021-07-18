package com.efsanetarih.officecheck.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tbl_user")
class User {

    @ColumnInfo(name = "userId")
    var userId: String = ""

    @ColumnInfo(name = "username")
    var username: String = ""

    @ColumnInfo(name = "name")
    var name: String = ""

    @ColumnInfo(name = "surname")
    var surname: String = ""



    @ColumnInfo(name = "date")
    var date: String = ""

    @ColumnInfo(name = "officeNumber")
    var officeNumber: Int = 0

    @ColumnInfo(name = "password")
    var password: String = ""

}