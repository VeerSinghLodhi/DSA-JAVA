package Tree_DS;

class Tree {

    int data;
    Tree left; // Left Node Address
    Tree right; // Right Node Address

    public Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree_DS1 {

    private static Tree root = null;// Root of the Tree
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    // Function for ->search Root of the new node
    public static Tree search(Tree root, int data) {
        Tree parent = null;
        while (root != null) {
            if (root.data == data) {
                return null; // Duplicate value is not allow
            } else if (root.data > data) {
                parent = root;
                root = root.left;
            } else {
                parent = root;
                root = root.right;
            }
        }
        return parent;
    }
    /*
         Explain Binary Tree
         Create a Binary Tree for 50,10,60,55,15,100,7,80
           Root of the Tree is 50
           
                                  50  -->Root
                               /     \
          (n=null)            /       \
                             10       60
                            /  \      /  \
                           /    \    /    \
                          7     15  55    100
                         /\     /\  /\    / \
                        n  n   n  n n n  80  n
    
                 DUPLICATE VALUES IS NOT ALLOW HERE
    */
    // function for add new data.
    public static void addNewData() {
        try {
            Tree parent;
            System.out.print("Enter Data : ");
            int data = scanner.nextInt();
            Tree newData = new Tree(data);
            if (root == null) {
                root = newData;
                System.out.println("New Node Added!!");
            } else {
                parent = search(root, newData.data);
                if (parent == null) {
                    System.out.println("Duplicate Value!!");
                } else {
                    if (parent.data > newData.data) {
                        parent.left = newData;
                    } else {
                        parent.right = newData;
                    }
                    System.out.println("New Node Added!!");
                }
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse (Pre Order)
    public static void traversePreOrder(Tree root) {
        try {
            if (root == null) {
                return;
            }
            System.out.println("Data is " + root.data);
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse(In Order).
    public static void traverseInOrder(Tree root) {
        try {
            if (root == null) {
                return;
            }
            traverseInOrder(root.left);
            System.out.println("Data is " + root.data);
            traverseInOrder(root.right);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse(Post Order).
    public static void traversePostOrder(Tree root) {
        try {
            if (root == null) {
                return;
            }
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.println("Data is " + root.data);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }

    }

    // Main Method 
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---- Tree Menu ----");
            System.out.println("1. Add new Data");
            System.out.println("2. Traverse(Pre Order)");
            System.out.println("3. Traverse(In Order)");
            System.out.println("4. Traverse(Post Order");
            System.out.println("5. Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 ->
                    addNewData();
                case 2 -> {
                    if (root == null) {
                        System.out.println("Tree is Empty!!");
                        return;
                    }
                    traversePreOrder(root);
                }
                case 3 -> {
                    if (root == null) {
                        System.out.println("Tree is Empty!!");
                        return;
                    }
                    traverseInOrder(root);
                }
                case 4 -> {
                    if (root == null) {
                        System.out.println("Tree is Empty!!");
                        return;
                    }
                    traversePostOrder(root);
                }
                case 5 ->
                    System.out.println("Exited!!");
                default ->
                    System.out.println("Invalid Choice!!");
            }

        } while (choice != 5);
    }
}
