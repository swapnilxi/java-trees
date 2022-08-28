public class BSTClient {
    public static void main(String[] args) {
        int[] inArray={10,20,30,40,50,60,70};
        BST bst= new BST(inArray);
        bst.display();
        System.out.println(bst.find(30));
        System.out.println(bst.Max());
        bst.add(27);
        bst.display();
        bst.remove(30);
    }

}
