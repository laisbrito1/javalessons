import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome = "Lais";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        saudacao(nome);

        LocalDate hoje = LocalDate.now();
        String saudacao;
        Locale brasil = new Locale("pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        System.out.println(diaSemana);
        LocalDateTime hora = LocalDateTime.now();

        if(hora.getHour()>= 0 && hora.getHour() <12){
            saudacao = "Bom dia!";
        } else if (hora.getHour()>= 12 && hora.getHour() <18) {
            saudacao = "Boa tarde!";
        } else {
            saudacao = "Boa noite!";
        }
        System.out.printf("Olá, %s. hoje é %s. ,tenha um(a), %s.", nome, diaSemana, saudacao);



    }

    public static void saudacao(String nome) {
    System.out.println("Hello " + nome );

    }
}