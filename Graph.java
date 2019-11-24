import java.util.ArrayList;


public class Graph{

	public ArrayList<Vertex> vertices; //collection of all verices 

	public Graph() {
		vertices = new ArrayList<>();
	} 

	public ArrayList<Vertex> getVertices() {
		return new ArrayList<Vertex>(vertices);
	}   

	void addVertex(Vertex vertex){
		vertices.add(vertex);
	}

	@Override
	public String toString() {
		return "Graph [vertices = " + vertices + "]";
	}
}