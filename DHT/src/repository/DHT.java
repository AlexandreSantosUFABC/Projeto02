package repository;

import java.util.ArrayList;
import java.util.List;

import model.Node;

// classe com a lista de nós na DHT
public class DHT {

	private static List<Node> nodesList;
	
	public DHT() {
		nodesList = new ArrayList<>();
	}
	
	public List<Node> getNodesList() {
		return nodesList;
	}
	
}
