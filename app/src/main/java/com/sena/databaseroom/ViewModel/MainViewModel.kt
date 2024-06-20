package com.sena.databaseroom.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sena.databaseroom.Data.Entitys.UserEntity
import com.sena.databaseroom.application.RoomApplication
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    fun insertUser() {
        val userEntity = UserEntity(firstName = "Valeria", lastName = "González")
        viewModelScope.launch(Dispatchers.IO) {
            RoomApplication.db.userDao().insertUser(userEntity)
        }
    }

    fun insertUserList() {
        val users = listOf(
            UserEntity(firstName = "Valentina", lastName = "González"),
            UserEntity(firstName = "Julieta", lastName = "Salgado"),
            UserEntity(firstName = "Enoris", lastName = "Gómez")
        )
        viewModelScope.launch(Dispatchers.IO) {
            RoomApplication.db.userDao().insertUserList(users)
        }
    }
}
