import org.testng.annotations.Test;

@Test
class Main{
    public static void main(String[] args){

        Operation op = new Operation();
        op.foo();
    }
}


public class Operation {

    int a =5, b =7, p;
    String str1 = "Площадь ", str2 = "пряиоугольника ", str3 = "равна ", result;

    int c =10, v = 10, pa;
    String st1 = "Площадь ", st2 = "квадрата ", st3 = "равна ", result2;


    public void foo(){
        p = a * b;
        result = str1 + str2 + str3;

        pa = c * v;
        result = st1 + st2 + st3;

        System.out.println(result);

        System.out.println(p);

        System.out.println(result2);

        System.out.println(pa);
    }
}
