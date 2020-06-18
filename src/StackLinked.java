public class StackLinked {
    private Linked head;
    public void push(int data ){
        Linked node = new Linked();
        node.data = data;
        node.next = null;
        if(LinkedMethods.isEmpty(head)){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public int pop(){
        if(head == null){
            System.out.println("Stack underflow");
            return 0;
        }
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public void peek(){
        System.out.println(head.data);
    }
    public void traverse(){
        LinkedMethods.traverse(head);
    }
}
