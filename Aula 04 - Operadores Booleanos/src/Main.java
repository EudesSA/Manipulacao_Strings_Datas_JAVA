public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        //TABELA VERDADE
        /* OPERADOR && (AND)
        * true && true = true
        * true && false - false
        * false && true = false
        * false && false = false
        */

        /* OPERADOR || (OR)
         * true || true = true
         * true || false - true
         * false || true = true
         * false || false = false
         */

        //OPERADOR TERNÁRIO
         String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}