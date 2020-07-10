package com.lyrnics.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lyrnics.model.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    
    @Transactional( readOnly = true )
    Optional<Artist> findByNameOrCode(String name, String code );
    @Transactional( readOnly = true )
    Optional<Artist> findById(Long id);

}//END interface
