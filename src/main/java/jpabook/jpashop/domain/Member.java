package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // 내장타입 @Embeddable 둘 중 하나만 써도 됨
    private Address address;

    @OneToMany(mappedBy = "member") //member에서 매핑됨
    private List<Order> orders = new ArrayList<>();
}