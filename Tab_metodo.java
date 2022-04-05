import java.util.Scanner; //importando a classe Scanner

public class Tab_metodo {

    public static void main(String[] args) {
// instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        System.out.printf(" Deseja iniciar a tabuada (1)sim-(2)não:\n");
        int op = ler.nextInt();
        switch (op) {
            case 1:
                tabuada();
            case 2:
                break;
        }
    }

    public static void tabuada() {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt(); // entrada de dados (lendo um valor inteiro)
        System.out.printf("\n+--Resultado--+\n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("| %2d * %d = %2d |\n", i, n, (i * n));
        }

        System.out.printf("+-------------+\n");
        Tab_metodo principal = new Tab_metodo();

        System.out.printf("Deseja Continuar? 1(sim)2(não):\n");
        int opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                tabuada();
            case 2:
                break;
        }

    }
}
