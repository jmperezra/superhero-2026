package edu.iesam.superhero.feature.users.data

import edu.iesam.superhero.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.users.domain.User
import edu.iesam.superhero.feature.users.domain.UserRepository

class UserDataRepository(private val localDataSource: UserMemLocalDataSource) : UserRepository {

    override fun obtainUsers(): List<User> {
        return localDataSource.getAll()
    }
}