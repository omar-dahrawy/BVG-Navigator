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

import javax.naming.directory.SearchControls;


public class WeightedGraph{

	public static void main(String[]args) throws FileNotFoundException{
//		new BFS();
//		new DFS();
//		new Greedy();
	}

}

/*
 *  		Greedy class
 */

class Greedy {

	ArrayList<String> visited = new ArrayList<String>();

	public Greedy() throws FileNotFoundException {
		ArrayList<VertexG>Graph = new ArrayList<VertexG>();

		ArrayList<VertexG>U1 = new ArrayList<VertexG>();
		ArrayList<VertexG>U2 = new ArrayList<VertexG>();
		ArrayList<VertexG>U3 = new ArrayList<VertexG>();
		ArrayList<VertexG>U4 = new ArrayList<VertexG>();
		ArrayList<VertexG>U5 = new ArrayList<VertexG>();
		ArrayList<VertexG>U55 = new ArrayList<VertexG>();
		ArrayList<VertexG>U6 = new ArrayList<VertexG>();
		ArrayList<VertexG>U7 = new ArrayList<VertexG>();
		ArrayList<VertexG>U8 = new ArrayList<VertexG>();
		ArrayList<VertexG>U9 = new ArrayList<VertexG>();

		File file = 
				new File("StopNames (1).txt"); 
		Scanner sc = new Scanner(file); 
		String line = "";

		int size = 0;
		String temp = " ";
		 int tempOld = 0;
		while(sc.hasNextLine()){
			float x = 0;
			float y = 0;
			line = sc.nextLine();
			if(line.equals("U1")){
				temp = line;
				tempOld = 0;

			}
			else if(line.equals("U2")){

				temp = line;
				tempOld = 0;

			}else if(line.equals("U3")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U4")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U5")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U55")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U6")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U7")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U8")){
				temp = line;
				tempOld = 0;

			}else if(line.equals("U9")){
				temp = line;
				tempOld = 0;
			}

			if(temp.equals("U1")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}
					
					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){
							//System.out.println(tempResult);
						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));

							VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//tempV.time = tempResult;
						//	System.out.println(tempV.time);
								U1.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));
								
								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
//								System.out.println(tempV.time);
									U1.add(tempV);
							}

						}

					}
				}
			}

			else if(temp.equals("U2")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}

					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));

								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
										
								U2.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
										
								U2.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U3")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
										
								U3.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
										
								U3.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U4")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
								U4.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
								U4.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U5")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U5.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U5.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U55")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U55.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
								U55.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U6")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U6.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U6.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U7")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}

					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U7.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								U7.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U8")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
							//System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
								U8.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));


								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
								U8.add(tempV);
							}

						}

					}
				}
			}
			else if(temp.equals("U9")){
				for(int i = 0;i<line.length();i++){
					int tempResult = 0 ;
					
					if(line.substring(i, i+1).equals(":")){
						if(line.substring(i+2, i+3).equals(":")){
						//	System.out.println(line.substring(i+1,i+2));
							int tempNew = Integer.parseInt(line.substring(i+1,i+2));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+2));
			    			
						}
						else if(line.substring(i+3, i+4).equals(":")){
							
						//	System.out.println(line.substring(i+1,i+3));
							int tempNew = Integer.parseInt(line.substring(i+1,i+3));
							tempResult = tempNew - tempOld;
			    			tempOld = Integer.parseInt(line.substring(i+1,i+3));
			    			
						}
					}


					if(line.substring(i, i+1).equals(":")&&line.substring(i+2, i+3).equals(":")   ){

						for(int j = i+3;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+3,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));

								VertexG tempV = new VertexG(line.substring(0,i),x,y);
							//	tempV.time = tempResult;
								//System.out.println(tempV.time);
								U9.add(tempV);
							}

						}

					}
					else if (line.substring(i, i+1).equals(":")&&line.substring(i+3, i+4).equals(":")){

						for(int j = i+4;j<line.length();j++){
							if(line.substring(j,j+1).equals(",")){

								x = Float.parseFloat(line.substring(i+4,j));
								y = Float.parseFloat(line.substring(j+1,line.length()));

								VertexG tempV = new VertexG(line.substring(0,i),x,y);
								//tempV.time = tempResult;
								//System.out.println(tempV.time);
								U9.add(tempV);
							}

						}

					}
				}
			}

		}


		addadjacentsG(Graph,U1);
		addadjacentsG(Graph,U2);
		addadjacentsG(Graph,U3);
		addadjacentsG(Graph,U4);
		addadjacentsG(Graph,U5);
		addadjacentsG(Graph,U55);
		addadjacentsG(Graph,U6);
		addadjacentsG(Graph,U7);
		addadjacentsG(Graph,U8);
		addadjacentsG(Graph,U9);


		AdjInGraph(Graph);
		GreedySearch(Graph, "S+U Alexanderplatz" , "U Mendelssohn-Bartholdy-Park");
	}

	public void GreedySearch(ArrayList<VertexG>Graph , String Start , String end ){

		long startTime = System.nanoTime();

		VertexG StartV = new VertexG();
		ArrayList<String> visited = new ArrayList<String>();
		ArrayList<String> e = new ArrayList<String>();

		for(int i = 0;i<Graph.size();i++){

			if(Graph.get(i).label.equals(Start)){
				StartV = Graph.get(i);
				//System.out.println(StartV.adj);
				visited.add(Start);
				//Graph.remove(Graph.get(i));
				break;
			}

		}
		boolean flag = true;


		while(flag){
			ArrayList<Float> h = addHeuristics(StartV);
			Collections.sort(h);
			for(int i = 0;i<StartV.adj.size();i++){
				for(int j = 0;j<h.size();j++){
					if(StartV.adj.get(i).h == h.get(j)&& !visited.contains(StartV.adj.get(i).label)){
						System.out.println("StartV.adj.toString()"+ StartV.adj.toString());
						System.out.println("minimum = "+ StartV.adj.get(i).label);
						visited.add(StartV.adj.get(i).label);
						StartV = findV(Graph, StartV.adj.get(i));
						h.clear();
						i = 0;
						break;
					}

				}
			}
			if(visited.contains(end)){
				flag = false;
			}

			//System.out.println(visited.toString());	
		}

		long endTime = System.nanoTime();

		long duration = (endTime - startTime)/1000000;

		System.out.println(duration);


	}

	public ArrayList<Float> addHeuristics(VertexG StartV){
		float heuristic = 0;
		ArrayList<Float>h = new ArrayList<Float>();

		for(int i = 0;i<StartV.adj.size();i++){
			if(!visited.contains(StartV.adj.get(i))){
				heuristic = Math.abs(StartV.x-StartV.adj.get(i).x) + Math.abs(StartV.y-StartV.adj.get(i).y);
				StartV.adj.get(i).h = heuristic;
				h.add(heuristic);
			}
		}


		return h;
	}	

	public static void AdjInGraph(ArrayList<VertexG>Graph){

		for(int i = 0;i<Graph.size();i++){
			for(int j = i+1;j<Graph.size();j++){
				if(Graph.get(i).label.equals(Graph.get(j).label)){

					for(int y = 0;y<Graph.get(j).adj.size();y++){
						if(Graph.get(j).adj.size() != 0){
							Graph.get(i).adj.add(Graph.get(j).adj.get(y));
						}
					}


					Graph.remove(j);	
				}

			}
		}
	}

	public static VertexG findV(ArrayList<VertexG>Graph , VertexG s){

		VertexG sTemp = new VertexG();
		for(int i = 0;i<Graph.size();i++){
			if(Graph.get(i).label.equals(s.label)){
				sTemp = Graph.get(i);
				//System.out.println(true);
				break;
			}
		}

		return sTemp;
	}

	public static void addadjacentsG(ArrayList<VertexG>Graph,ArrayList<VertexG>U){

		for(int i = 0;i<U.size();i++){

			if(i == 0){
				U.get(i).adj.add(U.get(i+1));
			}
			else if (i == U.size()-1){

				U.get(i).adj.add(U.get(i-1));
			}
			else{
				U.get(i).adj.add(U.get(i+1));
				U.get(i).adj.add(U.get(i-1));
			}


		}


		for(int i = 0;i < U.size();i++){
			Graph.add(U.get(i));
		}


	}

}

/*
 *  		Depth-First class
 */

class DFS {

	public DFS() throws FileNotFoundException {
		/*	
		 * 	READING STATIONS AND CREATING GRAPH OF VERTICES AND EDGES
		 * 
		 * 	Create graph data structure
		 *  Create ArrayList of ArrayLists Lines for each U-Bahn line.
		 * 	Create ArrayList of ArrayLists Vertices for graph vertices for each U-Bahn line. 
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

			float x = 0;
			float y = 0;
			line = sc.nextLine();													// Read in a line
			if(line.length() == 2) {												// If line is Ux (x being from 1 to 9)
				temp = line;														// Save it in temp
				Lines.add(new ArrayList<Station>()); 								// And create an arraylist inside arraylist Lines for the new U line
			}
			else {																	// otherwise start parsing the line into data
				int index = Integer.parseInt(temp.substring(1, 2));					// get index of destination arraylist from the Ux line
				index--;															// i.e. if U1 then index 0
				for(int i = 0 ; i < line.length() ; i++){
					if(line.substring(i, i+1).equals(":")){
						int tempNew = Integer.parseInt(line.substring(i+1));		// create station with name and time and add to Lines
						int tempResult = tempNew - tempOld;
						tempOld = Integer.parseInt(line.substring(i+1));
						Lines.get(index).add(new Station(line.substring(0, i),tempResult));
					}
				}
			}
		}
		sc.close();

		/*
		 *	Convert stations in Lines to vertices in Vertices
		 */

		for(int i = 0 ; i < Lines.size() ; i++) {
			Vertices.add(addAdjacents(Lines.get(i)));
		}

		/*
		 *	Add vertices from Vertices to Stations graph
		 */

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
		for(int i = 0 ; i < Stations.getVertices().size() ; i++){
			for(int j = 0 ; j < Stations.getVertices().get(i).edges.size() ; j++){
				if(Stations.getVertices().get(i).edges.size() != 0){
					for(int k = j+1 ; k < Stations.getVertices().get(i).edges.size() ; k++){
						if(Stations.getVertices().get(i).edges.get(j).getTo().label.equals(Stations.getVertices().get(i).edges.get(k).getTo().label)){
							Stations.getVertices().get(i).edges.remove(k);
						}
					}
				}
			}
		}
		Search(Stations,new Vertex("U Borsigwerke"),new Vertex("U Hermannplatz"));
	}

	public void Search(Graph Stations,Vertex start,Vertex end) {
		ArrayList<Vertex> vTemp = Stations.getVertices();
		ArrayList<String> e = new ArrayList<String>();
		ArrayList<String> visited = new ArrayList<String>();


		for(int i = 0 ;i<vTemp.size();i++){
			if(start.label.equals(vTemp.get(i).label)){
				// Adding the edges
				//System.out.println(vTemp.get(i).getEdges().size());
				for(int j = vTemp.get(i).getEdges().size()-1;j>=0;j--){
					if(vTemp.get(i).getEdges().size() > 0){
						e.add(vTemp.get(i).getEdges().get(j).getTo().label);
						System.out.println(vTemp.get(i).getEdges().get(j).getTo().label);
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
							//	System.out.println(Stations.getVertices().get(j).edges.get(x).getTo().label);
							e.remove(Stations.getVertices().get(j).label);
							i = e.size()-1;
						}
					}
				}
			}
		}
		System.out.println(visited.toString());
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

}

/*
 *  		Breadth-First class
 */

class BFS {

	public BFS() throws FileNotFoundException {

		/*	
		 * 	READING STATIONS AND CREATING GRAPH OF VERTICES AND EDGES
		 * 
		 * 	Create graph data structure
		 *  Create ArrayList of ArrayLists Lines for each U-Bahn line.
		 * 	Create ArrayList of ArrayLists Vertices for graph vertices for each U-Bahn line. 
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

			float x = 0;
			float y = 0;
			line = sc.nextLine();													// Read in a line
			if(line.length() == 2) {												// If line is Ux (x being from 1 to 9)
				temp = line;														// Save it in temp
				Lines.add(new ArrayList<Station>()); 								// And create an arraylist inside arraylist Lines for the new U line
			}
			else {																	// otherwise start parsing the line into data
				int index = Integer.parseInt(temp.substring(1, 2));					// get index of destination arraylist from the Ux line
				index--;															// i.e. if U1 then index 0
				for(int i = 0 ; i < line.length() ; i++){
					if(line.substring(i, i+1).equals(":")){
						int tempNew = Integer.parseInt(line.substring(i+1));		// create station with name and time and add to Lines
						int tempResult = tempNew - tempOld;
						tempOld = Integer.parseInt(line.substring(i+1));
						Lines.get(index).add(new Station(line.substring(0, i),tempResult));
					}
				}
			}
		}
		sc.close();

		/*
		 *	Convert stations in Lines to vertices in Vertices
		 */

		for(int i = 0 ; i < Lines.size() ; i++) {
			Vertices.add(addAdjacents(Lines.get(i)));
		}

		/*
		 *	Add vertices from Vertices to Stations graph
		 */

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
		for(int i = 0 ; i < Stations.getVertices().size() ; i++){
			for(int j = 0 ; j < Stations.getVertices().get(i).edges.size() ; j++){
				if(Stations.getVertices().get(i).edges.size() != 0){
					for(int k = j+1 ; k < Stations.getVertices().get(i).edges.size() ; k++){
						if(Stations.getVertices().get(i).edges.get(j).getTo().label.equals(Stations.getVertices().get(i).edges.get(k).getTo().label)){
							Stations.getVertices().get(i).edges.remove(k);
						}
					}
				}
			}
		}
		Search(Stations,new Vertex("U Borsigwerke"),new Vertex("U Hermannplatz"));

	}

	public void Search(Graph Stations,Vertex start,Vertex end) throws FileNotFoundException {

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

}