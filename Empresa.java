//Exemplo 
import java.util.Scanner;
public class Empresa{
 
    public static void main(String[] args) {
        String funcionario = "";
        int numFuncionario = 0;
        int horasTrabalhadas = 0;
        float salario;
        Scanner input = new Scanner(System.in);// instanciando a classe Scanner objeto input
        System.out.println("Inserir numero do funcionario: ");
        numFuncionario = input.nextInt();
        System.out.println("Inserir numero de horas trabalhadas: ");
        horasTrabalhadas = input.nextInt();
        System.out.println("Inserir nome do funcionario: ");
        funcionario = input.next();
        System.out.println("Inserir o Salário: ");
        salario = input.nextFloat();
        System.out.printf("O funcionário N°:%d - %s\n", numFuncionario, funcionario);
        System.out.printf("trabalha %d horas\n", horasTrabalhadas);
        System.out.printf("O Salário é %.2f:\n", salario);
        System.out.println("");
    }
}
