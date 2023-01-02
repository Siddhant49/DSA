package pepCoding.trees;


import java.util.ArrayList;
import java.util.List;

/*
    Tree is a directed graph (no cycle)
    binary tree -> val, right and left child/node
    application -> BST

    size => right + left + 1
    tree height (the deepest child to root)= depth(root to deepest child)
    max number of edges on either child
 */
public class Day01 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(13);

        TreeNode node2 = new TreeNode(14);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(16);

        TreeNode node5 = new TreeNode(17);

        TreeNode node6 = new TreeNode(18);

        TreeNode node7 = new TreeNode(19);

        TreeNode node8 = new TreeNode(20);


        TreeNode node9 = new TreeNode(21);

        TreeNode node0 = new TreeNode(22);

        node9.left = node0;
        node8.left = node9;
        node6.right = node8;
        node6.left = node7;
        node0.left = node5;
        root.left = node6;
        int val = 17;
        ArrayList<TreeNode> treeNodes = root.nodeToRootPath(root, val);
        if (treeNodes.isEmpty())
            System.out.println(val + " not present in tree");
        System.out.println("nodeToRootPath");
        treeNodes.forEach(node -> System.out.print(node.val + "\t"));
        System.out.println();
        ArrayList<Integer> oneParent = root.exactlyOneChild(root);
        if (treeNodes.isEmpty())
            System.out.println("single parent not present in tree");
        System.out.println("exactlyOneChild");
        oneParent.forEach(node -> System.out.print(node + "\t"));
        System.out.println();
        System.out.println("Count single parent");
        List<Integer> countSingleParent = new ArrayList<>();
        root.countSingleParent(root, countSingleParent);
        System.out.println(countSingleParent.size()); //fix please!!!!
        System.out.println("getListOfPathOfLeaf");
        List<ArrayList<Integer>> listOfPathOfLeaf = root.getListOfPathOfLeaf(root);
        listOfPathOfLeaf.forEach(integers -> {
            integers.forEach(integer -> System.out.print(integer + " "));
            System.out.println();
        });
    }
}
