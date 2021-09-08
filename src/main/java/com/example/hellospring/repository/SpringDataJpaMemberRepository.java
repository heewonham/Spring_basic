package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,MemberRepository {

    // JPQL select m from Member m where m.name = ?
    // Optional<Member> findByNameAndId(String name, Long id);
    @Override
    Optional<Member> findByName(String name);
}
