package repository;

import java.util.ArrayList;
import java.util.List;

import model.Node;

// classe com a lista de nós na DHT
public class NodeList {

	private static List<Node> nodesList;
	
	public NodeList() {
		nodesList = new ArrayList<>();
	}
	
	public List<Node> getNodesList() {
		return nodesList;
	}
	
}
