import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome = "Katiana";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nome2 = "Katiana";
        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));

        // ISO 8601
        LocalDate hoje = LocalDate.now(); // buscar data atual
        System.out.println(hoje);
        Locale brasil = new Locale("pt","BR"); // defini localização
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil)); // mostra dia da semana na região brasil

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() <= 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        }else {
            saudacao = "olá";
        }

        // %s indica a varivel String
        //%n indica a quebra de linha

        System.out.printf("Olá, %s. Hojé é %s, %s.%n",nome,diaSemana,saudacao.toUpperCase());
    }
}