import org.testng.annotations.Test;

public class PhoneTest {


    @Test
    public void testPhone() {
        Phone phone = new Phone("+7971234567", "MOTOROLA", 240);
        phone.vivod();
        phone.receiveCall("Kruz");
        phone.isNumberUkrainian();

        Phone phone1 = new Phone("+380931234567", "SONY");
        phone1.vivod();
        phone1.receiveCall("Emely");
        phone1.isNumberUkrainian();

        Phone phone2 = new Phone();
        phone2.vivod();
        phone2.receiveCall("Dima");
    }
}