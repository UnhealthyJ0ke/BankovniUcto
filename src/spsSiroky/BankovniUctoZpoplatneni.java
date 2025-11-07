package spsSiroky;

public class BankovniUctoZpoplatneni extends BankovniUcto {

    public BankovniUctoZpoplatneni(String cisloUctu, String jmenoDrzitele, double stavUctu) {
        super(cisloUctu, jmenoDrzitele, stavUctu);
    }
    BankovniUctoZpoplatneni bUZ1 = new BankovniUctoZpoplatneni(getCisloUctu(),getJmenoDrzitele(),getStavUctu());

    @Override
    public String getCisloUctu() {
        return super.getCisloUctu();
    }

    @Override
    public String getJmenoDrzitele() {
        return super.getJmenoDrzitele();
    }

    @Override
    public double getStavUctu() {
        return super.getStavUctu();
    }

    @Override
    public void setStavUctu(double stavUctu) {
        super.setStavUctu(stavUctu);
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
    }
}
