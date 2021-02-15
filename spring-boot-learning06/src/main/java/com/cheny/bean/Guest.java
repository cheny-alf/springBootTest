package com.cheny.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Data@Entity
@NoArgsConstructor@AllArgsConstructor
public class Guest implements Serializable {

    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String role;

}
