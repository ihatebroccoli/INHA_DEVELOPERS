package com.inha16.project.hospitalreservation.domain.reservation;

import com.inha16.project.hospitalreservation.domain.member.Member;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    private LocalDateTime reservationDate;
}
