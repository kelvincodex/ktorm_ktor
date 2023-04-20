package com.ktorm_database

import com.ktorm_database.config.Database
import com.ktorm_database.model.entity.NoteEntity
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.ktorm_database.plugins.*
import org.ktorm.dsl.from
import org.ktorm.dsl.insert
import org.ktorm.dsl.select

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureRouting()

     val conn = Database().connectDatabase

//     conn.insert(NoteEntity){
//       set(it.name, "Samsung")
//       set(it.content, "Samsung is one of the foreign design")
//   }
   val notes =  conn.from(NoteEntity).select()

    for (row in notes){
        println("id. ${row[NoteEntity.id]}  name: ${row[NoteEntity.name]} content: ${row[NoteEntity.content]} status: ${row[NoteEntity.status]}")
    }
}
