package chapters.chapter7;

import java.util.StringJoiner;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int data) {
        insertNode(data, root);
    }

    public TreeNode find(int data) {
        if (root == null)
            return null;

        return findNodeByData(data, root);
    }

    public void delete(int data) {
        TreeNode currentNode = root;
        TreeNode parentNode = root;
        boolean isLeftChild = false;

        while (currentNode != null && currentNode.getData() != data) {
            parentNode = currentNode;

            if (currentNode.getData() > data) {
                currentNode = currentNode.getLeftChild();
                isLeftChild = true;
            } else {
                currentNode = currentNode.getRightChild();
                isLeftChild = false;
            }
        }

        if (currentNode == null)
            return;

        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null)
            deleteLeafNode(currentNode, parentNode, isLeftChild);
        else if (currentNode.getLeftChild() == null || currentNode.getRightChild() == null)
            deleteSingleChildNode(currentNode, parentNode, isLeftChild);
        else
            softDeleteTwoChildrenNode(data);
    }

    private void deleteLeafNode(TreeNode node, TreeNode parentNode, boolean isLeftChild) {
        if (node == root)
            root = null;
        else if (isLeftChild)
            parentNode.setLeftChild(null);
        else
            parentNode.setRightChild(null);
    }

    private void deleteSingleChildNode(TreeNode node, TreeNode parentNode, boolean isLeftChild) {
        TreeNode newChild = node.getLeftChild() == null ? node.getRightChild() : node.getLeftChild();

        if (node == root)
            root = newChild;
        else if (isLeftChild)
            parentNode.setLeftChild(newChild);
        else
            parentNode.setRightChild(newChild);
    }

    private void softDeleteTwoChildrenNode(int data) {
        find(data).delete();
    }

    private void hardDeleteTwoChildrenNode(TreeNode node, TreeNode parentNode, boolean isLeftChild) {
        // todo
    }

    private void insertNode(int data, TreeNode currentNode) {
        if (root == null) {
            root = new TreeNode(data);

            return;
        }

        if (data >= currentNode.getData()) {
            if (currentNode.getRightChild() == null)
                currentNode.setRightChild(new TreeNode(data));
            else
                insertNode(data, currentNode.getRightChild());
        } else {
            if (currentNode.getLeftChild() == null)
                currentNode.setLeftChild(new TreeNode(data));
            else
                insertNode(data, currentNode.getLeftChild());
        }
    }

    private TreeNode findNodeByData(int data, TreeNode currentNode) {
        if (currentNode.getData() == data && !currentNode.isDeleted())
            return currentNode;
        else if (currentNode.getData() > data && currentNode.getLeftChild() != null)
            return findNodeByData(data, currentNode.getLeftChild());
        else if (currentNode.getRightChild() != null)
            return findNodeByData(data, currentNode.getRightChild());
        else
            return null;
    }

    public TreeNode findNodeBySmallestValue() {
        if (root == null)
            return null;

        TreeNode currentNode = root;
        while (true) {
            if (currentNode.getLeftChild() == null)
                return currentNode;

            currentNode = currentNode.getLeftChild();
        }
    }

    public TreeNode findNodeByLargestValue() {
        if (root == null)
            return null;

        TreeNode currentNode = root;
        while (true) {
            if (currentNode.getRightChild() == null)
                return currentNode;

            currentNode = currentNode.getRightChild();
        }
    }

    public String inOrderTraverse() {
        if (root == null)
            return "";

        StringJoiner stringJoiner = new StringJoiner(" ");
        inOrderTraverse(root, stringJoiner);

        return stringJoiner.toString();
    }

    private void inOrderTraverse(TreeNode node, StringJoiner stringJoiner) {
        if (node == null)
            return;

        inOrderTraverse(node.getLeftChild(), stringJoiner);
        stringJoiner.add(String.valueOf(node.getData()));
        inOrderTraverse(node.getRightChild(), stringJoiner);
    }

    public String preOrderTraverse() {
        if (root == null)
            return "";

        StringJoiner stringJoiner = new StringJoiner(" ");
        preOrderTraverse(root, stringJoiner);

        return stringJoiner.toString();
    }

    private void preOrderTraverse(TreeNode node, StringJoiner stringJoiner) {
        if (node == null)
            return;

        stringJoiner.add(String.valueOf(node.getData()));
        preOrderTraverse(node.getLeftChild(), stringJoiner);
        preOrderTraverse(node.getRightChild(), stringJoiner);
    }

    public String postOrderTraverse() {
        if (root == null)
            return "";

        StringJoiner stringJoiner = new StringJoiner(" ");
        postOrderTraverse(root, stringJoiner);

        return stringJoiner.toString();
    }

    private void postOrderTraverse(TreeNode node, StringJoiner stringJoiner) {
        if (node == null)
            return;

        postOrderTraverse(node.getLeftChild(), stringJoiner);
        postOrderTraverse(node.getRightChild(), stringJoiner);
        stringJoiner.add(String.valueOf(node.getData()));
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode node) {
        if (node.getLeftChild() == null && node.getRightChild() == null)
            return 1;

        int leftNodes = 0, rightNodes = 0;

        if (node.getLeftChild() != null)
            leftNodes = height(node.getLeftChild());

        if (node.getRightChild() != null)
            rightNodes = height(node.getRightChild());

        return leftNodes > rightNodes ? leftNodes + 1 : rightNodes + 1;
    }
}
