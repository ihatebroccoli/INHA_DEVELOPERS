package com.inha16.project.hospitalreservation.domain.member;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Embedded
    private Address address;
    private String name;
    private Long age;
    private Sex sex;
    @Lob
    private String underlyingDisease;

}
