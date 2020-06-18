public class QueueArray {
    private int queue[];
    private int capasity;
    private int rear = -1 , front = 0;
    public QueueArray(){
        queue = new int[10];
        capasity = 10;
    }
    public QueueArray(int size){
        queue = new int[size];
        capasity = size;
    }

    public void enQueue(int data){
        if(rear == -1 && rear == front){
            front = 0;
        }
        if(rear+1 == capasity){
            System.out.println("Queue full");
            return;
        }
        queue[++rear] = data;
    }

    public int deQueue() {
        if (front == rear && rear == -1 || front + 1 > rear) {
            System.out.println("Queue is empty");
            front = rear = -1;
            return -1;
        }
        int temp = queue[front];
        front++;
        if(front > rear){
            front = rear = -1;
        }
        return temp;
    }
    public void traverse(){
        if(rear == -1 && rear == front){
            System.out.println("Queue empty");
        }
        int i = front;
        while(i <= rear){
            System.out.print(queue[i]+" ");
            i++;
        }
        System.out.println();
    }
}
