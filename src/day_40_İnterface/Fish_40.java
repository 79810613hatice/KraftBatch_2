package day_40_İnterface;

public class Fish_40 implements Animal_40,Food_40{  // Multi İnheradent
 // Animal class ına implements olmasa bile her iki methodo implement
 // yapmak zorunda.Hiyerarşik olarak bağlı
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
class chicken implements Food_40{
// chicken class ı hiyerarşik olarak iki interface bağlı
// olduğu için tüm abstract metodların implemetasyonlarını yapmak zorunda
    @Override
    public void meal() {

    }

    @Override
    public void hunt() {

    }
}