package com.Jocata.IDfy.DATAMODEL;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="f_name")
    private String f_name;

    @Column(name="l_name")
    private String l_name;

    @Column(name="email")
    private String email;



}
