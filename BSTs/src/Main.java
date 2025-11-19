public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for(int i = 0; i < 10; i++) {
            bst.insert((int)(Math.random() * 10000));
        }

        System.out.println(bst.find(100));
        bst.display();

        BinarySearchTree<Integer> copy = bst.copy();
        System.out.println("====================");
        copy.display();
//        System.out.println("====================");
//        bst.displayPostOrder();
        System.out.println("====================");
        bst.displayBreadthFirst();
        BinarySearchTree<Integer> deleteMe = new BinarySearchTree<>();
        deleteMe.insert(10);
        deleteMe.insert(5);
        deleteMe.insert(7);
        deleteMe.insert(6);
        deleteMe.insert(3);
        deleteMe.insert(4);
        deleteMe.insert(14);
        deleteMe.insert(12);
        deleteMe.insert(15);
        deleteMe.insert(17);
        System.out.println("===================");
        deleteMe.display();
        deleteMe.remove(15);
        System.out.println("===================");
        deleteMe.display();
        deleteMe.remove(10);
        System.out.println("===================");
        deleteMe.display();
        deleteMe.remove(5);
        System.out.println("===================");
        deleteMe.display();
        // find the node
        // check the left node
        // if no left node do the easy linked list thing
        // otherwise find the rightmost child of the left node
        // copy the value
        // attach the left child to either the right of left of the parent of the rightmost
        //
    }
}
