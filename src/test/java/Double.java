import org.testng.annotations.Test;

public class Double {

    @Test
    public void Double(){
        summary((double) 1.23, (double) 1.56);
        vidn((double) 1.34, (double) 1.30);
        dil((double) 1.55, (double) 1.55);
        mno((double) 1.23, (double) 1.22);
        ost((double) 1.11, (double) 1.10);



    }
    public void summary(double one, double two){
        System.out.println(one + two);
    }

    public void vidn(double one, double two){
        System.out.println(one - two);
    }

    public void dil(double one, double two){
        System.out.println(one / two);
    }

    public void mno(double one, double two){
        System.out.println(one * two);
    }

    public void ost(double one, double two){
        System.out.println(one % two);
    }

}
