package kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class OdwracanieKolejki {
    public static void main(String[] args) {
        // kolejka = FIFO
        // a b c d
        // stos: a b c d -> d c b a
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("a");
        kolejka.add("b");
        kolejka.add("c");
        kolejka.add("d");
        Stack<String> stos = new Stack<>();
        while(!kolejka.isEmpty())
            stos.push(kolejka.poll());
        // wstawienie do kolejki zawartości stosu
        while(!stos.isEmpty())
            kolejka.add(stos.pop());
        //wyświetlenie kolejki
        while(!kolejka.isEmpty())
            System.out.println(kolejka.poll());
    }
}
