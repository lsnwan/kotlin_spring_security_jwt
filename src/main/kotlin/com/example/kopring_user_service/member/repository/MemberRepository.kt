package com.example.kopring_user_service.member.repository

import com.example.kopring_user_service.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {

  fun findByLoginId(loginId: String): Member?

}