package kolekcje;

import java.util.*;

public class Haszmapa {
    public static void main(String[] args) {
        String[] hobby1 = new String[]{"kino", "muzyka", "bilard"};
        String[] hobby2 = new String[]{"kino", "literatura", "taniec"};
        String[] hobby3 = new String[]{"tenis", "piłka nożna", "taniec", "brydż"};
        String[] hobby4 = new String[]{"literatura", "podróże", "muzyka", "żeglarstwo"};
        // HashMap<K,V>
        //region Załadowanie haszmapy
        HashMap<String, List<String>> hobby = new HashMap<>();
        hobby.put("Jan Kowalski", Arrays.asList(hobby1));
        hobby.put("Anna Nowak", Arrays.asList(hobby2));
        hobby.put("Karol Kłos", Arrays.asList(hobby3));
        hobby.put("Daria Marczułajtis", Arrays.asList(hobby4));
        //endregion

        //region Wyświetlenie haszmapy
        for (Map.Entry<String, List<String>> e : hobby.entrySet()) {
            String nazwisko = e.getKey();
            List<String> hob = e.getValue();
            System.out.print(nazwisko + " -> ");
            for (String s : hob)
                System.out.print(s + ", ");
            System.out.println();
        }
        //endregion

        //region Wyświetlnie hobby danej osoby
        List<String> hobbyOsoby = hobby.get("Anna Nowak");
        System.out.println("Hobby Anny Nowak:");
        for(String ss : hobbyOsoby)
            System.out.println(ss);
        //endregion

        //utworzenie haszmapy, w której klucz to hobby, a zestaw wartości to lista osób
        //region Odwrócenie haszmapy
        HashMap<String, List<String>> osoby = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : hobby.entrySet()) {
            String osoba = entry.getKey();
            List<String> lista = entry.getValue();
            for (String element : lista) {
                List<String> list = new ArrayList<>();
                if (osoby.containsKey(element)) {
                    list = osoby.get(element);
                    list.add(osoba);
                    osoby.put(element, list);
                } else {
                    list.add(osoba);
                    osoby.put(element, list);
                }
            }
        }
        //endregion
        //region Wyświetlenie haszmapy
        for (Map.Entry<String, List<String>> e : osoby.entrySet()) {
            String h = e.getKey();
            List<String> os = e.getValue();
            System.out.print(h + " -> ");
            for (String s : os)
                System.out.print(s + ", ");
            System.out.println();
        }
        //endregion
    }
}
