
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int QTDE_MAX_NOTAS = 6;

        Scanner scan = new Scanner(System.in);

        double somaNotas = 0.0;
        double nota = 0.0;
        double mediaNotas = 0.0;

        int cont=0;

        while(cont < QTDE_MAX_NOTAS){

            System.out.println("Digite a nota ("+(cont+1)+"):");
            nota = scan.nextDouble();

            if(nota>=0 && nota <= 10){

                somaNotas += nota;
                cont+=1;

            }else{
                System.out.println("Nota inválida!! Digite valores entre 0 e 10.");
            }


        }

        mediaNotas = somaNotas/QTDE_MAX_NOTAS;

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
