package com.lyrnics.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "artist" )
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Getter
    @Setter
    @Column( name = "name" )
    private String name;

    @Getter
    @Setter
    @Column( name = "code" )
    private String code;
    
    @Getter
    @Setter
    @OneToMany( mappedBy = "artist", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Song> songs;

    @Override
    public String toString() {
        return "Artist [id=" + id + ", name=" + name + ", code=" + code + ", songs=" + songs + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( code == null ) ? 0 : code.hashCode() );
        result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        result = prime * result + ( ( songs == null ) ? 0 : songs.hashCode() );
        return result;
    }//END hashCode

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Artist other = (Artist) obj;
        if ( code == null ) {
            if ( other.code != null )
                return false;
        } else if ( !code.equals( other.code ) )
            return false;
        if ( id == null ) {
            if ( other.id != null )
                return false;
        } else if ( !id.equals( other.id ) )
            return false;
        if ( name == null ) {
            if ( other.name != null )
                return false;
        } else if ( !name.equals( other.name ) )
            return false;
        if ( songs == null ) {
            if ( other.songs != null )
                return false;
        } else if ( !songs.equals( other.songs ) )
            return false;
        return true;
    }// END equals()

}// END class
