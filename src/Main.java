import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String...sdkfhu){
        Tree root = null;

        TreeMethods tm = new TreeMethods();
        root = tm.insertNode(25 , root);
        tm.insertNode(10 , root);
        tm.insertNode(7 , root);
        tm.insertNode(5 , root);
        tm.insertNode(18 , root);
        tm.insertNode(98 , root);
        tm.insertNode(29 , root);
        tm.insertNode(100 , root);
        tm.treeSearch(root , 88);
    }
}
