import org.testng.annotations.Test;

public class TTTTTTTTT {
    @Test
    public static void main(String[] args) {
        String glas = "привет как дела";
        String s = "ох какая класная погода";
        StringBuilder glass = new StringBuilder();
        StringBuilder soglass = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            if (glas.indexOf(s.charAt(i)) >= 0) {
                glass.append(s.charAt(i));

            } else soglass.append(s.charAt(i));
        }
        System.out.println(glass.toString());
        System.out.println(soglass.toString());
    }
}