package com.example.openfeign.service;

import com.example.openfeign.Dto.AlbumsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlbumsService implements  AlbumsServiceImpl{

    private final AlbumsServiceImpl albumsServiceImpl;

    @Override
    public List<AlbumsDto> getAllAlbums() {
        return albumsServiceImpl.getAllAlbums();
    }

    @Override
    public AlbumsDto getByIdAlbums(Long id) {
        return albumsServiceImpl.getByIdAlbums(id);
    }
}
