package de.szut.artikelservice.model;

public class Artikel {
    private  long Id;
    private String bezeichnung;
    private  String beschreibung;
    private  double preisEK;
    private double preisVK;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreisEK() {
        return preisEK;
    }

    public void setPreisEK(double preisEK) {
        this.preisEK = preisEK;
    }

    public double getPreisVK() {
        return preisVK;
    }

    public void setPreisVK(double preisVK) {
        this.preisVK = preisVK;
    }

    public Artikel() {
    }

    public Artikel(long id, String bezeichnung, String beschreibung, double preisEK, double preisVK) {
        Id = id;
        this.bezeichnung = bezeichnung;
        this.beschreibung = beschreibung;
        this.preisEK = preisEK;
        this.preisVK = preisVK;
    }
}

