import org.testng.annotations.Test;

import java.util.Locale;

import static java.awt.SystemColor.text;
              //Выводит все согласные
public class Domashka5 {
    @Test
    public void golosni() {
        check("Привет как у тебя дела");
        check("Сегодня хорошая погода");
    }

    public void check(String text) {

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'а' ||
                    text.charAt(i) == 'и' ||
                    text.charAt(i) == 'е' ||
                    text.charAt(i) == 'у' ||
                    text.charAt(i) == 'о' ||
                    text.charAt(i) == 'я') ;

            else {
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
    }
            //Выводит все не гласные
    @Test
    public void neGolosni() {
        check2("Привет как у тебя дела");
        check2("Сегодня хорошая погода");
    }

    public void check2(String text) {
        text = text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'п' ||
                    text.charAt(i) == 'р' ||
                    text.charAt(i) == 'в' ||
                    text.charAt(i) == 'т' ||
                    text.charAt(i) == 'к' ||
                    text.charAt(i) == 'б' ||
                    text.charAt(i) == 'д' ||
                    text.charAt(i) == 'л' ||
                    text.charAt(i) == 'с' ||
                    text.charAt(i) == 'н' ||
                    text.charAt(i) == 'х') {

            } else {
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
    }
    //Выводит предложение без пробелов
    @Test
    public void probel() {
        check3("Привет как у тебя дела");
        check3("Сегодня хорошая погода");
    }

    public void check3(String text) {

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {

            } else {
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
    }
}