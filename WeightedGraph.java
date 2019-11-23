import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


public class WeightedGraph{

	public static void DFS(Graph Stations,Vertex start,Vertex end){

		ArrayList<Vertex> vTemp = Stations.getVertices();
		ArrayList<String> e = new ArrayList<String>();
		ArrayList<String> visited = new ArrayList<String>();
		ArrayList<Integer> cost = new ArrayList<Integer>();

		for(int i = 0 ;i<vTemp.size();i++){
			if(start.label.equals(vTemp.get(i).label)){
				// Adding the edges
				//System.out.println(vTemp.get(i).getEdges().size());
				for(int j = vTemp.get(i).getEdges().size()-1;j>=0;j--){
					if(vTemp.get(i).getEdges().size() > 0){
						e.add(vTemp.get(i).getEdges().get(j).getTo().label);
						//System.out.println(vTemp.get(i).getEdges().get(j).getTo().label);
					}
				}
				break;
			}
		}
		visited.add(start.label);
		for(int i =  e.size()-1; i>=0;i--){
			if(e.contains(end.label)){
				//System.out.println(e.get(i));
				break;
			}
			for(int j = 0 ;j< Stations.getVertices().size();j++){
				if(e.get(i).equals(Stations.getVertices().get(j).label)){
					for(int x = Stations.getVertices().get(j).edges.size()-1;x>=0;x--){
						if(!visited.contains(Stations.getVertices().get(j).edges.get(x).getTo().label)){
							e.add(Stations.getVertices().get(j).edges.get(x).getTo().label);
							visited.add(Stations.getVertices().get(j).edges.get(x).getTo().label);
							System.out.println(Stations.getVertices().get(j).edges.get(x).getTo().label);
							e.remove(Stations.getVertices().get(j).label);
							i = e.size()-1;
						}
					}
				}
			}
		}
		System.out.println(e.toString());
	}

	public static void BFS(Graph Stations,Vertex start,Vertex end){
		ArrayList<String> visited = new ArrayList<String>();
		//ArrayList<String> path = new ArrayList<String>();
		ArrayList<Vertex> vTemp = Stations.getVertices();
		ArrayList<String> e = new ArrayList<String>();
		for(int i = 0 ; i<vTemp.size() ; i++){
			if(start.label.equals(vTemp.get(i).label)){
				// Adding the edges
				for(int j = 0;j<vTemp.get(i).getEdges().size();j++){
					if(vTemp.get(i).getEdges().size() >0){
						e.add(vTemp.get(i).getEdges().get(j).getTo().label);
						//	System.out.println(vTemp.get(i).getEdges().get(j).getTo().label);
					}
				}
				break;
			}
		}
		//	System.out.println(e.toString());
		visited.add(start.label);
		int no = 0;
		for(int i = 0; i< e.size();i++){
			if(e.contains(end.label)){
				//System.out.println(e.get(i));
				break;
			}
			for(int j = 0 ;j< Stations.getVertices().size();j++){
				if(e.get(i).equals(Stations.getVertices().get(j).label)){
					for(int x = 0;x<Stations.getVertices().get(j).edges.size();x++){
						if(!visited.contains(Stations.getVertices().get(j).edges.get(x).getTo().label)){
							e.add(Stations.getVertices().get(j).edges.get(x).getTo().label);
							visited.add(Stations.getVertices().get(j).edges.get(x).getTo().label);
							//System.out.println(Stations.getVertices().get(j));

						}
					}
				}
			}
		}
		System.out.println(e.toString());
	}

	public static ArrayList<Vertex> addAdjacents(ArrayList<Station> x){
		ArrayList<Vertex>temp = new ArrayList<Vertex>();
		for(int i = 0;i<x.size();i++){
			if(i == x.size()-1){
				Vertex b = new Vertex(x.get(i).Name);
				temp.add(b);
				break;
			}
			else if(i == 0) {
				Vertex b = new Vertex(x.get(i).Name);
				Vertex to = new Vertex(x.get(i+1).Name);
				Edge q = new Edge(to,x.get(i+1).time);
				b.addEdge(q);
				temp.add(b);
			}
			else {
				Vertex b = new Vertex(x.get(i).Name);

				Vertex to = new Vertex(x.get(i+1).Name);
				Edge q = new Edge(to,x.get(i+1).time);
				b.addEdge(q);


				Vertex before = new Vertex(x.get(i-1).Name);
				Edge q1 = new Edge(before, x.get(i-1).time);
				b.addEdge(q1);

				temp.add(b);
			}

			//x.get(i).adj(x.get(i+1));
		}
		return temp;
	}


	public static void main(String[]args) throws FileNotFoundException{

		/*	
		 * 	READING STATIONS AND CREATING GRAPH OF VERTICES AND EDGES
		 * 
		 * 	Creating graph data structure
		 *  Creating ArrayList of ArrayLists Lines for each U-Bahn line.
		 * 	Creating ArrayList of ArrayLists Vertices for graph vertices for each U-Bahn line. 
		 * 
		 */


		Graph Stations = new Graph();
		ArrayList<ArrayList<Station>> Lines = new ArrayList<ArrayList<Station>>();
		ArrayList<ArrayList<Vertex>> Vertices = new ArrayList<ArrayList<Vertex>>();

		/*
		 * 	Reading lines from StopNames.txt using scanner
		 * 	Lines format:
		 * 
		 * 	U1
		 * 	Station 1 name:time:x position,y position
		 *  Station 2 name:time:x position,y position
		 *  .
		 *  .
		 *  Station N name:time:x position,y position
		 *  U2
		 *  Station 1 name:time:x position,y position
		 *  .
		 *  .
		 * 
		 */

		File file = new File("StopNames.txt"); 
		Scanner sc = new Scanner(file); 
		String line = "";
		int tempOld = 0;
		String temp = "";
		while (sc.hasNextLine()){
			line = sc.nextLine();
			if(line.length() == 2) {
				temp = line;
				Lines.add(new ArrayList<Station>());
			}
			else {
				int index = Integer.parseInt(temp.substring(1, 2));
				index--;
				for(int i = 0 ; i < line.length() ; i++){
					if(line.substring(i, i+1).equals(":")){
						int tempNew = Integer.parseInt(line.substring(i+1));
						int tempResult = tempNew - tempOld;
						tempOld = Integer.parseInt(line.substring(i+1));
						Lines.get(index).add(new Station(line.substring(0, i),tempResult));
					}
				}
			}
		}
		sc.close();


		for(int i = 0 ; i < Lines.size() ; i++) {
			Vertices.add(addAdjacents(Lines.get(i)));
		}

		for(int i = 0 ; i < Vertices.size() ; i++) {
			for(int j = 0 ; j < Vertices.get(i).size() ; j++) {
				Stations.addVertex(Vertices.get(i).get(j));
			}
		}

		for(int i = 0 ; i < Stations.getVertices().size() ; i++){
			for(int j = i+1 ; j < Stations.getVertices().size() ; j++){
				if(Stations.getVertices().get(i).getLabel().equals(Stations.getVertices().get(j).getLabel())){
					if(Stations.getVertices().get(j).getEdges().size() >= 2){
						Edge e = Stations.getVertices().get(j).getEdges().get(0);
						Edge e1 = Stations.getVertices().get(j).getEdges().get(1);
						if(!Stations.getVertices().get(i).edges.contains(e)){
							Stations.getVertices().get(i).edges.add(e);                   
						}	
						if(!Stations.getVertices().get(i).edges.contains(e1)) {
							Stations.getVertices().get(i).edges.add(e1);                   
							Stations.vertices.remove(j);
						}
					}
					else if(Stations.getVertices().get(j).getEdges().size() >=1){
						Edge e = Stations.getVertices().get(j).getEdges().get(0);
						if(!Stations.getVertices().get(i).edges.contains(e)){
							Stations.getVertices().get(i).edges.add(e);                   
						}	
					}
					else{
						Stations.vertices.remove(j);
					}
				}
			}
		}
		for(int i = 0;i<Stations.getVertices().size();i++){
			for(int j = 0 ; j<Stations.getVertices().get(i).edges.size();j++){
				if(Stations.getVertices().get(i).edges.size() != 0){
					for(int k = j+1;k<Stations.getVertices().get(i).edges.size();k++){
						if(Stations.getVertices().get(i).edges.get(j).getTo().label.equals(Stations.getVertices().get(i).edges.get(k).getTo().label)){
							Stations.getVertices().get(i).edges.remove(k);
						}
					}
				}
			}
		}
		for(int i = 0;i<Stations.getVertices().size();i++) {
			if(Stations.getVertices().get(i).label.equals("U Amrumer Str.")) {
			}
		}
		BFS(Stations,new Vertex("U Borsigwerke"),new Vertex("U Hermannplatz"));
	}

}