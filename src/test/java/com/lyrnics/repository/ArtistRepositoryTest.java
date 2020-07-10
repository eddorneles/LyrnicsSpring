package com.lyrnics.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.lyrnics.model.Artist;

@SpringBootTest
@ActiveProfiles( "test" )
public class ArtistRepositoryTest {

    private static final String artistName = "Imagine Dragons";
    private static final String artistCode = "imagine-dragons";
    
    @Autowired
    private ArtistRepository artistRepository;
    
    @BeforeEach
    void createArtist(){
        Artist artist = new Artist();
        artist.setCode( artistCode );
        artist.setName( artistName );
        this.artistRepository.save( artist );
    }//END createUser
    
    @AfterEach
    void deleteAll() {
        this.artistRepository.deleteAll();
    }

    @Test
    void findByName() {
        Artist artist = this.artistRepository.findByNameOrCode( artistName, "" ).get();
        assertEquals( artistName, artist.getName() );
    }//END findByName
    
    @Test
    void findByCode() {
        Artist artist = this.artistRepository.findByNameOrCode( "", artistCode ).get();
        assertEquals( artistCode, artist.getCode() );
    }//END findByCode

}//END class ArtistRepositoryTest
