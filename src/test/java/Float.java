import org.testng.annotations.Test;

public class Float {

    @Test

    public void Float(){
        summary((float) 1.1, (float) 1.2);
        vidnimany((float) 1.0, (float) 1.0);
        dileny((float) 1.4, (float) 1.1);
        mnojeny((float) 1.1, (float) 1.1);
        ostatok((float) 1.8, (float) 1.8);


    }


    public void summary(float one, float two){
        System.out.println(one + two);
    }

    public void vidnimany(float one, float two){
        System.out.println(one - two);
    }

    public void dileny(float one, float two){
        System.out.println(one / two);
    }

    public void mnojeny(float one, float two){
        System.out.println(one * two);
    }

    public void ostatok(float one, float two){
        System.out.println(one % two);
    }
}
