package model;
//A cada nó é atribuído um identificador aleatório de m-bits
//A cada entidade armazenada na DHT é atribuída uma chave de m-bits
//Entidades com chave k estão sob responsabilidade do nó cujo identificador id
//seja o menor possível tal que id > k

//Chamamos de nó p o nó cujo identificador é p
public class Node {

	private static int cont = 0;
	private int id;
	
	private Node anterior;
	private Node sucessor;
	
	public Node() {
		this.id = cont++;
	}
	
	public int getId() {
		return id;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getSucessor() {
		return sucessor;
	}

	public void setSucessor(Node sucessor) {
		this.sucessor = sucessor;
	}

}
