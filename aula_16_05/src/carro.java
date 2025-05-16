public class carro {
    //Atributos
    private String modelo;
    private int prioridade;
    //Construtor
    public carro(String modelo, int prioridade) {
        this.modelo = modelo;
        this.prioridade = prioridade;
    }

    //Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
