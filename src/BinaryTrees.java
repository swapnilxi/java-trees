import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class BinaryTrees {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
        //creating root node and other nodes
        private Node root= null;
        private int size=0;

//Binary Tree Constructor
    BinaryTrees(){
        Scanner s= new Scanner(System.in);
        //creating root node, having no parent and is not child
        this.root= takeInput(s, null, false);
    }
private Node takeInput(Scanner s, Node parent, boolean isLeftChild){
   if(parent== null) {
        System.out.println("Enter the data for Root Node: ");
    }else{
        if(isLeftChild){
            System.out.println("enter the data for left child "+ parent.data);
        }else{
            System.out.println("enter the data for right child "+ parent.data);
        }

    }
 int nodeData=s.nextInt();
   Node node= new Node( nodeData, null,null);
   this.size++;
   boolean choice=false;
    System.out.println("Do you have left child of  "+ node.data+" True for yes and False for No");
    choice= s.nextBoolean();

    if(choice){
        node.left=takeInput(s, node, true);
    }
    choice=false;
    System.out.println("Do you have any right child of "+ node.data+ " True for yes and False for No");
    choice= s.nextBoolean();
    if(choice) {
        node.right = takeInput(s, node, false);
    }

    return  node;

}
public void display(){
        this.display(root);
}
private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+node.left.data+"=>";
        }else{
            str=str+"END=>";
        }
        str= str+node.data;
    if(node.right!=null){
        str= str+"<="+ node.right.data;
    }else{
        str=str+"<=END";
    }
    System.out.println(str);
    //for all nodes
    if(node.left!=null){
        this.display(node.left);
    }
    if(node.right!=null){
        this.display(node.right);
    }

}
public  int height(){
return this.height(this.root );
}
private int height(Node node){
if(node==null){
    return -1;
}
int lheight=this.height(node.left);
int rheight= this.height(node.right);
int height=Math.max(lheight, rheight);
return  height+1;
}
public  void  preOrder(){
        this.preOrder(this.root);
}

private void preOrder(Node node){
        //node=>left=>right
        if (node==null) return;
    System.out.println(node.data+" ");
    preOrder(node.left);
    preOrder(node.right);
}
}
