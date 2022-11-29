import java.util.Scanner;

public class BinaryTreeUse {

  public static void PrintBinaryTree(BinaryTree<Integer> root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + ": ");

    if (root.left != null) {
      System.out.print("L: " + root.left.data + ", ");
    }

    if (root.right != null) {
      System.out.print("R: " + root.right.data);
    }

    System.out.println();

    PrintBinaryTree(root.left);
    PrintBinaryTree(root.right);
    return;
  }

  public static BinaryTree<Integer> takeTreeInput() {
    System.out.println("Enter Root data : ");
    Scanner sc = new Scanner(System.in);
    int rootData = sc.nextInt();

    if (rootData == -1) {
      return null;
    }
    BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);

    BinaryTree<Integer> leftTree = takeTreeInput();
    root.left = leftTree;

    BinaryTree<Integer> rightTree = takeTreeInput();
    root.right = rightTree;
    return root;
  }

  public static BinaryTree<Integer> takeTreeInputBetter(
    boolean isRoot,
    int parentData,
    boolean isLeft
  ) {
    if (isRoot) {
      System.out.println("Enter Root data : ");
    } else {
      if (isLeft) {
        System.out.println("Enter Left Child of " + parentData);
      } else {
        System.out.println("Enter Right Child of " + parentData);
      }
    }

    Scanner sc = new Scanner(System.in);
    int rootData = sc.nextInt();

    if (rootData == -1) {
      return null;
    }
    BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);

    BinaryTree<Integer> leftTree = takeTreeInputBetter(false, rootData, true);
    root.left = leftTree;

    BinaryTree<Integer> rightTree = takeTreeInputBetter(false, rootData, false);
    root.right = rightTree;
    return root;
  }

  public static int noOfNodesInTree(BinaryTree<Integer> root) {
    if (root == null) {
      return 0;
    }

    int leftNodes = noOfNodesInTree(root.left);
    int rightNodes = noOfNodesInTree(root.right);

    return 1 + leftNodes + rightNodes;
  }

  public static void main(String[] args) {
    BinaryTree<Integer> root = takeTreeInputBetter(true, 0, false);
    PrintBinaryTree(root);
    int nodes = noOfNodesInTree(root);
    System.out.println("No of Nodes in the Tree = " + nodes);
  }
}
