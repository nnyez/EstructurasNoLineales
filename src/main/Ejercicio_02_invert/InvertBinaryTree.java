package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
//5 ,3 4
    public Node invertTree(Node root) {
        if (root == null) {
            return root;
        }
        Node right = root.getRight();
        Node left = root.getLeft();
        root.setLeft(invertTree(right));
        root.setRight(invertTree(left));
        return root;
    }

}
