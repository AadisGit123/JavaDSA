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
        this.root = null;
    }

    void DFS(Node root){ // InOrder: returns element in a sorted order.
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
        } else {
            // Element to be deleted is found
            // Case 1: Node with 0 or 1 child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                // Case 2: Node with 2 children
            Node successor = findSuccessor(root.right);
            root.data = successor.data;
            root.right = removeRec(root.right, successor.data);
        }
        return root;
    }

    private Node findSuccessor(Node node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }
    void remove(int key) {
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
        bst.insert(110);
        bst.insert(130);
        bst.insert(120);
        bst.insert(180);
        bst.insert(55);
        bst.DFS(bst.root);
        System.out.println();
        bst.remove(100);
        bst.DFS(bst.root);
        System.out.println();
        bst.remove(55);
        bst.DFS(bst.root);
        System.out.println();
        bst.remove(110);
        bst.DFS(bst.root);
        System.out.println();
        bst.remove(180);
        bst.DFS(bst.root);

//        System.out.println("\n" + bst.search(70));
    }
}
