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

  public static void main(String[] args) {
    BinaryTree<Integer> root = new BinaryTree<Integer>(1);
    BinaryTree<Integer> node1 = new BinaryTree<Integer>(2);
    BinaryTree<Integer> node2 = new BinaryTree<Integer>(3);
    BinaryTree<Integer> node3 = new BinaryTree<Integer>(4);
    BinaryTree<Integer> node4 = new BinaryTree<Integer>(5);

    root.left = node1;
    root.right = node2;

    node1.left = node3;
    node2.right = node4;

    PrintBinaryTree(root);
  }
}
