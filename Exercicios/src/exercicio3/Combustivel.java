package exercicio3;

import java.util.Scanner;

public class Combustivel {
    public void cosumoMedio(){
        
        System.out.println("Informe a quantidade de km: ");
        float quilometros = new Scanner(System.in).nextFloat();
        System.out.println("Informe a quantidade de gasolina gasta: ");
        float gasolina = new Scanner(System.in).nextFloat();

        apresentaConsumo(quilometros/gasolina);
    }

    private void apresentaConsumo(float consumo){
        System.out.println("O consumo medio é: "+ consumo+" km/litro");
    }
}
