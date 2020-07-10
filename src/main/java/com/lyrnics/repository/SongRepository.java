package com.lyrnics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyrnics.model.Song;

public interface SongRepository extends JpaRepository<Song, Long>{

}
