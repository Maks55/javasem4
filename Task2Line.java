import java.util.LinkedList;
import java.util.Scanner;

/* Задача 2: Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */

public class Task2Line {
    int n;
    int[] a;

    Task2Line() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выполнение второй задачи: ");
        System.out.println("Создание начальной очереди.Введите количество элементов в списке: ");
        n = in.nextInt();
        System.out.println("Введите " + n + " элементов");
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i]=in.nextInt();
        }
        in.close();
    }

    public void enqueue() {
        LinkedList<Object> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            queue.add(a[i]);
        }
        queue.addLast(5);
        System.out.println(queue);
    }

    public Object dequeue() {
        LinkedList<Object> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            queue.add(a[i]);
        }
        Object firstObject = queue.getFirst();
        queue.pollFirst();
        System.out.println(firstObject);
        System.out.println(queue);
        return queue;
    }

    public void first(Object queue) {
        Object firstObject = ((LinkedList<Object>) queue).getFirst();
        System.out.println(firstObject);
    }
    
}