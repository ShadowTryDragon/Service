package de.szut.artikelservice.controller;

import de.szut.artikelservice.service.ArtikelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myappdata(articles")
public class ArtikelController {
    private ArtikelService artikelService;

    public ArtikelController(
    ) {
        artikelService = new ArtikelService();
    }


}
