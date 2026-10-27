public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive = new BinarySearchTree<>();
        int[] sampleIds = {50, 25, 75, 10, 30, 60, 85};

        for (int id : sampleIds) {
            archive.add(id);
        }

        System.out.println("Archive initialized with sample IDs.");
        System.out.println("Height: " + archive.height());

        System.out.print("Inorder: ");
        archive.inOrderTraversal();

        System.out.print("Preorder: ");
        archive.preOrderTraversal();


        BinarySearchTree<Integer> empty = new BinarySearchTree<>();

        System.out.println("\nEmpty tree");
        System.out.println("Height: " + empty.height());

        System.out.print("Inorder: ");
        empty.inOrderTraversal();

        System.out.print("Preorder: ");
        empty.preOrderTraversal();

  
        BinarySearchTree<Integer> single = new BinarySearchTree<>();
        single.add(50);

        System.out.println("\nSingle-node tree");
        System.out.println("Height: " + single.height());

        System.out.print("Inorder: ");
        single.inOrderTraversal();

        System.out.print("Preorder: ");
        single.preOrderTraversal();

   
        BinarySearchTree<Integer> skewed = new BinarySearchTree<>();
        int[] sortedIds = {10, 20, 30, 40};

        for (int id : sortedIds) {
            skewed.add(id);
        }

        System.out.println("\nSkewed tree");
        System.out.println("Height: " + skewed.height());

        System.out.print("Inorder: ");
        skewed.inOrderTraversal();

        System.out.print("Preorder: ");
        skewed.preOrderTraversal();
    }
}
