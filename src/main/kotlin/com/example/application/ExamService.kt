package com.example.application

import com.example.application.command.AnswerCommand
import com.example.domain.repository.ExamQuestionRepository
import com.example.domain.repository.ExamRepository
import javax.inject.Singleton

@Singleton
class ExamService(
        val examRepository: ExamRepository,
        val examQuestionRepository: ExamQuestionRepository,
        val labelService: LabelService,
        val studentService: StudentService
) {
    fun answer(examId: Int, questionId: Int, answerCommand: AnswerCommand) {
        return
    }
}