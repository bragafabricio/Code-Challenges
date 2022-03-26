import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            String itsAStack = "";
            String itsAQueue = "";
            String itsAPriority = "";

            String desiredOutput = "";

            Stack<String> stack = new Stack<>();
            Queue<String> queue = new LinkedList<>();
            PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i=0; i<n; i++){
                int operation = sc.nextInt();
                String item = sc.next();

                if (operation == 1){
                    stack.push(item);
                    queue.add(item);
                    priorityQueue.add(item);
                } else {
                    desiredOutput += item;
                    itsAStack +=  stack.pop();
                    itsAQueue += queue.poll();
                    itsAPriority += priorityQueue.poll();
                }
            }
            if ((itsAPriority.equals(desiredOutput) && itsAQueue.equals(desiredOutput) && itsAStack.equals(desiredOutput))
                    ||(itsAPriority.equals(desiredOutput) && itsAQueue.equals(desiredOutput))
                    ||(itsAQueue.equals(desiredOutput) && itsAStack.equals(desiredOutput))
                    ||(itsAStack.equals(desiredOutput) && itsAPriority.equals(desiredOutput))){
                System.out.println("not sure");
            } else if (itsAPriority.equals(desiredOutput)) {
                System.out.println("priority queue");
            } else if (itsAQueue.equals(desiredOutput)) {
                System.out.println("queue");
            } else if (itsAStack.equals(desiredOutput)){
                System.out.println("stack");
            }
            else {
                System.out.println("impossible");
            }
        }
    }
}
