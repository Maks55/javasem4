public class Main {
    public static void main(String[] args) {
        
        Task1thReverse taskOne = new Task1thReverse();
        taskOne.linkedListReverse();

        Task2Line taskTwo = new Task2Line();
        taskTwo.enqueue();
        Object queue = taskTwo.dequeue();
        taskTwo.first(queue);
    }
}
