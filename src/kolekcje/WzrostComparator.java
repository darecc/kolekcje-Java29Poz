package kolekcje;

import java.util.Comparator;

public class WzrostComparator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getWzrost() - o2.getWzrost();
    }
}
