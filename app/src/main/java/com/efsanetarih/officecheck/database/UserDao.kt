package com.efsanetarih.officecheck.database



import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.efsanetarih.officecheck.model.CheckList

@Dao
interface UserDao {

    @get:Query("SELECT * FROM CheckList")
    val getUser: LiveData<List<CheckList?>?>?

    @Insert
    fun insertUserAndList(checked: CheckList?)

    @Query("DELETE FROM CheckList")
    fun deleteUser()



}