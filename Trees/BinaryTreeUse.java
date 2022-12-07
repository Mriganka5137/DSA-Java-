import java.util.*;

public class BinaryTreeUse {

  public static BinaryTree<Integer> takeTreeInputLevelwise() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Root Data ");
    int rootData = sc.nextInt();

    // If user enters -1 as root -> Root is null
    if (rootData == -1) {
      return null;
    }

    // Inserted the root node into the front of the Queue
    BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
    Queue<BinaryTree<Integer>> pendingQueue = new LinkedList<BinaryTree<Integer>>();
    pendingQueue.add(root);

    while (!pendingQueue.isEmpty()) {
      BinaryTree<Integer> temp = pendingQueue.remove();

      // Asking for left node data of the removed or front ele that is just removed
      System.out.println("Enter the leftchild of " + temp.data);
      int leftChild = sc.nextInt();
      if (leftChild != -1) {
        BinaryTree<Integer> left = new BinaryTree<Integer>(leftChild);
        temp.left = left;
        pendingQueue.add(left);
      }

      // Asking for right node data of the removed or front ele that is just removed
      System.out.println("Enter the rightchild of " + temp.data);
      int rightChild = sc.nextInt();
      if (rightChild != -1) {
        BinaryTree<Integer> right = new BinaryTree<Integer>(rightChild);
        temp.right = right;
        pendingQueue.add(right);
      }
    }

    return root;
  }

  public static void printLevelWise(BinaryTree<Integer> root) {
    if (root == null) {
      return;
    }

    Queue<BinaryTree<Integer>> q = new LinkedList<BinaryTree<Integer>>();
    q.add(root);

    while (!q.isEmpty()) {
      BinaryTree<Integer> temp = q.remove();

      System.out.print(temp.data + ": ");

      if (temp.left != null) {
        System.out.print("L: " + temp.left.data + ", ");
        q.add(temp.left);
      }

      if (temp.right != null) {
        System.out.print("R: " + temp.right.data);
        q.add(temp.right);
      }
      System.out.println();
    }
  }

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

  public static boolean isTreeBalanced(BinaryTree<Integer> root) {
    if (root == null) {
      return true;
    }

    int leftHeight = heightOfTree(root.left);
    int rightHeight = heightOfTree(root.right);

    if (Math.abs(rightHeight - leftHeight) > 1) {
      return false;
    }

    return isTreeBalanced(root.left) && isTreeBalanced(root.right);
  }

  public static int heightOfTree(BinaryTree<Integer> root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = heightOfTree(root.left);
    int rightHeight = heightOfTree(root.right);

    return 1 + Math.max(leftHeight, rightHeight);
  }

  public static BalancedTreeReturn isTreeBalancedBetter(
    BinaryTree<Integer> root
  ) {
    if (root == null) {
      BalancedTreeReturn ans = new BalancedTreeReturn();
      ans.height = 0;
      ans.isBal = true;
      return ans;
    }

    BalancedTreeReturn leftOutput = isTreeBalancedBetter(root.left);
    BalancedTreeReturn rightOutput = isTreeBalancedBetter(root.right);

    int height = Math.max(leftOutput.height, rightOutput.height) + 1;
    boolean isBal = true;

    if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
      isBal = false;
    }

    if (!leftOutput.isBal || !rightOutput.isBal) {
      isBal = false;
    }

    BalancedTreeReturn ans = new BalancedTreeReturn();
    ans.height = height;
    ans.isBal = isBal;
    return ans;
  }

  public static BinaryTree<Integer> buildTreeHelperInPre(
    int[] preOrder,
    int siPre,
    int eiPre,
    int[] inOrder,
    int siIn,
    int eiIn
  ) {
    if (siPre > eiPre) {
      return null;
    }
    int rootData;
    int rootIndex = 0;
    int leftSiPre; //found
    int leftEiPre; //
    int leftSiIn; //found
    int leftEiIn; //found
    int rightSiIn;
    int rightEiIn;
    int rightSiPre;
    int rightEiPre;

    rootData = preOrder[siPre];

    for (int i = 0; i < inOrder.length; i++) {
      if (inOrder[i] == rootData) {
        rootIndex = i;
        break;
      }
    }

    // InOrder
    leftSiIn = siIn;
    leftEiIn = rootIndex - 1;
    rightSiIn = rootIndex + 1;
    rightEiIn = eiIn;

    // PreOrder
    int noOfLeftEle = leftEiIn - leftSiIn + 1;
    int noOfRightEle = rightEiIn - rightSiIn + 1;
    leftSiPre = siPre + 1;
    leftEiPre = leftSiPre + noOfLeftEle - 1;
    rightSiPre = leftEiPre + 1;
    rightEiPre = rightSiPre + noOfRightEle - 1;

    BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
    // BinaryTree<Integer> leftTree;
    // BinaryTree<Integer> rightTree;

    root.left =
      buildTreeHelperInPre(
        preOrder,
        leftSiPre,
        leftEiPre,
        inOrder,
        leftSiIn,
        leftEiIn
      );
    root.right =
      buildTreeHelperInPre(
        preOrder,
        rightSiPre,
        rightEiPre,
        inOrder,
        rightSiIn,
        rightEiIn
      );

    return root;
  }

  public static BinaryTree<Integer> buildTreeHelperInPost(
    int[] postOrder,
    int siPost,
    int eiPost,
    int[] inOrder,
    int siIn,
    int eiIn
  ) {
    if (siIn > eiIn) {
      return null;
    }

    int rootData = postOrder[eiPost];
    int rootIndex = 0;
    //indexes for post Order
    int leftSiPost;
    int leftEiPost;
    int rightSiPost;
    int rightEiPost;

    // Indexes for Inorder
    int leftSiIn;
    int leftEiIn;
    int rightSiIn;
    int rightEiIn;

    int noOfLeftELe;
    int noOfRightEle;

    for (int i = siIn; i <= eiIn; i++) {
      if (inOrder[i] == rootData) {
        rootIndex = i;
        break;
      }
    }

    // InOrder Indexes
    leftSiIn = siIn;
    leftEiIn = rootIndex - 1;

    rightSiIn = rootIndex + 1;
    rightEiIn = eiIn;

    noOfLeftELe = leftEiIn - leftSiIn + 1;
    noOfRightEle = rightEiIn - rightSiIn + 1;

    //Post Order Indexes
    leftSiPost = siPost;
    leftEiPost = leftSiPost + noOfLeftELe - 1;

    rightSiPost = leftEiPost + 1;
    rightEiPost = rightSiPost + noOfRightEle - 1;

    BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
    root.left =
      buildTreeHelperInPost(
        postOrder,
        leftSiPost,
        leftEiPost,
        inOrder,
        leftSiIn,
        leftEiIn
      );
    root.right =
      buildTreeHelperInPost(
        postOrder,
        rightSiPost,
        rightEiPost,
        inOrder,
        rightSiIn,
        rightEiIn
      );
    return root;
  }

  public static void main(String[] args) {
    // BinaryTree<Integer> root = takeTreeInputBetter(true, 0, false);

    // BinaryTree<Integer> root = takeTreeInputLevelwise();
    // // PrintBinaryTree(root);

    // printLevelWise(root);

    // int nodes = noOfNodesInTree(root);
    // System.out.println("No of Nodes in the Tree = " + nodes);

    // int largestNode = largest(root);
    // System.out.println("Largest Node in the tree = " + largestNode);

    // System.out.println("Num of Leaves in the Tree " + numOfLeaves(root));

    // printAtDepthK(root, 3);

    // // changeToDepthTree(root, 0);
    // PrintBinaryTree(root);
    // boolean flag = isNodePresent(root, 5);
    // System.out.println(flag);

    // printNodesWithoutSibling(root);

    // // BinaryTree<Integer> newRoot = removeLeaves(root);

    // BinaryTree<Integer> newRoot = mirrorBinaryTree(root);

    // PrintBinaryTree(newRoot);

    // // System.out.println(isTreeBalanced(newRoot));

    // System.out.println(isTreeBalancedBetter(newRoot).isBal);
    int[] postOrder = { 4, 5, 2, 6, 7, 3, 1 };
    int[] preOrder = { 1, 2, 4, 5, 3, 6, 7 };
    int[] inOrder = { 4, 2, 5, 1, 6, 3, 7 };
    BinaryTree<Integer> root = buildTreeHelperInPre(
      preOrder,
      0,
      preOrder.length - 1,
      inOrder,
      0,
      inOrder.length - 1
    );

    BinaryTree<Integer> root2 = buildTreeHelperInPost(
      preOrder,
      0,
      postOrder.length - 1,
      inOrder,
      0,
      inOrder.length - 1
    );

    printLevelWise(root);
    printLevelWise(root2);
  }
}
