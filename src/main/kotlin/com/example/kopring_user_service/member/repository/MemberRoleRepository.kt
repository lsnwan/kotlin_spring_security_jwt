package com.example.kopring_user_service.member.repository

import com.example.kopring_user_service.member.entity.MemberRole
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRoleRepository : JpaRepository<MemberRole, Long> {
}