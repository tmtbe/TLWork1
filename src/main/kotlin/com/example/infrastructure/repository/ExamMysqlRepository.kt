package com.example.infrastructure.repository

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import javax.persistence.Entity
import javax.persistence.Id

@Repository
@JdbcRepository(dialect = Dialect.H2)
interface ExamMysqlRepository : CrudRepository<ExamRecord, Long> {

}

@Entity
data class ExamRecord(
        @Id
        @GeneratedValue
        var id: Long)