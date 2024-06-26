package program;
import java.util.Scanner;
import paramentrosInvalidos.ParamentrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o priemiro número: ");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = sc.nextInt();

        int intervalo = parametroDois - parametroUm;

        verificarParametro(parametroUm, parametroDois);

           try { 
            for(int i = 0; i <= intervalo; i++){           
                                    
                System.out.println("Imprimindo numero: " + (parametroUm + i));
            }
            
            } finally { 
            sc.close();
           }

         }            
             static void verificarParametro (int parametroUm, int parametroDois) throws ParamentrosInvalidosException{
            if (parametroUm > parametroDois) {
               
                throw new ParamentrosInvalidosException("O primeiro número deve ser menor ou igual ao segundo número.");
            }
        }
    }

    
