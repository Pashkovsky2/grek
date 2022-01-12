public class Taxi {
    public int peaple;
    public int car;
    public int hours;
    public int kolichestvo;

    public Taxi(int peaple, int car, int hours, int kolichestvo){
        this.peaple = peaple;
        this.car = car;
        this.hours = hours;
        this.kolichestvo = kolichestvo;
    }
    public void calcKolichestvoHodok(){
        if (peaple > 4){
            System.out.println("Не может принять такое количество пасажиров");
        }else {
            System.out.println(" Машина " + car + " приняла заказ и приедет через " + hours + " минут ");
        }
    }
}
