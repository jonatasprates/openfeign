package com.example.openfeign.controller;

import com.example.openfeign.Dto.AlbumsDto;
import com.example.openfeign.service.AlbumsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/albums")
public class AlbumsController {

    private final AlbumsService albumsService;

    @GetMapping
    public List<AlbumsDto> getAllAlbums(){
        return albumsService.getAllAlbums();
    }

    @GetMapping("/{id}")
    public AlbumsDto getByIdAlbums(@PathVariable Long id) {
        return albumsService.getByIdAlbums(id);
    }
}
