import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        //pedagio();
        PriorityQueue<Carro> fila = new PriorityQueue<>();
        fila.add(new Carro("Uno", 2));
        fila.add(new Carro("Gol", 2));
        fila.add(new Carro("Ambulância", 1));
        fila.add(new Carro("Polícia", 1));

        //realizando o atendimento do pedágio
        while (!fila.isEmpty()){
            Carro carro_removido = fila.poll(); // remove o primeiro da fila
            System.out.println("Carro removido: " + carro_removido.getModelo());
        }
    }
    public static void pedagio(){
        //Criar uma fila de veículos
        Queue<String> fila_carros = new LinkedList<>();

        //adicionar elementos com offer
        //offer: ao inserir, é consultado a capacidade da fila, caso a fila esteja cheia, não é inserido
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Fusca");
        fila_carros.offer("Gol G1");
        fila_carros.offer("Corsa");
        
        //situação da fila
        System.out.println("Situação: " + fila_carros);

        //realizando o atendimento no pedágio
        while(!fila_carros.isEmpty()){
            String carro_removido = fila_carros.poll();
            System.out.println("Carro "+ carro_removido + " liberado no pedágio");
        }
    }
    public static void testeFila(){
        //Criar uma fila de veículos
        Queue<String> fila_carros = new LinkedList<>();

        //adicionar elementos com offer
        //offer: ao inserir, é consultado a capacidade da fila, caso a fila esteja cheia, não é inserido
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Fusca");

        //add: não consulta o tamanho da fila, em razão disso, podera causar um overflow
        fila_carros.add("Gol G1");
        fila_carros.add("Corsa"); 

        //quantos carros tem na fila
        System.out.println("Quantidade de carros na fila: " + fila_carros.size());

        //visualizar os elementos da fila
        for (String carro : fila_carros){
            System.out.println(carro);
        }
        //primeiro da fila
        System.out.println("Primeiro da fila: " + fila_carros.peek());

        //ver todos
        System.out.println("Fila: " + fila_carros);

        //remover o primeiro veículo
        String car = fila_carros.poll();
        System.out.println("Carro removido: " + car);

        //situação da fila
        System.out.println("Situação: " + fila_carros);
    }
}
