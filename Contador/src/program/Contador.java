package program;
import java.util.Scanner;
import parametrosInvalidos.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try { 
            System.out.println("Digite o primeiro número: ");
            int parametroUm = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int parametroDois = sc.nextInt();

            int intervalo = parametroDois - parametroUm;

        verificarParametro(parametroUm, parametroDois);
           
            for(int i = 1; i <= intervalo; i++){           
                                    
                System.out.println("Imprimindo numero: " + i);
            }   

            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
                
            } finally { 
            sc.close(); 
           }

         }            
             static void verificarParametro (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
            if (parametroUm > parametroDois) {
               
                throw new ParametrosInvalidosException("O primeiro número deve ser menor ao segundo número.");
            }
        }
    }

    
