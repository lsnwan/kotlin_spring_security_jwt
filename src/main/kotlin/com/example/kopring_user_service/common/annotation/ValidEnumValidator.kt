package com.example.kopring_user_service.common.annotation

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class ValidEnumValidator: ConstraintValidator<ValidEnum, Any> {
  private lateinit var enumValues: Array<out Enum<*>>

  override fun initialize(annotation: ValidEnum) {
    enumValues = annotation.enumClass.java.enumConstants
  }

  override fun isValid(value: Any?, context: ConstraintValidatorContext?): Boolean {
    if (value == null) {
      return true
    }
    return enumValues.any {it.name == value.toString()}
  }
}