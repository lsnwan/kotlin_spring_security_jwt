package com.example.kopring_user_service.common.dto

import com.example.kopring_user_service.common.status.ResultCode

data class BaseResponse<T>(
  val resultCode: String = ResultCode.SUCCESS.name,
  val data: T? = null,
  val message: String = ResultCode.SUCCESS.msg,
)
