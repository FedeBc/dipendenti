package Prova_eclipse;

public class Dipendenti {
    private String matricola;
    private float stipendio; 
    private float straordinario;
    
    //costruttore
    public Dipendenti(String m, float s, float ext)
    {
        matricola = m;
        stipendio = s;
        straordinario = ext;
}
    
     public float getStipendio()
    {
        return stipendio;
    }

    public float paga(int ore)
    {
        float tot = stipendio + ore * straordinario;
        return tot;
    }
    
    public void stampa(){
        System.out.println(matricola);
        System.out.println(stipendio);
        System.out.println(straordinario);
    }
}