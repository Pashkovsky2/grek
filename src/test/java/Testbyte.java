    import org.testng.annotations.Test;

    public class Testbyte {

    @Test
    public void Testbyte() {

        summary((byte) 6, (byte) 5);
        vidn((byte) 40, (byte) 20);
        dilenya((byte) 60, (byte) 20);
        mnozennya((byte) 30, (byte) 10);
        ostacha((byte) 15, (byte) 6);
    }

    public void summary(byte one, byte two) {
        System.out.println(one + two);
    }

    public void vidn(byte one, byte two) {
        System.out.println(one - two);
    }

    public void dilenya(byte one, byte two) {
        System.out.println(one / two);
    }

    public void mnozennya(byte one, byte two) {
        System.out.println(one * two);
    }

    public void ostacha(byte one, byte two) {
        System.out.println(one % two);
    }

}
