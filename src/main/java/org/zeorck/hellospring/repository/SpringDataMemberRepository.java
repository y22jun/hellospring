package org.zeorck.hellospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zeorck.hellospring.domain.Member;

import java.util.Optional;

public interface SpringDataMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
