package exercicio7;

public class Comissao {
    private String nome;
    private float salario;
    private float venda;
    
    public Comissao(String nome, float salario, float venda){
        this.nome = nome;
        this.salario = salario;
        this.venda =venda;
        calculaComissao();
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return float return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    private void calculaComissao(){
        System.out.printf("O funcionario %s com salario %.2f tera R$: %.2f de comissao",this.nome,
                        this.salario, (this.venda*0.15));
        System.out.println("Total: "+(this.salario+(this.venda*0.15)));
    }

    /**
     * @return float return the venda
     */
    public float getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(float venda) {
        this.venda = venda;
    }

}
