package de.szut.artikelservice.repository;

import de.szut.artikelservice.model.Artikel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArtikelDAO {
    private Map <Long, Artikel> artikelMap = new HashMap<>();

    public void insert( Artikel artikel ) {
        if (artikelMap.containsKey(artikel.getId())) System.out.println( "Nö"
        );
        else artikelMap.put(artikel.getId(),artikel);
    }
    public Artikel findbyID(long artikelID) {
        if (artikelMap.containsKey(artikelID)) { {
            return artikelMap.get(artikelID);
        }
        }
    return artikelMap.get(artikelID);}

public List<Artikel> findAll() {
        return artikelMap.values().stream().toList();
}
public void update(Artikel artikel) {
        if (!artikelMap.containsKey(artikel.getId())) {
            System.out.println("Nö");
        }
        else artikelMap.replace(artikel.getId(), artikel);
}
public void delete(long id) {
        if (artikelMap.containsKey(id))
            artikelMap.remove(id);

}
    }

