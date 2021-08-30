package com.inha16.project.hospitalreservation.repository;

import com.inha16.project.hospitalreservation.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


public interface MemberRepository extends JpaRepository<Member,Long> {
}
