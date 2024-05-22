import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Exercicio: Escreva um programa para mostrar a data atual no formato dd/MM/yyyy
public class CurrentDateFormated {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(dtf));
    }
}
