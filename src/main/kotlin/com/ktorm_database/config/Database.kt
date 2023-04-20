package com.ktorm_database.config

import org.ktorm.database.Database

open class Database{
      val connectDatabase = Database.connect(
        url = "jdbc:mysql://localhost:3306/ktorm_database",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "password"
        )
}
