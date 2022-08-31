package exercicio9;

public class Temperatura {
    public void apresentaTemperaturas(float tempCelsius){
        System.out.println("Essa temperatura em Kelvin (K) eh: "+(tempCelsius + 273.15));
        System.out.println("Essa temperatura em Réaumur (Re) eh: "+(tempCelsius * 0.8));
        System.out.println("Essa temperatura em Rankine (Ra) eh: "+(tempCelsius * 1.8 + 32 + 459.67));
        System.out.println("Essa temperatura em Fahrenheit (F) eh: "+(tempCelsius * 1.8 + 32));
    }
}
