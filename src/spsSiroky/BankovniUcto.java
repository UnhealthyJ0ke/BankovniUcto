package spsSiroky;

public class BankovniUcto {
    private final String cisloUctu;
    private String jmenoDrzitele;
    private double stavUctu;

    public BankovniUcto(String cisloUctu, String jmenoDrzitele, double stavUctu) {
        this.cisloUctu = cisloUctu;
        this.jmenoDrzitele = jmenoDrzitele;
        this.stavUctu = stavUctu;
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public String getJmenoDrzitele() {
        return jmenoDrzitele;
    }

    public double getStavUctu() {
        if (stavUctu < 0){
            System.out.println("váš účet je v mínusu... Jste exekutován.");
            return stavUctu - 999999999;
        }else {
            return stavUctu;
        }
    }

    public void setStavUctu(double stavUctu) {
        this.stavUctu = ++stavUctu -1;
    }

    public void vypisInfo(){
        System.out.println("číslo účtu: " +cisloUctu);
        System.out.println("Jméno držitele: " + jmenoDrzitele);
        System.out.println("Aktuální stav účtu: " + stavUctu);
    }
}
