import org.testng.annotations.Test;

public class Domashka3 {
    @Test
    public void dom3() {
        month(12);

    }

    public void month(int a) {
        if (a == 1) {
            System.out.println("Январь , в этом месяце 31 день ");
        }
        if (a == 2) {
            System.out.println("Февраль , в этом месяце 28 дней ");
        }
        if (a == 3) {
            System.out.println("Март , в этом месяце 31 день ");
        }
        if (a == 4) {
            System.out.println("Апрель , в этом месяце 30 дней ");
        }
        if (a == 5) {
            System.out.println("Май , в этом месяце 31 день ");
        }
        if (a == 6) {
            System.out.println("Июнь , в этом месяце 30 дней ");
        }
        if (a == 7) {
            System.out.println("Июль , в этом месяце 31 день ");
        }
        if (a == 8) {
            System.out.println("Август , в этом месяце 31 дней ");
        }
        if (a == 9) {
            System.out.println("Сентябрь , в этом месяце 30 день ");
        }
        if (a == 10) {
            System.out.println("Октябрь , в этом месяце 31 дней ");
        }
        if (a == 11) {
            System.out.println("Ноябрь , в этом месяце 30 день ");
        }
        if (a == 12) {
            System.out.println("Декабрь , в этом месяце 31 дней ");
        }
    }
}
