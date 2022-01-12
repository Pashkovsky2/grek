public class Reader {
    Reader() {

    }

    String name;
    int num;
    int fhone;
    int books;


    public void takeBooks(int books) {
        if (books <= 5) {
        } else {
            System.out.println(" Лимит привышен, штраф 50грн. ");
        }

        System.out.println(name + " номер билета " + num + " номер телефона " + fhone + " взяла " + books + " книги ");

    }

    public void returnBooks(int books) {
        if (books > 0) {
            System.out.println(name + " номер билета " + num + " номер телефона " + fhone + " вернул " + books + " книг ");
        }
            System.out.println(" Осталось  6  книг ");
        //if ()
        System.out.println();


    }


}
