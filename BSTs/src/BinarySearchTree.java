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



}
