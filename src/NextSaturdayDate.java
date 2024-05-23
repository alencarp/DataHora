import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

//Exercicio: Escreva um programa para mostrar a data do próximo sábado
public class NextSaturdayDate {
    public static void main(String[] args) {
        LocalDate localDate = NextSaturdayDate.calcNextFriday(LocalDate.now());
        System.out.println(localDate);
    }

    private static LocalDate calcNextFriday(LocalDate d) {
        return d.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
    }
}
