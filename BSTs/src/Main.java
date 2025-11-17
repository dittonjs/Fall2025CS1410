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

    }
}
