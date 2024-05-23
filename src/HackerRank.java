import java.time.LocalDate;
import java.util.Scanner;

/**
 * A classe Calendar é uma classe abstrata que fornece métodos para converter entre um instante específico no tempo e um
 * conjunto de campos de calendário, como ANO, MÊS, DIA_DE_MÊS, HORA e assim por diante, e para manipular os campos do
 * calendário, como obter a data da próxima semana.
 *
 * Você recebe uma data. Você só precisa escrever o método "getDay()", que retorna o dia daquela data. Para simplificar
 * sua tarefa, fornecemos uma parte do código no editor.
 *
 * Exemplo:
 * month = 8
 * day = 14
 * year = 2017
 *
 * Retorno: MONDAY como o dia naquela data.
 *
 * Descrição da Função
 * Complete a função findDay() com os parâmetros (int month, int day, int year)
 * Retorna: uma string com o dia da semana em letras maiúsculas
 *
 * Formato de input
 * Uma única linha de input com espaço separando mês, dia e ano, respectivamente, no formato MM DD YYYY.
 *
 * Restrições: 2000 < year < 3000
 *
 * Exemplo de input: 08 05 2015
 * Exemplo de output: WEDNESDAY
 * Explicação: O dia August 5 2015 foi WEDNESDAY
 */

public class HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, day, year;
        month = scanner.nextInt();
        day = scanner.nextInt();

        year = scanner.nextInt();
        if (year > 2000 && year < 3000) {
            System.out.println(HackerRank.findDay(month, day, year));
        }
        System.out.println("Ano fora do limite: 2000 < year < 3000");

    }

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString().toUpperCase();
    }
}
