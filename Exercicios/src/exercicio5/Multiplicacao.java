package exercicio5;

import java.util.Scanner;

public class Multiplicacao {
    public Multiplicacao(){
         System.out.println("Digite um numero para calcular a tabuada de multiplicacao: ");;
         float numero = new Scanner(System.in).nextFloat();
         System.out.println("A tabuada de multiplicacao do nro: "+numero);
         for(int i=1 ; i<=10 ; i++){
             System.out.println(numero+" x "+i+" = "+(numero*i));
         }
    }
}
