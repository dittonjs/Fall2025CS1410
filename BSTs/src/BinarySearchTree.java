import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> {
    private class Node {
        T value;
        Node left;
        Node right;
    }

    private Node root;

    public void insert(T value) {
        Node node = new Node();
        node.value = value;
        if (root == null) {
            root = node;
            return;
        }

        Node parent = null;
        Node current = root;
        while(current != null) {
            if (value.compareTo(current.value) < 0) { // go left
                parent = current;
                current = current.left;
            } else if (value.compareTo(current.value) > 0) { // go right
                parent = current;
                current = current.right;
            } else {
                return;
            }
        }

        if (value.compareTo(parent.value) < 0) { // go left
            parent.left = node;
        } else { // go right
            parent.right = node;
        }
    }

    public boolean find(T value) {
        return find(root, value);
    }

    private boolean find(Node node, T value) {
        if (node == null) return false;
        if (node.value.compareTo(value) == 0) return true;

//        if (value.compareTo(node.value) < 0) {
//            return find(node.left, value);
//        } else {
//            return find(node.right, value);
//        }
        return find(
                value.compareTo(node.value) < 0 ? node.left : node.right,
                value
        );

    }

    public void display() {
        display(root,  "");
    }

    private void display(Node node, String indent) {
        if (node == null) return;
        display(node.right, indent + "    ");
        System.out.println(indent + node.value);
        display(node.left, indent + "    ");
    }

    public void displayInOrder() {
        displayInOrder(root);
    }

    private void displayInOrder(Node node) {
        if (node == null) return;
        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);
    }

    public void displayPreOrder() {
        displayPreOrder(root);
    }

    private void displayPreOrder(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        displayPreOrder(node.left);
        displayPreOrder(node.right);
    }

    public void displayPostOrder() {
        displayPostOrder(root);
    }

    private void displayPostOrder(Node node) {
        if (node == null) return;
        displayPostOrder(node.left);
        displayPostOrder(node.right);
        System.out.println(node.value);
    }

    public BinarySearchTree<T> copy() {
        BinarySearchTree<T> newTree = new BinarySearchTree<>();
        copy(root, newTree);
        return newTree;
    }

    private void copy(Node node, BinarySearchTree<T> newTree) {
        if (node == null) return;
        newTree.insert(node.value);
        copy(node.left, newTree);
        copy(node.right, newTree);
    }

    public void displayBreadthFirst() {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.println(node.value);
            if (node.left != null) nodes.add(node.left);
            if (node.right != null) nodes.add(node.right);
        }
    }

    public boolean remove(T value) {
        Node parent = null;
        Node current = root;
        boolean done = false;
        while(!done && current != null) {
            if (value.compareTo(current.value) < 0) {
                parent = current;
                current = current.left;
            } else if(value.compareTo(current.value) > 0) {
                parent = current;
                current = current.right;
            } else{
                done = true;
            }
        }

        if (current == null) return false;

        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node rightMost = current.left;
            Node parentOfRightMost = current;
            while(rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }
            current.value = rightMost.value;
            if(parentOfRightMost == current) {
                parentOfRightMost.left = rightMost.left;
            } else {
                parentOfRightMost.right = rightMost.left;
            }

        }
        return true;
    }


}
