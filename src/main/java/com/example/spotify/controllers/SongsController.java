package com.example.spotify.controllers;

import com.example.spotify.data.SongRepository;
import com.example.spotify.models.Musica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/songs")
public class SongsController {
    private final SongRepository songsRepository;


    public SongsController(SongRepository songsRepository) {
        this.songsRepository=songsRepository;
    }

    @GetMapping
    public String getAllSongs(Model model) {
        model.addAttribute("songs", songsRepository.findAll());
        System.out.println("Ciao ");
        return "songs"; // Name of the template
    }

    
}
