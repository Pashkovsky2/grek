import org.testng.annotations.Test;

public class NewCar {
    //НАПИСАНИЕ В ДВА ЭТАПА
    @Test
    public void car() {
        Car BMW = new Car("BMW", "blue", "3.5");
        BMW.show();
    }
}
