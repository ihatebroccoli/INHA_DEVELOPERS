package com.inha16.project.hospitalreservation;

import com.inha16.project.hospitalreservation.domain.member.Member;
import com.inha16.project.hospitalreservation.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
테스트용
돌렸을때 db에 올라가는지 직접확인
*/

@SpringBootApplication
public class Sample implements CommandLineRunner {
    @Autowired
    private MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(Sample.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Member member = new Member();
        member.setName("iiih");
        memberRepository.save(member);
    }
}
