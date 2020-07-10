package com.lyrnics.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "song" )
public class Song implements Serializable {

    private static final long serialVersionUID = -3860680593022035021L;

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "title", nullable = false )
    private String title;

    @Column( name = "code", nullable = false )
    private String code;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "artist_id", nullable = false, foreignKey = @ForeignKey( name = "fk_artist_id" ) )
    private Artist artist;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist( Artist artist ) {
        this.artist = artist;
    }

}// END class