import java.util.Scanner;
public class Fibonacci{
   public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
      int a, n, contador, b, c, Fibonacci;
      char resposta;
      boolean ERRO;
      System.out.print("\t\tOla usuario este programa ira escrever n termos de Fibonacci");
      do{
         contador = 0;
         a = 1;
         b = 0;
         Fibonacci = 1;
         System.out.print("\nEscreva o numero de termos da sequencia de Fibonacci que deseja: ");
         n = teclado.nextInt();
         do{
            System.out.print(Fibonacci + ", ");
            Fibonacci = a + b;//1,1,2,3,5,8,13,21,34
            b = a;
            a = Fibonacci ;
            contador++;
         }while(contador<n);//fim do 2
         System.out.print(".");
         System.out.print("\nDeseja usar este programa denovo?[S/N]: ");
         resposta = teclado.next().charAt(0);
         resposta = Character.toUpperCase(resposta);
      }while(resposta=='S');//fim do 1
         System.out.print("Obrigado por usar meu programa.");   
   }//fim main
}//fim class