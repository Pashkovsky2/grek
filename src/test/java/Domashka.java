import org.testng.Assert;
import org.testng.annotations.Test;

public class Domashka {
    @Test
    public void test1() {
        int r = 10;
        double formula = ploshaKruga(r);
        System.out.println("Площадь круга " + formula + "\n");
        Assert.assertEquals(formula, 314.1592653589793);
    }

    public double ploshaKruga(int r) {
        return Math.PI * (r * r);
    }

    @Test
    public void test3() {
        int r = 10;
        System.out.println("Окружность круга " + Math.PI * (2 * r) + "\n");
        Assert.assertEquals(dlinaKruga(r), 62.83185307179586);


    }

    public double dlinaKruga(int r) {
        return Math.PI * (2 * r);
    }


    @Test
    public void test2() {
        int a = 3;
        int ploshaKv = ploshaKv(a);
        System.out.println("Площа квадрата " + ploshaKv + "\n");
        Assert.assertEquals(ploshaKv, 9);
    }

    public int ploshaKv(int a) {
        return a * a;
    }

    @Test
    public void test4() {
        int a = 10;
        int b = 20;
        System.out.println("Площадь прямоугольника равна " + a * b);
        Assert.assertEquals(ploshaPry(10, 20), 200);
    }

    public int ploshaPry(int a, int b) {
        return a * b;
    }

    @Test
    public void test5() {
        int a = 5;
        int a1 = 5;
        int a2 = 5;
        System.out.println("Обьём куба равен " + a * a1 * a2);
        Assert.assertEquals(obemKuba(5, 5, 5), 125);

    }

    public int obemKuba(int a, int a1, int a2) {
        return a * a1 * a2;
    }

    @Test
    public void test6() {
        int b = 10;
        int b1 = 15;
        int b2 = 20;
        System.out.println("Сумма трех чисел равна " + (b + b1 + b2));
        Assert.assertEquals(summaTrexCh(b, b1, b2), 45);

    }

    public int summaTrexCh(int b, int b1, int b2) {
        return b + b1 + b2;

    }

    @Test
    public void test7() {
        int num = 60;
        int num2 = 2;
        System.out.println("Деление двух чисел равна " + num / num2);
        Assert.assertEquals(delenie(num, num2), 30);

    }

    public int delenie(int num, int num2) {
        return num / num2;
    }

    @Test
    public void test8() {
        int num = 45;
        int num1 = 50;
        int num2 = 15;
        System.out.println("Умножение трех чисел " + num * num1 * num2);
        Assert.assertEquals(mnojenyTryx(num, num1, num2), 33750);

    }

    public int mnojenyTryx(int num, int num1, int num2) {
        return num * num1 * num2;

    }
}