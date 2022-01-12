import org.testng.annotations.Test;

public class Long {
    @Test
    public void Long(){
        summary((long) 456, (long) 543);
        vidnim((long) 657, (long) 765);
        dileny((long) 1000, (long) 255);
        mnojeny((long) 367, (long) 23);
        ostatok((long) 1234, (long) 89);

    }
    public void summary(long one, long two){
     System.out.println(one + two);
    }

    public void vidnim(long one, long two){
        System.out.println(one - two);
    }
    public void dileny (long one, long two){
        System.out.println(one / two);
    }

    public void mnojeny(long one, long two){
        System.out.println(one * two);
    }

    public void ostatok(long one, long two){
        System.out.println(one % two);
    }
}
