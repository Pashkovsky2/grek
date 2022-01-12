import org.testng.annotations.Test;

public class culculator {
    @Test
    public void goo(){
        summary(first,second);
        vidnimany(first,second);
        delenie(first,second);
        mnojeny(first,second);
        ostatok(first,second);
    }
    int first = 30;
    int second = 7;

    public void summary(int first, int second){
        System.out.println(first + second);

    }


    public void vidnimany(int first, int second){
        System.out.println(second - first);

    }

    public void delenie(int first, int second){

        System.out.println(second / first);
    }

    public void mnojeny(int first, int second){

        System.out.println(first * second);
    }

    public void ostatok(int first, int second){

        System.out.println(first % second);
    }
}
