import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeMethods {


    public Tree insertNode(int data , Tree root){
        if(root == null){
            Tree node = new Tree();
            node.data = data;
            root = node;
            return root;
        }
        if(data < root.data){
            if(root.left !=null){
                insertNode(data , root.left);
            }else{
                Tree node = new Tree();

                node.data = data;
                root.left = node;
            }
        }else {
            if(root.right != null)
                insertNode(data , root.right);
            else{
                Tree node = new Tree();
                node.data = data;
                root.right = node;
            }
        }
        return root;
    }

    public void treeTraversalInOrder(Tree root){ // inOrder
        if(root.left != null)
            treeTraversalInOrder(root.left);
        System.out.print(root.data+" ");
        if(root.right != null)
            treeTraversalInOrder(root.right);
    }

    public void treeTraversalPreOrder(Tree root){ // preOrder
        System.out.print(root.data+" ");
        if(root.left != null)
            treeTraversalInOrder(root.left);
        if(root.right != null)
            treeTraversalInOrder(root.right);
    }

    public void treeTraversalPostOrder(Tree root){ // postOrder
        if(root.left != null)
            treeTraversalInOrder(root.left);
        if(root.right != null)
            treeTraversalInOrder(root.right);
        System.out.println(root.data);
    }

    public void breadthTraversal(Tree root){
        Queue q = new LinkedList();
        if(root == null){
            System.out.println("Empty Tree");
            return;
        }
        q.add(root);
        Tree temp;
        System.out.print("Breadth first search traversal : ");
        while(!q.isEmpty()){
            temp = (Tree)q.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!= null)
                q.add(temp.right);
        }
    }

    public void preOrderIteration(Tree root){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        Stack s = new Stack();
        s.push(root);
        Tree temp;
        System.out.print("Preorder traversal : ");
        while(!s.empty()){
            temp = (Tree)s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!= null)
                s.push(temp.right);
            if(temp.left!=null)
                s.push(temp.left);
        }
    }

    public void inOrderIteration(Tree root){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }


    }
    public void smallestElement(Tree root){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        while(root.left!=null){
            root=root.left;
        }
        System.out.println("The smallest element is "+root.data);
    }

    public void largestElement(Tree root){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        while(root.right!=null){
            root=root.right;
        }
        System.out.println("The largest element is "+root.data);
    }

    public boolean treeSearch(Tree root , int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        } else if(data < root.data){
            if(root.left!= null){
                return treeSearch(root.left , data);
            } else {
                return false;
            }
        } else if(data > root.data){
            if(root.right!= null){
                return treeSearch(root.right , data);
            } else {
                return false;
            }
        }
        return false;
    }


}
