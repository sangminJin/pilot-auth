package com.estsoft.pilotauth.global.domain.member.repository;

import com.estsoft.pilotauth.global.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
