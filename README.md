/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federica
 */
public class Dipendente {
    private String matricola;
    private float stipendio; 
    private float straordinario;
    
    //costruttore
    public Dipendente(String m, float s, float ext)
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
