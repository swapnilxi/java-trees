//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class GenericTrees {
//private class Node{
//    int data;
//    ArrayList<Node> children=new ArrayList<>();
//    Node(int data){
//        this.data= data ;
//        this.childern=new ArrayList<>();
//    }
//}
//private Node root ;
//private int size;
////generic tree
//GenericTrees(){
//    Scanner s= new Scanner(System.in);
//    this.root= takeInput( s, null, 0);
//
//
//}
////taking the input in the generic tree class
//private Node takeInput(Scanner s, Node parent, int ithchild ){
//  //checking for root or parent node
//    if(this.parent==null){
//        System.out.println("enter the data for the root node:");
//    }else{
//        System.out.println("enter the data for "+ ithchild+ "th child of "
//        +parent.data);
//    }
//
//    //creating node
//    int nodeData=s.nextInt();
//    Node node= new Node(nodeData);
//    this.size++;
//// number of the children
//    System.out.println("Enter the number of children for"+ node.data);
//    int children= s.nextInt();
//
//     for(int i=0; i< children; i++){
//        Node child= this.takeInput(s, node, i);
//        node.children.add(child);
//     }
//     return  node;
//}
//public void display(){
//    this.display(this.root);
//}
//private void display(Node node){
//    String str = node.data+"=>";
//    for(int i=0; i<node.children.size();i++){
//        //adding children data of current node
//        str= str.node.children.get(i).data+", ";
//    }
//    str=str+", END";
//    //display current node data
//    System.out.println(str);
//    //display for all nodes
//    for(int i=0;i < node.children.size();i++){
//        this.display(node.children.get(i));
//
//    }
//
//
//}
//
//}
