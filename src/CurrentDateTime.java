import java.time.LocalDateTime;

//Exercicio: Escreva um programa para mostrar o horário de agora
public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
    }
}
