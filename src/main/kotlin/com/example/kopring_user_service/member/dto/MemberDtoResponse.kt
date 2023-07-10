package com.example.kopring_user_service.member.dto

data class MemberDtoResponse(
  val id: Long,
  val loginId: String,
  val name: String,
  val birthDate: String,
  val gender: String,
  val email: String,
)
