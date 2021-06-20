package com.example.openfeign.service;

import com.example.openfeign.Dto.AlbumsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "endPoint-Albums", url = "${openfeign.url}")
public interface AlbumsServiceImpl {

    @GetMapping("/albums")
    List<AlbumsDto> getAllAlbums();

    @GetMapping("/albums/{id}")
    AlbumsDto getByIdAlbums(@PathVariable("id") Long id);

}
