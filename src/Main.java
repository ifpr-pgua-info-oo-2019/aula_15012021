
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double somaNotas = 0.0;
        double nota = 0.0;
        double mediaNotas = 0.0;

        for(int i=0;i<6;i++){

            System.out.println("Digite a nota ("+(i+1)+"):");
            nota = scan.nextDouble();

            somaNotas += nota;

        }

        mediaNotas = somaNotas/6;

        System.out.println("A soma das notas é:"+somaNotas);
        System.out.println("A média das notas é:"+mediaNotas);

        if(mediaNotas >= 7.0){
            System.out.println("Aluno aprovado!!!");
        }else if(mediaNotas>=5.0 && mediaNotas<7.0){
            System.out.println("Aluno em recuperação!!!");
        }else{
            System.out.println("O barquinho afundou...!!!Até ano que vem!!");
        }

    }

}
