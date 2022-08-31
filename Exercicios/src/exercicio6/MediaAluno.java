package exercicio6;

import java.util.ArrayList;

public class MediaAluno {
    public ArrayList<Float> nota = new ArrayList();
    public String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void resultadoMedia(ArrayList<Float> nota){
        System.out.printf("Aluno: %s Media = %f",this.nome,
        (nota.get(0)+nota.get(1)+nota.get(2)+nota.get(3))/4);
    }
}
