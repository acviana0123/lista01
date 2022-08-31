package exercicio10;

public class CadastroPessoa {
    private char sexo;
    private float altura;

    /**
     * @return char return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return float return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public CadastroPessoa(char sexo, float altura){
        this.altura = altura;
        this.sexo = sexo;
    }
}
