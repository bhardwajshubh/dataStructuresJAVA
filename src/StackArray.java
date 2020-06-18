public class StackArray {
    int capasity = 10;
    int top = -1;
    private int[] i;
    public StackArray(){
        i = new int[10];

    }

    public StackArray(int size){
        i = new int[size];
        capasity = size;
    }

    private boolean isEmplty(int top){
        if(top == -1){
            return true;
        }
        return false;
    }
    private boolean isFull(int top){
        if(top+1 == capasity){
            return true;
        }
        return false;
    }

    public void push(int data){
        if(isFull(top)){
            System.out.println("Stack is full");
            return;
        }
        i[++top] = data;
    }

    public int pop(){
        if(isEmplty(top)){
            System.out.println("Stack under flow");
            return 0;
        }
        int temp = i[top];
        top--;
        return temp;
    }

    public void peek(){
        if (isEmplty(top)){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(i[top]);
    }
}
