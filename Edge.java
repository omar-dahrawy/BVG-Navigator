public class Edge {
	
    private Vertex to; 
    private int weight;

    public Edge(Vertex to, int weight) {
        super();
        this.to = to;
        this.weight = weight;
    }

    Vertex getTo() {
        return to;
    }

    int getWeight() {
        return weight;
    }

	@Override
	public String toString() {
		return "Edge [to=" + to + ", weight=" + weight + "]";
	}   

    //todo override hashCode()
}
