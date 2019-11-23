import java.util.ArrayList;


public class Station {

	public String Name;
	public int time; //time taken from the previous stop to this station;
	public ArrayList<Station>adjancentStations = new ArrayList<Station>();
	
	
	public Station(String Name,int time ){
		this.Name = Name;
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void adj(Station x){
		
		this.adjancentStations.add(x);
		
	}

	@Override
	public String toString() {
		return "Station [Name = " + Name + ", time = " + time
				 + "]";
	}
	
	public void print(){
		
		for(int i = 0;i<this.adjancentStations.size();i++){
			
			System.out.println(this.adjancentStations.get(i).toString());
		}
		//System.out.println("Size of adj stations is = " + this.adjancentStations.size() );
	}
	
}

