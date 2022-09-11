public class sumLeafNodes {
    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;

        }
    }
 static class BinaryTree{
        static int index=-1;
        public static Node buildTrees(int nodes[]) {
            index++;// this wiil create root note at index 0
            if (nodes[index] == -1) {
                return null;
            }

        Node newNode= new Node(nodes[index]);
        newNode.left= buildTrees(nodes);
        newNode.right= buildTrees(nodes);

        return  newNode;
        }
 }

    public static void main(String[] args) {
        int[] nodes= {1,2,3,-1,3,5,-2, 5, -1, 2, -3,2, 1, 1, 0};
        System.out.println("sum of leaf nodes is : ");
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTrees(nodes);
        System.out.println(root.data);
    }
}
