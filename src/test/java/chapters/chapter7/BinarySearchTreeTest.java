package chapters.chapter7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinarySearchTreeTest {
    @Test
    public void findRootNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        TreeNode treeNode = binarySearchTree.find(52);

        assertEquals(52, treeNode.getData());
        assertEquals(33, treeNode.getLeftChild().getData());
        assertEquals(65, treeNode.getRightChild().getData());
    }

    @Test
    public void findSecondLevelLeftNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        TreeNode treeNode = binarySearchTree.find(25);

        assertEquals(25, treeNode.getData());
        assertEquals(12, treeNode.getLeftChild().getData());
        assertEquals(27, treeNode.getRightChild().getData());
    }

    @Test
    public void findSecondLevelRightNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        TreeNode treeNode = binarySearchTree.find(78);

        assertEquals(78, treeNode.getData());
        assertEquals(72, treeNode.getLeftChild().getData());
        assertEquals(90, treeNode.getRightChild().getData());
    }

    @Test
    public void findThirdLevelRightNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        TreeNode treeNode = binarySearchTree.find(90);

        assertEquals(90, treeNode.getData());
        assertNull(treeNode.getLeftChild());
        assertNull(treeNode.getRightChild());
    }

    @Test
    public void deleteLeftLeafNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        binarySearchTree.delete(12);
        TreeNode treeNode = binarySearchTree.find(25);

        assertNull(treeNode.getLeftChild());
        assertEquals(27, treeNode.getRightChild().getData());
    }

    @Test
    public void deleteRightLeafNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        binarySearchTree.delete(27);
        TreeNode treeNode = binarySearchTree.find(25);

        assertEquals(12, treeNode.getLeftChild().getData());
        assertNull(treeNode.getRightChild());
    }

    @Test
    public void deleteLeftSingleChildNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        binarySearchTree.delete(72);
        TreeNode treeNode = binarySearchTree.find(78);

        assertEquals(70, treeNode.getLeftChild().getData());
        assertEquals(90, treeNode.getRightChild().getData());
    }

    @Test
    public void deleteRightSingleChildNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        binarySearchTree.insert(49);
        binarySearchTree.delete(48);
        TreeNode treeNode = binarySearchTree.find(39);

        assertEquals(34, treeNode.getLeftChild().getData());
        assertEquals(49, treeNode.getRightChild().getData());
    }

    @Test
    @Disabled("not yet implemented")
    public void hardDeleteTwoChildrenNode() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        binarySearchTree.delete(33);

        TreeNode treeNode = binarySearchTree.find(34);
        assertEquals(25, treeNode.getLeftChild().getData());
        assertEquals(39, treeNode.getRightChild().getData());

        treeNode = binarySearchTree.find(25);
        assertEquals(12, treeNode.getLeftChild().getData());
        assertEquals(27, treeNode.getRightChild().getData());

        treeNode = binarySearchTree.find(12);
        assertNull(treeNode.getLeftChild());
        assertNull(treeNode.getRightChild());

        treeNode = binarySearchTree.find(27);
        assertNull(treeNode.getLeftChild());
        assertNull(treeNode.getRightChild());

        treeNode = binarySearchTree.find(39);
        assertEquals(36, treeNode.getLeftChild().getData());
        assertEquals(48, treeNode.getRightChild().getData());

        treeNode = binarySearchTree.find(36);
        assertNull(treeNode.getLeftChild());
        assertNull(treeNode.getRightChild());

        treeNode = binarySearchTree.find(48);
        assertNull(treeNode.getLeftChild());
        assertNull(treeNode.getRightChild());
    }

    @Test
    public void findNodeBySmallestValue() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        TreeNode treeNode = binarySearchTree.findNodeBySmallestValue();

        assertEquals(12, treeNode.getData());
    }

    @Test
    public void findNodeByLargestValue() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        TreeNode treeNode = binarySearchTree.findNodeByLargestValue();

        assertEquals(90, treeNode.getData());
    }

    @Test
    public void inOrderTraverse() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        String result = binarySearchTree.inOrderTraverse();

        assertEquals("12 25 27 33 34 39 48 52 60 65 70 72 78 90", result);
    }

    @Test
    public void preOrderTraverse() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        String result = binarySearchTree.preOrderTraverse();

        assertEquals("52 33 25 12 27 39 34 48 65 60 78 72 70 90", result);
    }

    @Test
    public void postOrderTraverse() {
        BinarySearchTree binarySearchTree = generateBinaryTree();
        String result = binarySearchTree.postOrderTraverse();

        assertEquals("12 27 25 34 48 39 33 60 70 72 90 78 65 52", result);
    }

    @Test
    public void height() {
        BinarySearchTree binarySearchTree = generateBinaryTree();

        assertEquals(5, binarySearchTree.height());
    }

    private BinarySearchTree generateBinaryTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(52);
        binarySearchTree.insert(33);
        binarySearchTree.insert(65);
        binarySearchTree.insert(39);
        binarySearchTree.insert(25);
        binarySearchTree.insert(60);
        binarySearchTree.insert(78);
        binarySearchTree.insert(12);
        binarySearchTree.insert(27);
        binarySearchTree.insert(48);
        binarySearchTree.insert(34);
        binarySearchTree.insert(72);
        binarySearchTree.insert(90);
        binarySearchTree.insert(70);

        return binarySearchTree;
    }
}
