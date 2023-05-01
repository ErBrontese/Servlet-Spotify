
package com.example.spotify.data;


import  com.example.spotify.models.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface SongRepository extends JpaRepository<Musica,Long> {
    // Methods to search for name
    List<Musica> findByName(String name);

}
