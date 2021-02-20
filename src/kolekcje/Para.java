package kolekcje;

public class Para<T1, T2> {
    public T1 getParametr1() {
        return parametr1;
    }

    public T2 getParametr2() {
        return parametr2;
    }

    T1 parametr1;
    T2 parametr2;
    public Para(T1 t1, T2 t2) {
        this.parametr1 = t1;
        this.parametr2 = t2;
    }

}
