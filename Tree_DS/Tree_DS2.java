package Tree_DS;

class Tree {

    int data;
    Tree left, right;

    public Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree_DS2 {

    private static Tree root = null;
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static Tree search(Tree root, int data) {
        Tree parent = null;
        while (root != null) {
            if (root.data == data) {
                return null;
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

    public static void addNewData() {
        try {
            System.out.println("Enter data : ");
            int data = scanner.nextInt();
            Tree newData = new Tree(data);
            if (root == null) {
                root = newData;
                System.out.println("New Node Added!!");
            } else {
                Tree parent = search(root, data);
                if (parent.data == data) {
                    System.out.println("Duplicate value not allowed !!");
                } else {
                    if (parent.data > data) {
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

    public static void traversePreOrder(Tree root) {
        try {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void traverseInOrder(Tree root) {
        try {
            if (root == null) {
                return;
            }
            traverseInOrder(root.left);
            System.out.println(root.data);
            traverseInOrder(root.right);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void traversePostOrder(Tree root) {
        try {
            if (root == null) {
                return;
            }
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.println(root.data);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static Tree getDeleteNode(Tree root, int data) {
        Tree prev = null, r1, r2;
        if (root.data == data) {
            if (root.left == root.right) {
                prev = null;
            } else if (root.left == null) {
                prev = root.right;
            } else if (root.right == null) {
                prev = root.left;
            } else {
                r1 = r2 = root.right;
                while (r1.right != null) {
                    r1 = r1.left;
                }
                r1.left = root.left;
                return r2;
            }
        } else if (root.data > data) {
            root.left = getDeleteNode(root.left, data);
        } else {
            root.right = getDeleteNode(root.right, data);
        }
        return prev;
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---- Tree Menu ----");
            System.out.println("1. Add new Node");
            System.out.println("2. Traverse (Pre Order)");
            System.out.println("3. Traverse (In Order)");
            System.out.println("4. Traverse (Post Order)");
            System.out.println("5. Delete a Node");
            System.out.println("6. Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            if (choice == 1) {
                addNewData();
            } else if (choice == 2) {
                if (root == null) {
                    System.out.println("Tree is empty!!");
                } else {
                    traversePreOrder(root);
                }
            } else if (choice == 3) {
                if (root == null) {
                    System.out.println("Tree is empty!!");
                } else {
                    traverseInOrder(root);
                }
            } else if (choice == 4) {
                if (root == null) {
                    System.out.println("Tree is empty!!");
                } else {
                    traversePostOrder(root);
                }
            } else if (choice == 5) {
                if (root == null) {
                    System.out.println("Tree is empty!!");
                } else {
                    int data;
                    System.out.println("Enter data to delete : ");
                    data = scanner.nextInt();
                    root = getDeleteNode(root, data);
                }
            } else if (choice == 6) {
                System.out.println("Exited!!");
            } else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}
