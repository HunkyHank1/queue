/*
henry Johnson
queueDriver: test the que class
11/17/20
 */
public class QueueDriver {
    public static void main(String[] args) {
        Que<String> queball = new Que();
        queball.enqueue("A queue");
        System.out.println("should print 1");
        System.out.println(queball.size());
        queball.enqueue("Another que! wow!");
        queball.enqueue("wholly molly there's a third! I cant believe it!");
        System.out.println("should print A Queue");
        System.out.println(queball.dequeue());
        System.out.println("should print 2");
        System.out.println(queball.size());
        System.out.println(queball.peek());
        System.out.println("should print false");
        System.out.println(queball.isEmpty());
    }
}
