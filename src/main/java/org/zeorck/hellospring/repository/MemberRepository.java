package org.zeorck.hellospring.repository;

import org.springframework.stereotype.Repository;
import org.zeorck.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
