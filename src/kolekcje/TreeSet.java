package kolekcje;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        //uporzodkowany zbior TreeSet
    // struktura (drzewiasta) utrzymujaca porzadek (posortowana)
      	System.out.print("Przyklad zbioru TreeSet: ");
     TreeSet<String> zbior = new java.util.TreeSet<String>();
      	zbior.add("kaczka");
      	zbior.add("królik");
      	zbior.add("perkoz");
      	zbior.add("sarna");
      	zbior.add("orlik");
      	zbior.add("bocian");
      	zbior.add("zebra");
      	for(String s : zbior)
            System.out.print("[" + s + "] ");
      	System.out.println();
    java.util.TreeSet<Osoba> osoby = new java.util.TreeSet<Osoba>(new NazwiskoComparator());
      	osoby.add(new Osoba("Jan", "Kowalski", 180));
      	osoby.add(new Osoba("Ana", "Jones", 176));
      	osoby.add(new Osoba("Ryszard", "Smuda", 168));
      	osoby.add(new Osoba("Greg", "Adams", 183));
      	osoby.add(new Osoba("Maria", "Szmit", 170));
      	osoby.add(new Osoba("Leon", "Ziutek", 171));
      	osoby.add(new Osoba("Renata", "Koliber", 166));
      	System.out.println("--- Teraz kolekcja TreeSet<Osoba> wg nazwisk");
      	for(Osoba o : osoby)
            System.out.println(o);
        TreeSet<Osoba> osoby2 = new java.util.TreeSet<Osoba>(new WzrostComparator());
      	osoby2.addAll(osoby);
      	System.out.println("--- Teraz kolekcja TreeSet<Osoba> wg wzrostu");
      	for(Osoba o : osoby2)
            System.out.println(o);
}
}
