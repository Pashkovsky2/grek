import org.testng.annotations.Test;

public class TestReader {

    @Test
    public void test(){
        Reader reader = new Reader();
        reader.name = " Бузова Ольга Николаевна ";
        reader.num = 5;
        reader.fhone = 657687908;
        reader.books = 6;
        reader.takeBooks(reader.books);


        Reader reader1 = new Reader();
        reader1.name = " Петров Олег Николаевич ";
        reader1.num =3;
        reader1.fhone = 7657879;
        reader1.books = 2;
        reader1.returnBooks(reader1.books);

    }
}
