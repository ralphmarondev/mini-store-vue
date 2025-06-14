package com.ralphmarondev.ministore.auth.controller

import com.ralphmarondev.ministore.auth.model.User
import com.ralphmarondev.ministore.auth.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(
    private val repository: UserRepository
) {

    @PostMapping
    fun create(@RequestBody user: User): User {
        return repository.save(user)
    }

    @GetMapping
    fun getAll(): List<User> {
        return repository.findAll()
    }
}