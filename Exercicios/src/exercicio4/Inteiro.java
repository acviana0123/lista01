package exercicio4;

import java.util.Scanner;

public class Inteiro {
    public Inteiro(){
         System.out.println("Informe um numero inteiro: ");
         int numero = new Scanner(System.in).nextInt();
         System.out.println("Seu antecessor é: "+(numero-1)+" e seu sucessor é: "+(numero+1));
    }
}
