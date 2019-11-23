import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



class Vertex { 

   public String label;
   

	public ArrayList<Edge> edges; //collection of edges to neighbors 

    public Vertex(String pageObject) {
        this.label = pageObject;
        this.edges = new ArrayList<Edge>();
    }

    String getLabel() {
        return label;
    }

    boolean addEdge(Edge edge){
        return edges.add(edge);
    }

    List<Edge> getEdges() {
        return new ArrayList<>(edges);
    }
    
    @Override
    public String toString() {
    	
    		return "Vertex [label=" + label + ", edges=" + edges + "]";
    }

    //todo override hashCode()
}

