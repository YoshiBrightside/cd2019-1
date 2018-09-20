import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

public class P1{

  public static void main(String[] pps){
    Graph graph = new SingleGraph("Tutorial 1");
    graph.addNode("A" );
    graph.addNode("B" );
    graph.addNode("C" );
    graph.addEdge("AB", "A", "B");
    graph.addEdge("BC", "B", "C");
    graph.addEdge("CA", "C", "A");
    graph.display();
  }
}

/*
Para compilar
javac  -cp .:../lib/gs-core-1.3.jar:../lib/gs-ui-1.3.jar:../lib/gs-algo-1.3.jar P1.java
-----------------------------------------------------------------------------------------
Para ejecutar
java  -cp .:../lib/gs-core-1.3.jar:../lib/gs-ui-1.3.jar:../lib/gs-algo-1.3.jar P1
*/

//Class RandomGenerator
