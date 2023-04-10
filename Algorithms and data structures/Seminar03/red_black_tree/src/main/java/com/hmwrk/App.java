package com.hmwrk;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        RedBlackTree tree = new RedBlackTree();

        for (int i = 1; i <= 15; i++) {
            tree.insert(i);
        }

        RedBlackTreePrinter printer = new RedBlackTreePrinter();
        printer.printTree(tree.getRoot());
    }



    public static class RedBlackNode {

        private int value;
        private boolean isRed;
        private RedBlackNode leftChild;
        private RedBlackNode rightChild;
        private RedBlackNode parent;

        public RedBlackNode(int value) {
            this.value = value;
            this.isRed = true;
        }

        public int getValue() {
            return value;
        }

        public boolean isRed() {
            return isRed;
        }

        public void setRed(boolean isRed) {
            this.isRed = isRed;
        }

        public RedBlackNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(RedBlackNode leftChild) {
            this.leftChild = leftChild;
        }

        public RedBlackNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(RedBlackNode rightChild) {
            this.rightChild = rightChild;
        }

        public RedBlackNode getParent() {
            return parent;
        }

        public void setParent(RedBlackNode parent) {
            this.parent = parent;
        }
    }



    public static class RedBlackTree {

        private RedBlackNode root;

        public void insert(int value) {
            RedBlackNode newNode = new RedBlackNode(value);
            if (root == null) {
                root = newNode;
            } else {
                insertNode(newNode);
            }
            fixInsertion(newNode);
        }

        private void insertNode(RedBlackNode newNode) {
            RedBlackNode current = root;
            RedBlackNode parent = null;

            while (current != null) {
                parent = current;
                if (newNode.getValue() < current.getValue()) {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
            }
            newNode.setParent(parent);
            if (parent.getValue() > newNode.getValue()) {
                parent.setLeftChild(newNode);
            } else {
                parent.setRightChild(newNode);
                // Обеспечение левостороннего свойства
                if (parent.isRed()) {
                    fixInsertion(parent);
                }
            }
        }

        private void fixInsertion(RedBlackNode newNode) {
            while (newNode.getParent() != null && newNode.getParent().isRed()) {
                RedBlackNode grandParent = newNode.getParent().getParent();
                if (newNode.getParent() == grandParent.getLeftChild()) {
                    RedBlackNode uncle = grandParent.getRightChild();
                    if (uncle != null && uncle.isRed()) {
                        newNode.getParent().setRed(false);
                        uncle.setRed(false);
                        grandParent.setRed(true);
                        newNode = grandParent;
                    } else {
                        if (newNode == newNode.getParent().getRightChild()) {
                            newNode = newNode.getParent();
                            rotateLeft(newNode);
                        }
                        newNode.getParent().setRed(false);
                        grandParent.setRed(true);
                        rotateRight(grandParent);
                    }
                } else {
                    RedBlackNode uncle = grandParent.getLeftChild();
                    if (uncle != null && uncle.isRed()) {
                        newNode.getParent().setRed(false);
                        uncle.setRed(false);
                        grandParent.setRed(true);
                        newNode = grandParent;
                    } else {
                        if (newNode == newNode.getParent().getLeftChild()) {
                            newNode = newNode.getParent();
                            rotateRight(newNode);
                        }
                        newNode.getParent().setRed(false);
                        grandParent.setRed(true);
                        rotateLeft(grandParent);
                    }
                }
            }
            root.setRed(false);
        }

        private void rotateLeft(RedBlackNode node) {
            RedBlackNode pivot = node.getRightChild();
            node.setRightChild(pivot.getLeftChild());
            if (pivot.getLeftChild() != null) {
                pivot.getLeftChild().setParent(node);
            }
            pivot.setParent(node.getParent());
            if (node.getParent() == null) {
                root = pivot;
            } else if (node == node.getParent().getLeftChild()) {
                node.getParent().setLeftChild(pivot);
            } else {
                node.getParent().setRightChild(pivot);
            }
            pivot.setLeftChild(node);
            node.setParent(pivot);
        }

        private void rotateRight(RedBlackNode node) {
            RedBlackNode pivot = node.getLeftChild();
            node.setLeftChild(pivot.getRightChild());
            if (pivot.getRightChild() != null) {
                pivot.getRightChild().setParent(node);
            }
            pivot.setParent(node.getParent());
            if (node.getParent() == null) {
                root = pivot;
            } else if (node == node.getParent().getRightChild()) {
                node.getParent().setRightChild(pivot);
            } else {
                node.getParent().setLeftChild(pivot);
            }
            pivot.setRightChild(node);
            node.setParent(pivot);
        }

        public RedBlackNode getRoot() {
            return root;
        }
    }



    public static class RedBlackTreePrinter {

        public void printTree(RedBlackNode node) {
            printTree(node, "", true);
        }
    
        private void printTree(RedBlackNode node, String prefix, boolean isLeft) {
            if (node != null) {
                System.out.print(prefix);
                System.out.print(isLeft ? "├──" : "└──");
                System.out.print(node.isRed() ? "(R) " : "(B) ");
                System.out.println(node.getValue());
                printTree(node.getLeftChild(), prefix + (isLeft ? "│   " : "    "), true);
                printTree(node.getRightChild(), prefix + (isLeft ? "│   " : "    "), false);
            }
        }
    }
}
