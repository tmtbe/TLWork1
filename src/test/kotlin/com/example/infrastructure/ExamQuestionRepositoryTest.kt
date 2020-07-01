package com.example.infrastructure

import com.example.infrastructure.repository.ExamQuestionRepositoryImpl
import io.kotlintest.specs.StringSpec
import io.micronaut.test.annotation.MicronautTest

@MicronautTest(environments = ["test"])
class ExamQuestionRepositoryTest(
        val examQuestionRepositoryImpl: ExamQuestionRepositoryImpl
) : StringSpec({
    "test"{

    }
})