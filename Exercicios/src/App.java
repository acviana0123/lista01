import java.util.ArrayList;
import java.util.Scanner;
import exercicio1.Nome;
import exercicio10.CadastroPessoa;
import exercicio2.*;
import exercicio3.Combustivel;
import exercicio4.Inteiro;
import exercicio5.Multiplicacao;
import exercicio6.MediaAluno;
import exercicio7.Comissao;
import exercicio8.ConversorDolar;
import exercicio9.Temperatura;

public class App {
    public static void main(String[] args) throws Exception {
        //============= EXERCICIO 1 ==================
        
        // System.out.println("Informe um nome: ");
        // String nome = new Scanner(System.in).next();
        // Nome exercicio1= new Nome(nome);


        //===============EXERCICIO 2===================
        // System.out.println("Agora digite um número: ");
        // float nro1 = new Scanner(System.in).nextFloat();
        // System.out.println("Agora digite o segundo número: ");
        // float nro2 = new Scanner(System.in).nextFloat();
        // Tabuada eTabuada = new Tabuada();
        // eTabuada.divisao(nro1, nro2);
        // eTabuada.soma(nro1, nro2);
        // eTabuada.multiplicacao(nro1, nro2);
        // eTabuada.subtracao(nro1, nro2);
        //================EXERCICIO 3============================
        // Combustivel combustivel = new Combustivel();
        // combustivel.cosumoMedio();
        //===================EXERCICIO 4==========================
        //  new Inteiro();
        //=============== EXERCICIO 5 =======================
       // new Multiplicacao();
       //================ EXERCICIO 6 ====================================
    //    System.out.println("Informe o nome do Aluno: ");
    //    String nome = new Scanner(System.in).next();
    //    MediaAluno aluno = new MediaAluno();
    //    aluno.setNome(nome);
    //    System.out.println("Informe a primeira nota: ");
    //    float nota = new Scanner(System.in).nextFloat();
    //    aluno.nota.add(nota);
    //    System.out.println("Informe a segunda nota: ");
    //    nota = new Scanner(System.in).nextFloat();
    //    aluno.nota.add(nota);
    //    System.out.println("Informe a terceira nota: ");
    //    nota = new Scanner(System.in).nextFloat();
    //    aluno.nota.add(nota);
    //    System.out.println("Informe a quarta nota: ");
    //    nota = new Scanner(System.in).nextFloat();
    //    aluno.nota.add(nota);
    //    aluno.resultadoMedia(aluno.nota);

    //=================== EXERCICIO 7 ===================
        // System.out.println("Informe o nome do funcionario: ");
        // String nome = new Scanner(System.in).next();
        // System.out.println("Informe o salario do funcionario: ");
        // float salario = new Scanner(System.in).nextFloat();
        // System.out.println("Informe o total vendido em R$ pelo funcionário: ");
        // float vendas = new Scanner(System.in).nextFloat();
        // new Comissao(nome, salario, vendas);

    //==================== EXERCICIO 8 =================================
        //  System.out.println("Informe a quantidade de dolares que voce possui $: ");
        //  float dolares = new Scanner(System.in).nextFloat();
        //  System.out.println("Informe o valor da cotacao atual do real: ");
        //  float cotacao = new Scanner(System.in).nextFloat();
        //  new ConversorDolar().converteDolar(dolares, cotacao);

    //===================== EXERCICIO 9 ===================================
    // System.out.println("Informe a temperatura em graus Celsius: ");
    // float temperatura = new Scanner(System.in).nextFloat();
    // new Temperatura().apresentaTemperaturas(temperatura);

    //=====================  EXERCICIO 10 ====================================
    // ArrayList<CadastroPessoa> pessoa = new ArrayList<CadastroPessoa>();
    // int contador = 0, contMulheres =0, contHomens=0;
    // char sexo = 'I';
    // float maiorAlt = 0 , menorAlt = 100, mediaAltH=0;
    
    // while(contador <=3){
    //     do{
    //         System.out.println("Informe o sexo ");
    //         sexo = new Scanner(System.in).next().charAt(0);
    //         sexo = Character.toUpperCase(sexo);
    //     }while(sexo !='M' && sexo !='F');
    //     System.out.println("Informe a altura: ");
    //     float altura = new Scanner(System.in).nextFloat();

    //     pessoa.add(new CadastroPessoa(sexo, altura));
    //     contador++;
    // }
    // System.out.println("===========");
    // for (CadastroPessoa cadastroPessoa : pessoa) {
    //     if(cadastroPessoa.getAltura()>maiorAlt)
    //        maiorAlt = cadastroPessoa.getAltura();
    //     if(cadastroPessoa.getAltura()< menorAlt)
    //        menorAlt = cadastroPessoa.getAltura();
    //     if(cadastroPessoa.getSexo()=='F')
    //         contMulheres++;
    //     if (cadastroPessoa.getSexo()=='M'){
    //         mediaAltH = mediaAltH + cadastroPessoa.getAltura();
    //         contHomens++;
    //     }
    // }
    // System.out.println("Maior Altura: "+maiorAlt);
    // System.out.println("Menor Altura: "+menorAlt);
    // System.out.println("Quantidade de Mulheres: "+contMulheres);
    // System.out.println("Media de altura dos homens: "+(mediaAltH/contHomens));

    //========================== EXERCICIO 11 ===============================
    // String nome1 = " Mestre do universo ", nome2,nomeAux;
    // System.out.println("Informe o nome: ");
    // nome2 = new Scanner(System.in).next();
    // nomeAux = nome2;
    // nome2 = nome1;
    // nome1 = nomeAux;
    // System.out.println(nome1+nome2);

    //========================== EXERCICIO 12  ================================
     System.out.println("Informe o valor da compra: ");
     float valor = new Scanner(System.in).nextFloat();
     System.out.println("O valor da prestacao sera de 5x: "+(valor/5));
    }
}
