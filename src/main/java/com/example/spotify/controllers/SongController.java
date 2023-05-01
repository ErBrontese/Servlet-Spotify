package com.example.spotify.controllers;

import com.example.spotify.data.SongRepository;
import com.example.spotify.models.Musica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/song")
public class SongController {
    private final SongRepository songRepository;

    public SongController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @GetMapping(path = "/home")
    public String returnHome(Model model) {
        return "/home";
    }

    // Richiesta del form tramite la GET
    @GetMapping
    public String songForm(Model model) {
        model.addAttribute("song", new Musica());
        return "song"; // Invoke ThymeLeaf template
    }

    @GetMapping(path = "/{id}")
    public String getCar(Model model, @PathVariable Long id) {
        model.addAttribute("song", songRepository.getReferenceById(id));
        return "/song";
    }

    @GetMapping(path = "/delete/{id}")
    public String deleteCar(Model model, @PathVariable Long id){
        Musica song = songRepository.getReferenceById(id);
        songRepository.delete(song);
        return "/home";
    }

    @PostMapping
    public String songSubmit(@ModelAttribute Musica musica, Model model) {
        Musica save = songRepository.save(musica);// Save the new student to database
        model.addAttribute("song", save);
        return "newSongResult"; // Invoke ThymeLeaf template
    }

}
