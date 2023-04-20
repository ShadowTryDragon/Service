package de.szut.artikelservice.controller;

import de.szut.artikelservice.model.Artikel;
import de.szut.artikelservice.service.ArtikelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myappdata/articles")
public class ArtikelController {
    private ArtikelService artikelService;

    public ArtikelController(
    ) {
        artikelService = new ArtikelService();
        Artikel a1 = new Artikel(1,"Corsair HS80 Wireless","Gutes Headset",120,140);


    }

    @GetMapping()
    public ResponseEntity<List<Artikel>> getArtikel() {
        List<Artikel> artikelList = artikelService.read();
        return new ResponseEntity<>(artikelList, HttpStatus.OK);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Artikel>> getArtikel(@PathVariable long id) {
        List<Artikel> artikelList = artikelService.read();
        return new ResponseEntity<>(artikelList, HttpStatus.OK);
    }
@PostMapping
    public ResponseEntity<Artikel> addArtikel(@RequestBody Artikel request) {
        Artikel artikel = artikelService.add(request);
        return new ResponseEntity<>(artikel, HttpStatus.OK);
    }

    public ResponseEntity<?> updateArtikel(@RequestBody Artikel request) {
        artikelService.update(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}" )
    public ResponseEntity<?> deleteArtikel(@PathVariable long id) {
        artikelService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
