import org.testng.annotations.Test;

public class TestTaxi {

    @Test
    public void Testkolichestvo(){
     Taxi AUDI = new Taxi(4, 234, 8, 4);
     AUDI.calcKolichestvoHodok();

        Taxi AlfaRomeo = new Taxi(4, 134, 5, 6);
        AlfaRomeo.calcKolichestvoHodok();

        Taxi BMW = new Taxi(6, 545, 8, 8);
        BMW.calcKolichestvoHodok();

        Taxi Renault = new Taxi(4, 56, 10, 4);
        Renault.calcKolichestvoHodok();
    }
}
