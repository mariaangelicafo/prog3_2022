import java.util.Scanner;

public class Principal_creditos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf(" Deseja saber o valor de qual curso:\n");
        System.out.printf(" 1- Agronomia\n");
        System.out.printf(" 2- Arquitetura\n");
        System.out.printf(" 3 - Ciência da Computação\n");
        System.out.printf(" 4 - Ciências Biológicas\n");
        System.out.printf(" 5 - Ciências Contabeis\n");
        System.out.printf(" 6 - Direito\n");
        System.out.printf(" 7 - Enfermagem\n");
        System.out.printf(" 8 - Engenharia Agricola\n");
        System.out.printf(" 9 - Farmácia\n");
        System.out.printf(" 10 - História\n");
        System.out.printf(" 11 - Letras\n");
        System.out.printf(" 12 - Matemática\n");
        System.out.printf(" 13 - Pedagogia\n");
        System.out.printf(" 14 - Psicologia\n");

        int op = ler.nextInt();
        if ((op < 15) && (op > 0)) {
            Creditos acesso = new Creditos();
            String retorno;//variavel que armazena o retorno do calculo
            retorno = acesso.calcular_credito(op);
            System.out.println(" O Valor total do curso:" + retorno);
           }
        else
        {
        System.out.println("Valor inválido");
        }
    }
}//fim classe

