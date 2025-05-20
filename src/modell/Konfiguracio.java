package modell;

import javax.swing.text.StyledEditorKit;

public class Konfiguracio {

    //ADATTAG
    private String nev;
    private boolean hirlevel;
    private int index;

    //TAGFUGVENY
    public Konfiguracio(String nev, int index, boolean hirlevel) {
        this.nev = nev;
        this.hirlevel = hirlevel;
        this.index = index;

    }

    public Konfiguracio(String teljesSor) {
        
        /* adatokkinyerese*/
        String[] adatok = teljesSor.split(" ");
        nev = adatok[0];
        index = Integer.parseInt(adatok[1]);
        hirlevel = Boolean.parseBoolean(adatok[2]);
    }

    

    public String getNev() {
        return nev;
    }

    public boolean isHirlevel() {
        return hirlevel;
    }

    public int getIndex() {
        return index;
    }

    /*Ez itt a projekt szoveges informácioja(reprezentácioja)  az ÁLLAPOT*/
    @Override//felulir(csak olyat tudsz ami benne  van az ös ben), csakk azt lehet ami benne van az objektbe, NEM KÖTELEZÖ nekem jelzés
    public String toString() {
        return "Konfiguracio{" + "nev=" + nev + ", hirlevel=" + hirlevel + ", index=" + index + '}';
    }

}
