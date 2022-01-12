import org.testng.annotations.Test;

public class TestPerson {

    @Test
    public void test() {
        Person one = new Person("Бузов Сергей ", 54);
        one.showmove();
        Person two = new Person();
        two.showtalk();

    }
}
