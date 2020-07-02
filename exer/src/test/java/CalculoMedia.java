import java.util.Scanner;

public class CalculoMedia {

        public static void main(String[] args) {
            int a,i;

            Scanner s = new Scanner(System.in);
            Scanner x = new Scanner(System.in);

            a = s.nextInt();
            int vetor[] = new int[a];

            for(i=0;i<a;i++){
                vetor[i] = x.nextInt();
                if(vetor[i]>38){
                    if(vetor[i]%5==4){
                        vetor[i] = vetor[i]+1;
                    } else if(vetor[i]%5==3){
                        vetor[i] = vetor[i]+2;
                    } else if (vetor[i]%5==2){
                        vetor[i] = vetor[i]+3;
                    }
                }

            }
            for(i=0;i<a;i++){
                System.out.println(vetor[i]);
            }

        }

}
