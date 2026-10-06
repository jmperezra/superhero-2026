package edu.iesam.superhero.feature.users.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.users.domain.GetUsersUseCase

class ListViewModel(private val getUsersUseCase: GetUsersUseCase) : ViewModel() {


    fun getUsers() = getUsersUseCase.invoke()


    //fun getUsers1() = getUsersUseCase()


}