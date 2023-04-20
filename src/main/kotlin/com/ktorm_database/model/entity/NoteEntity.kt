package com.ktorm_database.model.entity

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar


object NoteEntity: Table<Nothing>("note") {
    var id = int("id").primaryKey()
    var name = varchar("name")
    var content = varchar("content")
    var status = varchar("status")
}