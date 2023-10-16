package com.example.database

import com.typesafe.config.ConfigFactory
import io.ktor.server.config.*
import org.jetbrains.exposed.sql.Database

val config = HoconApplicationConfig(ConfigFactory.load())
val database = Database.connect(
    url = config.property("ktor.database.url").getString(),
    driver = config.property("ktor.database.driver").getString(),
    user = config.property("ktor.database.user").getString(),
    password = config.property("ktor.database.password").getString()
)