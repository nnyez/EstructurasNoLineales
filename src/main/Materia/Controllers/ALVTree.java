package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ALVTree {
    private Node root;

    // Obtener la altura de un Node
    private int height(Node node) {
        if (node == null)
            return 0;

        return node.getHeight();
    }

    // Metodo que obtenga el factor de equilibrio de un Node
    private int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.getLeft()) - height(node.getRight());
    }

    //
    public void insert(int value) {
        System.out.println("Node a insertar sera el: " + value);
        {
            root = insert(root, value);
        }
        printTree();

    }

    public Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));

        } else if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));

        } else {
            return node;
        }

        // actualizar la altura del predecesor
        node.setHeight(1 + Math.max(height(node.getRight()), height(node.getLeft())));

        // calcular el balance
        int balance = getBalance(node);

        // si el nodo esta desbalanceado se tiene 3 casos

        // caso izquierda izquierda
        if (balance > 1 && value < node.getLeft().getValue()) {
            return rightRotate(node);
        }

        // caso derecha derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            return leftRotate(node);
        }

        // caso izquierda derecha
        if (balance > 1 && value > node.getLeft().getValue()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }

        // caso derecha izquierda
        if (balance < -1 && value < node.getRight().getValue()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }

        System.out.println("Inserted Node: " + node.getValue() + ", Balance: " + balance);

        // Sin cambios por rotacion
        return node;
    }

    private Node leftRotate(Node nodeL) {
        System.out.println("LeftRotate on: " + nodeL.getValue() + ", Balance: " + getBalance(nodeL));
        Node y = nodeL.getRight();
        System.out.println("New root after left rotate: " + y.getValue());
        Node temp = y.getLeft();

        // rotacion
        y.setLeft(nodeL);
        nodeL.setRight(temp);

        // actualizar alturas
        nodeL.setHeight(1 + Math.max(height(nodeL.getLeft()), height(nodeL.getRight())));
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
        // devulve nuevo raiz

        return y;
    }

    private Node rightRotate(Node nodeR) {
        System.out.println("LeftRotate on: " + nodeR.getValue() + ", Balance: " + getBalance(nodeR));
        Node x = nodeR.getLeft();
        System.out.println("New root after left rotate: " + x.getValue());
        Node temp = x.getRight();

        // rotacion
        x.setRight(nodeR);
        nodeR.setLeft(temp);

        // actualizar alturas
        nodeR.setHeight(1 + Math.max(height(nodeR.getLeft()), height(nodeR.getRight())));
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
        // devulve nuevo raiz
        return x;
    }

    // Print
    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTree(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTree(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }

    }

}
