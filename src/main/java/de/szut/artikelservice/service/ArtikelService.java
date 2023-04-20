package de.szut.artikelservice.service;

import de.szut.artikelservice.repository.ArtikelDAO;
import de.szut.artikelservice.model.Artikel;

import java.util.List;

public class ArtikelService {

    private ArtikelDAO artikelDAO;

    public ArtikelService() {
        this.artikelDAO = new ArtikelDAO();
    }
    public Artikel add( Artikel artikel) {
        artikelDAO.insert(artikel);
        return artikelDAO.findbyID(artikel.getId());
    }
    public Artikel read(long id) {
        return  artikelDAO.findbyID(id);
    }
    public List<Artikel> read() {
        return artikelDAO.findAll();
    }
    public Artikel update(Artikel artikel) {
        artikelDAO.update(artikel);
        return artikelDAO.findbyID(artikel.getId());
    }
    public Artikel delete(long id) {
        artikelDAO.delete(id);
        return artikelDAO.findbyID(id);
    }


}



