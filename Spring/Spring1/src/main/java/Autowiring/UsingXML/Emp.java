package Autowiring.UsingXML;

public class Emp {
    Address ad;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ad=" + ad +
                '}';
    }

    public Emp(Address ad) {
        this.ad = ad;
    }

    public Address getAd() {
        return ad;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }
}
