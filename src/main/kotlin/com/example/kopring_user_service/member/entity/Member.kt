package com.example.kopring_user_service.member.entity

import com.example.kopring_user_service.common.status.Gender
import com.example.kopring_user_service.member.dto.MemberDtoResponse
import jakarta.persistence.*
import java.text.SimpleDateFormat
import java.util.Date

@Entity
@Table(
  uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])]
)
class Member(

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column(nullable = false, length = 30, updatable = false)
  val loginId: String,

  @Column(nullable = false, length = 100)
  val password: String,

  @Column(nullable = false, length = 10)
  val name: String,

  @Column(nullable = false)
  @Temporal(TemporalType.DATE)
  val birthDate: Date,

  @Column(nullable = false, length = 5)
  @Enumerated(EnumType.STRING)
  val gender: Gender,

  @Column(nullable = false, length = 30)
  val email: String,

  ) {

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
  val memberRole: List<MemberRole>? = null

  private fun Date.formatDate(): String = SimpleDateFormat("yyyy-MM-dd").format(this)

  fun toDto(): MemberDtoResponse =
    MemberDtoResponse(id!!, loginId, name, birthDate.formatDate(), gender.desc, email)
}