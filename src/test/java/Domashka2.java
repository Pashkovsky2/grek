import org.testng.annotations.Test;

public class Domashka2 {
    @Test
    public void test() {
        days(5);
    }

    public void days(int a) {
        if (a == 1) {
            System.out.println("Понедельник");
        }
        if (a == 2) {
            System.out.println("Вторник");

        }
        if (a == 3) {
            System.out.println("Среда");
        }
        if (a == 4) {
            System.out.println("Четверг");
        }
        if (a == 5) {
            System.out.println("Пятница");
        }
        if (a == 6) {
            System.out.println("Субота");
        }
        if (a == 7) {
            System.out.println("Воскресенье");
        } else if (a > 7) {
            System.out.println("Нет такого дня в неделе");
        }
    }
}

