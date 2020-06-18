public class LinkedMethods {
    Linked head = null;
    public void insertBegin(int data){
        Linked node = new Linked();
        node.data = data;
        node.next = null;
        if(isEmpty(head)){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void insertEnd(int data){
        Linked node = new Linked();
        node.data = data;
        node.next = null;
        if(isEmpty(head)){
            head = node;
            return;
        }

        Linked temp = head;
        while (temp.next !=null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public static boolean isEmpty(Linked head){
        if(head == null){
            return true;
        }
        return false;
    }

    public static void traverse(Linked head){
        if(isEmpty(head)){
            System.out.println("Empty List");
            return;
        }
        Linked temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            try{ Thread.sleep(500); }catch (Exception e){}
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
