package kolekcje;

import java.time.LocalDate;

public abstract class Istota {
    protected String typ;
    private LocalDate dataUrodzenia;
    public  Istota() {}
    public Istota(String data)
    {
        setDataUrodzenia(data);
        typ = "I";
    }
    public String getDataUrodzenia()
    {
        return dataUrodzenia.getYear() + "-" + dataUrodzenia.getMonthValue() + "-" + dataUrodzenia.getDayOfMonth();
    }
    public void setDataUrodzenia(String data)
    {
        String[] kawalki = data.split("-");
        dataUrodzenia = dataUrodzenia.of(Integer.parseInt(kawalki[0]), Integer.parseInt(kawalki[1]), Integer.parseInt(kawalki[2]));
    }
    public abstract String getTyp();
    public abstract void setTyp(String typ);
}

