import org.testng.annotations.Test;

public class trety {
    @Test
    public void fizzBuzz() {

        buzz(15);
        buzz(40);
    }

    public void buzz(int buzz) {
        for (int i = buzz; i >=0; i--) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("FIZZ");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
