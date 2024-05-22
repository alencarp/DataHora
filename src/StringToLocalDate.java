//Exercicio: Escreva um programa para converter String em LocalDate
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String birthday = "18/08/1984";
        LocalDate localDate = LocalDate.parse(birthday,dtf);
        System.out.println(localDate);
    }

}
