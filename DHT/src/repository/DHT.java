package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Node;

// classe com a lista de nós na DHT
public class DHT {

	// tamanho máximo do identificador (m bits, já considerado o resultado de 2^m,
	// com m=6)
	private static final int m = 64;

	private static Node[] nodesList;

	// inicializa a dht com uma lista vazia de nós
	public DHT() {
		nodesList = new Node[m];
	}

	// retorna a lista de nós
	public Node[] getNodesList() {
		return nodesList;
	}

	// insere um novo nó na dht
	public void newNode() {
		Random ran = new Random();
		int i;
		do {
			i = ran.nextInt(m);
		} while (this.getById(i) != null);
		nodesList[i] = new Node(i);
	}

	// procura um nó na lista a partir de um dado id
	public Node getById(int id) {
		for (Node node : nodesList) {
			if (node != null && node.getId() == id)
				return node;
		}
		return null;
	}

	// TODO: att anterior e sucessor, fts e tal
	// remove um nó
	public void removeNode(int id) {
		nodesList[id] = null;
	}

}
