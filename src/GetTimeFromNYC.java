import java.time.LocalDateTime;
import java.time.ZoneId;

//Exercicio: Escreva um programa para pegar o horário de Nova York
//https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
public class GetTimeFromNYC {
    public static void main(String[] args) {
        LocalDateTime localDateTimeNYC = LocalDateTime.now(ZoneId.of("America/Indiana/Indianapolis"));
        System.out.println(localDateTimeNYC);
    }
}
