package com.example.application

import com.example.application.domain.exception.OrderException
import com.example.application.domain.model.entity.Order
import com.example.infrastructure.repository.OrderRepository
import io.micronaut.context.annotation.Primary
import javax.inject.Singleton

@Singleton
@Primary
class OrderRepositoryStub : OrderRepository {
    override fun saveOrder(order: Order): Order {
        if (order.type == "food") {
            return order
        } else {
            throw OrderException()
        }
    }
}