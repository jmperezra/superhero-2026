package edu.iesam.superhero.feature.users.domain

interface UserRepository {

    fun obtainUsers() : List<User>
}