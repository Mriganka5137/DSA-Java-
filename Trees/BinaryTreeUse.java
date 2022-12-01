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

  public static int largest(BinaryTree<Integer> root) {
    if (root == null) {
      return -1;
    }

    int largestLeft = largest(root.left);
    int largestRight = largest(root.right);

    return Math.max(root.data, Math.max(largestLeft, largestRight));
  }

  public static int numOfLeaves(BinaryTree<Integer> root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    return numOfLeaves(root.left) + numOfLeaves(root.right);
  }

  public static void printAtDepthK(BinaryTree<Integer> root, int k) {
    if (root == null) {
      return;
    }

    if (k == 0) {
      System.out.println(root.data);
      return;
    }

    printAtDepthK(root.left, k - 1);
    printAtDepthK(root.right, k - 1);
    return;
  }

  public static void changeToDepthTree(BinaryTree<Integer> root, int depth) {
    if (root == null) {
      return;
    }

    root.data = depth;
    changeToDepthTree(root.left, depth + 1);
    changeToDepthTree(root.right, depth + 1);
    return;
  }

  public static boolean isNodePresent(BinaryTree<Integer> root, int x) {
    if (root == null) {
      return false;
    }

    if (root.data == x) {
      return true;
    }

    return isNodePresent(root.left, x) || isNodePresent(root.right, x);
  }

  public static void printNodesWithoutSibling(BinaryTree<Integer> root) {
    if (root == null) {
      return;
    }

    if (root.left == null && root.right != null) {
      System.out.print(root.data + " ");
    }
    if (root.left != null && root.right == null) {
      System.out.print(root.data + " ");
    }

    printNodesWithoutSibling(root.left);
    printNodesWithoutSibling(root.right);
  }

  public static BinaryTree<Integer> removeLeaves(BinaryTree<Integer> root) {
    if (root == null) {
      return null;
    }

    if (root.left == null && root.right == null) {
      return null;
    }

    root.left = removeLeaves(root.left);
    root.right = removeLeaves(root.right);
    return root;
  }

  public static BinaryTree<Integer> mirrorBinaryTree(BinaryTree<Integer> root) {
    if (root == null) {
      return null;
    }

    BinaryTree<Integer> temp = root.left;
    root.left = root.right;
    root.right = temp;

    root.left = mirrorBinaryTree(root.left);
    root.right = mirrorBinaryTree(root.right);

    return root;
  }

  public static void main(String[] args) {
    BinaryTree<Integer> root = takeTreeInputBetter(true, 0, false);
    PrintBinaryTree(root);
    int nodes = noOfNodesInTree(root);
    System.out.println("No of Nodes in the Tree = " + nodes);

    int largestNode = largest(root);
    System.out.println("Largest Node in the tree = " + largestNode);

    System.out.println("Num of Leaves in the Tree " + numOfLeaves(root));

    printAtDepthK(root, 3);

    // changeToDepthTree(root, 0);
    PrintBinaryTree(root);
    boolean flag = isNodePresent(root, 5);
    System.out.println(flag);

    printNodesWithoutSibling(root);

    // BinaryTree<Integer> newRoot = removeLeaves(root);

    BinaryTree<Integer> newRoot = mirrorBinaryTree(root);

    PrintBinaryTree(newRoot);
  }
}
