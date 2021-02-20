package kolekcje;

import java.time.LocalDate;
import java.util.Comparator;

public class Osoba extends Istota {

    private String imie;
    private String nazwisko;
    private int wzrost;
    private LocalDate dataUrodzenia;

    public Osoba(String imie, String nazwisko, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
    }
    public Osoba(String imie, String nazwisko, int wzrost, int dzien, int miesiac, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
    }
    public Osoba(String imie, String nazwisko, int wzrost, LocalDate data) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.dataUrodzenia = data;
    }
    public int getRok() {
        return dataUrodzenia.getYear();
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public int getWzrost()
    {
        return wzrost;
    }
    public void setWzrost(int wzrost)
    {
        this.wzrost = wzrost;
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
        wzrost = 0;
    }
    public String toString()
    {
        return getImie() + " " + nazwisko + " " + wzrost + " " + dataUrodzenia.toString();
    }
    @Override
    public String getTyp()
    {
        return "Osoba";
    }
    @Override
    public void setTyp(String typ)
    {
        this.typ = typ;
    }
    public String getImie() {
        return imie;
    }
}
