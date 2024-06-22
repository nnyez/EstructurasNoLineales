package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

import main.Materia.Models.Node;

public class ListLevels {

    public List<LinkedList<Node>> listLevels(Node root) {
        List<LinkedList<Node>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<Node> currentLevel = new LinkedList<>();
        currentLevel.add(root);
        result.add(currentLevel);

        while (!currentLevel.isEmpty()) {
            LinkedList<Node> nextLevel = new LinkedList<>();
            for (Node node : currentLevel) {
                if (node.getLeft() != null) {
                    nextLevel.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    nextLevel.add(node.getRight());
                }
            }
            if (!nextLevel.isEmpty()) {
                result.add(nextLevel);
                currentLevel = nextLevel;
            } else {
                break;
            }
        }
        return result;
    }
}