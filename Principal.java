import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
      
        System.out.println("O que deseja:");
        System.out.println("1-Informar Aluno Graduação");
        System.out.println("2-Informar Aluno Pos");
        System.out.println("3-Sair");
        int escolha = ler.nextInt();
        switch (escolha) {
            case 1:
              AlunoGraduacao alunoG = new AlunoGraduacao("Ana", 20, 2021);
              alunoG.imprime();
              break;
            case 2:
              AlunoPos alunoP = new AlunoPos("José", 2018, 2021);
              alunoP.imprime();
              break;
            default:
                System.out.println("Escolha inexistente.");
        }
    }
}
