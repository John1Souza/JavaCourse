package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Rows {
    public static void main(String[] args) {
        Queue<String> row = new LinkedList<>();

        // Offer e Add -> add elements in rows
        // The difference is the behavior when the queue is full

        row.add("Ana");// lançará uma exceção caso a fila esteja cheia.
        row.offer("Bia"); //retorna falso caso a fila esteja cheia.
        row.add("Carlos");
        row.offer("Daniel");
        row.add("Rafaela");
        row.offer("Gui");


        // peek e Element -> Obter o próximo elementos na fila(Sem remover)
        //The difference is the behavior when the queue is empty
        System.out.println(row.peek());
        System.out.println(row.peek());
        System.out.println(row.element());
        System.out.println(row.element());


        // Poll e Remove -> obter príoximo elemento
        // da fila e remove!

        System.out.println(row.poll());
        System.out.println(row.poll());
        System.out.println(row.poll());
        System.out.println(row.poll());
        System.out.println(row.poll());
        System.out.println(row.poll());
        System.out.println(row.poll());
        System.out.println(row.poll());


        // row.size()
        // row.clear()
        // row.isEmpty()

        // row.contian

    }
}
