package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 시간복잡도 -> O(V + E)  -> 노드수 + 간선수

public class 기본 {
	public static void main(String[] args) {
		
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("A");
		aList.add("B");
		String node = aList.remove(0);
		
		// 그래프 만들기
		HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
		graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
		graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
		graph.put("C", new ArrayList<String>(Arrays.asList("A", "G","H","I")));
		graph.put("D", new ArrayList<String>(Arrays.asList("B", "E","F")));
		graph.put("E", new ArrayList<String>(Arrays.asList("D")));
		graph.put("F", new ArrayList<String>(Arrays.asList("D")));
		graph.put("G", new ArrayList<String>(Arrays.asList("C")));
		graph.put("H", new ArrayList<String>(Arrays.asList("C")));
		graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
		graph.put("J", new ArrayList<String>(Arrays.asList("I")));
		System.out.println(bfsFunc(graph, "A"));
	}
	
	static ArrayList<String> bfsFunc(HashMap<String,ArrayList<String>> graph, String startNode){
		ArrayList<String> visited = new ArrayList<String>();
		ArrayList<String> needVisit = new ArrayList<String>();
		
		needVisit.add(startNode);
		
		while(needVisit.size() > 0) {
			String node = needVisit.remove(0);
			if(!visited.contains(node)) {
				visited.add(node); // 기록
				needVisit.addAll(graph.get(node));
			}
		}
		return visited;
		
	}
}
