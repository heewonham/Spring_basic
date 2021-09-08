package com.example.hellospring.domain;

import javax.persistence.*;

// jpa 가 관리하는 entity가 됨.
@Entity
public class Member {

    // DB가 알아서 생성해주는 것 - Identity
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
