// Esse código é um exemplo de implementação de uma classe carro em Java, que implementa a interface Comparable para permitir a comparação entre objetos da classe carro com base na prioridade.
public class Carro implements Comparable<Carro>{
    //Atributos
    private String modelo;
    private int prioridade;
    //Construtor
    public Carro(String modelo, int prioridade) {
        this.modelo = modelo;
        this.prioridade = prioridade;
    }
    //Método compareTo
    // ordenar os veiculos: menor para o de maior prioridade
    @Override
    public int compareTo(Carro c){
        return Integer.compare(this.prioridade, c.prioridade);
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
