import java.util.ArrayList;


public class VertexG {

	public String label;

	public float x;
	public float y;
	public float h;
	public int time;

	public ArrayList<VertexG> adj;
	
	
	public VertexG(){

	}

	public  VertexG(String label, float x , float y){

		this.label = label;
		this.x = x;
		this.y = y;
		this.adj = new ArrayList<VertexG>();
	}

	public void addadj(VertexG t){
		adj.add(t);
	}
	@Override
	public String toString() {
		return label + ", h = " + h;
	}
}
