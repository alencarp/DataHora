import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//Exercicio: Escreva um programa para calcular a sua idade
public class DifferenceBetweenDates {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1984, Month.AUGUST, 18);

        long periodDays = Period.between(birthday, now).get(ChronoUnit.DAYS);
        long periodMonths = Period.between(birthday, now).getMonths();
        long periodYears = Period.between(birthday, now).getYears();
        System.out.printf("%d anos, %d meses e %d dias", periodYears, periodMonths, periodDays);
    }
}
