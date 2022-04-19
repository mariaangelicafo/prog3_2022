
import java.util.Scanner;

/* 1-Faça um programa que permita mostrar os cursos oferecidos por uma universidade.
O usuário entra com código do curso, quantidade de créditos que irá cursar no semestre
e o programa retorna o nome do mesmo com o valor correspondente( Credito*quantidade).
Utilize duas classes: uma Principal e outra Cursos. O valor dos créditos de cada curso
se encontra na tabela abaixo.
 */ 
public class Creditos {

    public String calcular_credito(int codigo_curso) {
        int quant_creditos;
        float total=0;
        String nome="";
        Scanner lercredito = new Scanner(System.in);
        System.out.printf(" Quantos Creditos deseja cursar:\n");
        quant_creditos = lercredito.nextInt();
        switch (codigo_curso) {
            case 1:
                total = (float) (23.67 * quant_creditos);
                nome="Agro";
                break;
                case 2:
                total = (float) (39.39 * quant_creditos);
                nome="Arquitetura";
                break;
            case 3:
                total = (float) (30.08 * quant_creditos);
                nome="Computação";
                 break;
            case 4:
                total = (float) (22.67 * quant_creditos);
                nome="C. Biológicas";
             case 5:
                total = (float) (25.10* quant_creditos);
                nome="C.Contábeis";
                 break;
             case 6:
                total = (float) (25.60* quant_creditos);
                nome="Direito";
                 break;
                 case 7:
                total = (float) (30.32* quant_creditos);
               nome="Enfermagem";
                break;
                 case 8:
                total = (float) (31.06* quant_creditos);
              nome="E. Agrícola";
               break;
                 case 9:
                total = (float) (32.06* quant_creditos);
               nome="Farmácia";
                break;
                case 10:
                total = (float) (22.60* quant_creditos);
              nome="História";
               break;
                case 11:
                total = (float) (20.30* quant_creditos);
                nome="Letras";
                 break;
                case 12:
                total = (float) (22.20* quant_creditos);
                nome="Matemática";
                 break;
                case 13:
                total = (float) (20.20* quant_creditos);
                nome="Pedagogia";
                 break;
                case 14:
                total = (float) (29.34* quant_creditos);
               nome="Psicologia";
                break;
                default:
               nome="Opção Inválida";
               break;
     
        }
        return (String) (total+" curso:"+nome);
    }
 
}
