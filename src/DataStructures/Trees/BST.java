package DataStructures.Trees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;
    BST(){
        root = null;
    }

    void DFS(Node root){ // PreOrder
        if (root == null){
            return;
        }

        DFS(root.left);
        System.out.print(root.data + " ");
        DFS(root.right);
    }

    private Node insertRec(Node root, int key) { // makes it private inside BST, so only things inside BST can access it
        if (root == null) {
            return new Node(key);
        }
        if(key < root.data) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.data){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void insert(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node root, int key){
        if(root == null) {
            return false;
        }
        if(key == root.data){
            return true;
        }
        else if (key < root.data) {
            return searchRec(root.left, key);
        }
        else {
            return searchRec(root.right, key);
        }
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

//    static int height(Node root){
//        if(root == null){
//            return 0;
//        }
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//
//        return Math.max(leftHeight, rightHeight);
//    }

    private Node removeRec(Node root, int key){
        if(root == null){
            return null;
        }
        if(key < root.data){
            root.left = removeRec(root.left, key);
        } else if (key > root.data) {
            root.right = removeRec(root.right, key);
        } else { // Element found
            if(root.left == null && root.right == null){
                root = null;
            }
            else if (root.left)
        }
    }

    void remove (int key) {
        root = removeRec(root, key);
    }
}

class DriverCode{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(180);
        bst.insert(30);
        bst.insert(70);
        bst.insert(60);


        bst.DFS(bst.root);

//        System.out.println("\n" + bst.search(70));
    }
}
