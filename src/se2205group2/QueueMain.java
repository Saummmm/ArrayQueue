package se2205group2;

public class QueueMain {

    public static void main(String[] args) {
        // creat new obj
        ArrayQueue<Character> queue = new ArrayQueue<>(5);
        // insert A-E
        try {
            queue.add('A');
            queue.add('B');
            queue.add('C');
            queue.add('D');
            queue.add('E');
            // remove A,B
            queue.remove();
            queue.remove();
            // insert F,G
            queue.add('F');
            queue.add('G');
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            //executes finally block no matter what
            System.out.println("Processing...\n");
            //set value for the size
            int iterations = queue.size();
            //loops through array queue and outputs the first value each time
            //using the remove function
            for (int i = 0; i < iterations; i++) {
                System.out.println(queue.remove());
            }
        }

    }
}
