package com.lyrnics.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "artist" )
public class Artist implements Serializable {

    private static final long serialVersionUID = 6858589886828114978L;

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY, generator = "native" )
    private Long id;

    @Column( name = "name", nullable = false )
    private String name;

    @Column( name = "code", nullable = false )
    private String code;

    @OneToMany( targetEntity = Song.class, mappedBy = "artist", fetch = FetchType.LAZY )
    private List<Song> songs;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs( List<Song> songs ) {
        this.songs = songs;
    }

}// END class