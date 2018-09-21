import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

public class E1{

  public static void main(String[] pps){
    Graph graph = new SingleGraph("Ejercicio 1");
    graph.addAttribute("ui.stylesheet", "node {size: 30px, 30px; }"
      + "node#A { fill-color: red; }"
      + "node#B { fill-color: blue; }"
      + "node#C { fill-color: magenta; }"
      + "node#D { fill-color: yellow; }"
      + "node#E { fill-color: green; }");
    graph.addNode("A" );
    graph.addNode("B" );
    graph.addNode("C" );
    graph.addNode("D");
    graph.addNode("E");
    graph.addEdge("AB", "A", "B");
    graph.addEdge("BC", "B", "C");
    graph.addEdge("CD", "C", "D");
    graph.addEdge("DE", "D", "E");
    graph.display();
  }
}

/*
Para compilar
javac  -cp .:../lib/gs-core-1.3.jar:../lib/gs-ui-1.3.jar:../lib/gs-algo-1.3.jar E1.java
-----------------------------------------------------------------------------------------
Para ejecutar
java  -cp .:../lib/gs-core-1.3.jar:../lib/gs-ui-1.3.jar:../lib/gs-algo-1.3.jar E1
*/

//Class RandomGenerator
