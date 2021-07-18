package com.efsanetarih.officecheck.model


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "CheckList")
class CheckList {

    @ColumnInfo(name = "answers")
    var answers: String = ""
    
}