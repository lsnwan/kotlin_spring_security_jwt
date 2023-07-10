package com.example.kopring_user_service.member.entity

import com.example.kopring_user_service.common.status.Role
import jakarta.persistence.*

@Entity
class MemberRole (
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column(nullable = false, length = 30)
  @Enumerated(EnumType.STRING)
  val role: Role,

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(foreignKey = ForeignKey(name = "fk_member_role_member_id"))
  val member: Member

) {




}