import java.util.LinkedList;

// Задача 1: Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class Task1thReverse {
    public void linkedListReverse () {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        for (int i=0; i<20; i++) {
            int num = (int)(Math.random() * 100);
            firstLinkedList.addLast(num);
        }
        System.out.println("Выполнение первой задачи:");
        System.out.println("Первоначальный список: " + firstLinkedList);
        
        LinkedList<Integer> secondLinkedList = new LinkedList<>();
        int size = firstLinkedList.size();
        for (int i=0; i<size; i++) {
            int elm = firstLinkedList.peekLast();
            firstLinkedList.pollLast();
            secondLinkedList.addLast(elm);
        }
        System.out.println("Перевернутый список: " + secondLinkedList);
    }
}