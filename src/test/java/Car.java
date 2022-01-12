public class Car {
    String name;
    String color;
    String obem;
    //НАПИСАНИЕ В ДВА ЭТАПА
    public Car(String name, String color, String obem) {
        this.name = name;
        this.color = color;
        this.obem = obem;
    }

    public void show() {
        System.out.println("name =" + name + " " + "color=" + color+ " " + "obem=" + obem);
    }
}
