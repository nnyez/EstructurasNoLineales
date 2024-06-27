Geovanni Zuñiga y Juan Portilla

Version: 2.2.2

-Ejercicio 01 insert
El metodo recibe un Node y un valor, primero se evalua si el nodo esta vacio, si lo esta devuelve un nuevo nodo con valor el parametro que llego. Si es que no, pasa a comprobar si el valor del parametro es menor que el valor que tiene el nodo, si es asi ingresa a la izquierda del nodo y al contrario ingresa a la derecha. Para ingresar, el valor del nodo que ingresa es obtenido mediante el llamado de la misma funcion pero obteniendo la derecha u izquierda respectivamente enviando como valor del nodo y el valor que del parametro que ingreso al metodo.

-Ejercicio 02 InvertBinaryTree
El metodo recibe un nodo, donde primero se evalua si esta vacio, si es asi devuelve el mismo nodo. Luego se almacenan en dos variables temporales los valores de la izquierda y derecha del nodo. Luego para invertir el arbol se establece el nodo izquierdo como el llamado de la misma funcion pero con el parametro el nodo de la derecha, y lo mismo para establecer el nodo de la derecha donde al final retorna el mismo nodo.

-Ejercicio 03 ListLevels
Este metodo recibe un nodo root y devuelve una lista de LinkedList de nodos que representaran cada linkedList un nivel, donde al inicio se comprueba si el nodo root es nulo, si es asi devuelve una lista vacia. Luego mediante otra lista auxiliar para representar la lista del nivel actual, se agrega el primer nodo y esta misma se agrega a la lista resultado. Mediante un bucle while se busca recorrer los nodos que estan en el auxiliar en busca de los nodos hijos. Mediante otro bucle for se obtiene los hijos y estos se agregan a una lista auxiliar, obteniendo asi lista por cada nivel de profundidad al final retornando la lista resultado.

-Ejercicio 04 Depth
El metodo recibe un nodo que primero comprueba si es nullo, si es asi devuelve 0 caso contrario lo que hace es crear dos variables temporales donde su valor es igual a la llamada del mismo metodo pero con su parametro del nodo izquierdo y derecho. Donde al final mediante la funcion max devuelve el valor mas alto, estos valores significan el nivel de profundidad, y a este le sumamos uno para aumentar un nivel.
