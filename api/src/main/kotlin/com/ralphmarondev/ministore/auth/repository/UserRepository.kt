package com.ralphmarondev.ministore.auth.repository

import com.ralphmarondev.ministore.auth.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>