package pepCoding.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val){
        this.val = val;
    }

    public static int size(TreeNode node) {
        return Objects.isNull(node) ?
                0 : size(node.left) + size(node.right) + 1;
    }
    public static int height(TreeNode node) {
        return Objects.isNull(node) ?
                -1 : Math.max(height(node.left) , height(node.right)) + 1;
    }
    public static int maxVal(TreeNode node) {
        return Objects.isNull(node) ?
                -1 : Math.max(Math.max(maxVal(node.left) , maxVal(node.right)), node.val);
    }
    public static boolean isPresent(TreeNode node, int input) {
        if (Objects.isNull(node))
            return false;
        if (input==node.val) {
            return true;
        }
        return isPresent(node.left, input) || isPresent(node.right, input);
    }

    public ArrayList<TreeNode> nodeToRootPath(TreeNode root, int data) {
        ArrayList<TreeNode> result = new ArrayList<>();
        isPresentAndPath(root, data, result);
        return result;
    }
    public static boolean isPresentAndPath(TreeNode node, int input, ArrayList<TreeNode> result) {
        if (Objects.isNull(node))
            return false;
        if (input==node.val) {
            result.add(node);
            return true;
        }
//        boolean left = isPresentAndPath(node.left, input, result);
//        if (left) {
//            result.add(node);
//        }
//        boolean right = isPresentAndPath(node.right, input, result);
//        if (right) {
//            result.add(node);
//        }
//        return left || right;
        boolean res = isPresentAndPath(node.left, input, result) || isPresentAndPath(node.right, input, result);
        if (res)
            result.add(node);
        return res;
    }
    public ArrayList<Integer> exactlyOneChild(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        isSingleAndPath(root, ans);
        return ans;
    }
    public static void isSingleAndPath(TreeNode node, ArrayList<Integer> result) {
        if (Objects.isNull(node))
            return;
        if (node.left == null && !(node.right == null))
            result.add(node.val);
        if (node.right== null && !(node.left == null))
            result.add(node.val);
        isSingleAndPath(node.left, result);
        isSingleAndPath(node.right, result);
    }

    public int countSingleParent(TreeNode node, Integer answer) {
        if (node.left == null && !(node.right == null))
            answer++;
        if (node.right == null && !(node.left == null))
            answer++;
        if (node.left!=null)
            countSingleParent(node.left, answer);
        if (node.right!=null)
            countSingleParent(node.right, answer);
        return answer;
    }

    public static void nodeToLeafPathList(TreeNode root, List<ArrayList<Integer>> result, List<Integer> path) {
        if (root==null)
            return;
        if (root.left == null && root.right == null) {
            ArrayList<Integer> base = new ArrayList<>(path);
            base.add(root.val);
            result.add(base);
            System.out.println();
            return;
        }

        path.add(root.val);
        nodeToLeafPathList(root.left, result, path);
        nodeToLeafPathList(root.right, result, path);
        path.remove(path.size()-1);
    }
    public List<ArrayList<Integer>> getListOfPathOfLeaf(TreeNode root) {
        List<ArrayList<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        nodeToLeafPathList(root, result, path);
        return result;
    }

}
