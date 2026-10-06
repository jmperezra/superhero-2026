package edu.iesam.superhero.feature.users.data.local

import edu.iesam.superhero.feature.users.domain.User

class UserMemLocalDataSource {

    private val localUsers = mutableListOf(
        User("Pepito", "Doe", "12345678A"),
        User("Jane", "Smith", "87654321B"),
        User("Bob", "Johnson", "11223344C")
    )

    fun getAll() = localUsers
}