package main;

import main.Ejercicio_01_insert.InsertBST;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));
        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));

        nodeRoot.getRight().setRight(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setLeft(new Node(8));

        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println();
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println();
        arbolBinario.postOrdeLoop(nodeRoot);
        System.out.println();
        arbolBinario.postOrderRecursivo(nodeRoot);
        System.out.println();
        arbolBinario.inOrderRecursivo(nodeRoot);


         InsertBST bstInsertion = new InsertBST();
        int[] values = { 5, 3, 7, 2, 4, 6, 8 };

        Node root = null;
        for (int value : values) {
            root = bstInsertion.insert(root, value);
        }

    }
}
