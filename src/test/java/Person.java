
public class Person {

    Person (){

    }
    String fullname;
    int age;

    public Person(String fullname, int age){
        this.fullname = fullname;
        this.age = age;

    }

    public void showmove(){
        if (fullname == null && age == 0){
            System.out.println("Двигаеться");

        }else {
            System.out.println( fullname + " " + age + " " + "Двигается");
        }

    }
    public void showtalk() {
        if (fullname == null && age == 0){
        System.out.println("Разговаривает ");
    } else {
        System.out.println( fullname + " " + age + " " + "Разговаривает");

    }
}
}