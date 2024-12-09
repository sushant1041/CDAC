package Autowiring.UsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("ad1") // Qualifier Checks the bean first the name "ad1" is present or not
    Address ad;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ad=" + ad +
                '}';
    }
//    @Autowired
    public Emp(Address ad) {
        this.ad = ad;
    }

    public Address getAd() {
        return ad;
    }

//    @Autowired
    public void setAd(Address ad) {
        this.ad = ad;
    }
}
