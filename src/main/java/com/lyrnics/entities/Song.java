package com.lyrnics.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "song" )
public class Song implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Getter
    @Setter
    @Column( name = "title" )
    private String title;

    @Getter
    @Setter
    @Column( name = "code" )
    private String code;
    
    @Getter
    @Setter
    @OneToOne
    private Artist artist;

}//END class
