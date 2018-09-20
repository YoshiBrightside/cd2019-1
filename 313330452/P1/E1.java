import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

public class E1{

  public static void main(String[] pps){
    Graph graph = new SingleGraph("Ejercicio 1");
    graph.addAttribute("ui.stylesheet", "graph { fill-color: black; }");
    graph.addAttribute("ui.stylesheet", "A { fill-color: red; }");
    graph.addAttribute("ui.stylesheet", "B { fill-color: red; }");
    graph.addAttribute("ui.stylesheet", "C { fill-color: red; }");
    graph.addAttribute("ui.stylesheet", "D { fill-color: red; }");
    graph.addAttribute("ui.stylesheet", "E { fill-color: red; }");
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
