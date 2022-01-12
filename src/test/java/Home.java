import org.testng.annotations.Test;

public class Home {
    int plosha;
    String name;


    public Home(int plosha, String name) {
        this.plosha = plosha;
        this.name = name;
    }

    public void show() {
        System.out.println("Площа =" + plosha + " " + "имя=" + name);
    }
}

