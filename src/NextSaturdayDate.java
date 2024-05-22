import java.time.DayOfWeek;
import java.time.LocalDate;

//Exercicio: Escreva um programa para mostrar a data do próximo sábado
public class NextSaturdayDate {
    public static void main(String[] args) {
        DayOfWeek currentDate = LocalDate.from(LocalDate.now()).getDayOfWeek();
        System.out.println(currentDate);


    }
}
