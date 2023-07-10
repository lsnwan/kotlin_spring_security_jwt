package com.example.kopring_user_service.common.exception

class InvalidInputException(
  val fieldName: String = "",
  message: String = "Invalid Input"
) : RuntimeException(message)