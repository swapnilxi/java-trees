public class BST {
    private class Node {
        int data;
        Node left;
        Node right;
    }

    public BST(int arr[]) {
        this.root = construct(arr, 0, arr.length - 1);
    }

    private Node construct(int[] arr, int lo, int hi) {
//Base case
        if (lo > hi) {
            return null;
        }
        // mid
        int mid = (lo + hi) / 2;
        // new Node
        Node nn = new Node();
        nn.data = arr[mid];
        nn.left = construct(arr, lo, mid - 1);
        nn.right = construct(arr, mid + 1, hi);
        return nn;

    }

    private Node root;

    private void display(Node node) {

        if (node == null) {
            return;
        }
        //creating string and printing
        String str = "";
        if (node.left == null) {
            str += "END";
        } else {
            str += node.left.data;
        }
        str += "->" + node.data + "<-";

        if (node.right == null) {
            str += "END";
        } else {
            str += "->" + node.right.data + "<-";
        }
        System.out.println(str);
        //for all nodes
        display(node.left);
        display(node.right);


    }

    public void display() {
        this.display(this.root);
    }

    //find

    public boolean find(int item) {
        return this.find(this.root, item);
    }

    private boolean find(Node node, int item) {
        if (node == null) {
            return false;
        }
        if (item < node.data) {
            return find(node.left, item);
        } else if (item > node.data) {
            return find(node.right, item);
        } else {
            return true;
        }
    }

    public int Max() {
        return Max(this.root);
    }

    private int Max(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return Max(node.right);
    }

    //add to BST
    public  void add(int item){
        this.add(root, item);
    }
    private void add(Node node, int item) {
        if (item < node.data) {
            if (node.left == null) {
                Node nn = new Node();
                nn.data = item;
            } else {
                add(node.left, item);
            }
        } else {
            if (node.right == null) {
                Node nn = new Node();
                nn.data = item;
            } else {
                add(node.right, item);
            }
        }
    }
      //remove

        public void remove(int item ) {
          remove(this.root, null, false, item);
        }



    private void remove(Node node, Node parent, boolean ilc, int item) {
        if(node==null){
            return;
        }

        if(item> node.data){
            remove(node.right,node, false, item);
        }else  if (item< node.data){
            remove(node.left, node, true, item);
        }
        else {
            if(node.left==null&&node.right==null){
                if(ilc){
                  parent.left=null;
                }else{
                    parent.right=null;
                }

            }
            else if (node.left==null && node.right != null) {
                if(ilc){
                    parent.left= node.right;
                    //as there is element in the right
                }else {
                    parent.right= node.right;
                }

            }
            else if (node.left!=null && node.right == null) {
                if(ilc){
                    parent.left= node.left;
                }else{
                    parent.right=node.left;
                }
            }
            //this is critical case, where we have to take cosideration of left max or right min to replace node
            //n.l!=null && n.r!= null
            else{
                //we will consider left max
                int Max=Max(node.left);
                node.data= Max;
                remove(node.left,node, true, Max);
            }
        }

    }
    public boolean isBST(){
        return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
    private boolean isBST(Node node, int min, int max ){
        if(node== null )return true;
     if(node.data > max|| node.data <min) return false;

     else if(! this.isBST(node.left, Integer.MIN_VALUE , node.data )){
         return  false;
     }
     else if(! this.isBST(node.right,node.data, Integer.MAX_VALUE)){
        return false;
     }
     return true;
    }
}
