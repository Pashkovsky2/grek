import org.testng.annotations.Test;

public class hghgj {
    @Test
    public void test() {
        ifNumbersAreSame(6, 7);
    }

    public void ifNumbersAreSame(int a, int b) {
        if (a == b) {
            System.out.println("True");
        } else if (a != b) {
            System.out.println("NE PRAVDA");
        }
    }
    @Test
    public void test1(){
        for (int i = 0; i < 6; i++){
            System.out.println(i);
        }
    }
    @Test
    public void  test2(){
        for (int i = 0;i<=10;i++) {
            System.out.println("3 *"+ i + "="+ i* 3 );
            
        }
    }


        }

