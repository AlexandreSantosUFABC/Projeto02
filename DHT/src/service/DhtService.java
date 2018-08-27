package service;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import model.Node;
import repository.DHT;

@Path("dht")
public class DhtService {

	private static DHT dht = new DHT();
	
	// insere novo nó na rede
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void join(ArrayList<Node> knownHostList) {
		for (Node node : knownHostList) {
			if (dht.getById(node.getId()) != null) {
				node.newEntity();
				return;
			}
		}
		// cria o nó se não encontrar nenhum
		dht.newNode();
	}
	
	// retira um nó da rede
	@DELETE
	@Path("/{id}")
	public void leave(@PathParam("id") int id) {
		dht.removeNode(id);
	}
	
	
	public void store(int key, byte[] value) {
		
	}
	
	public void retrieve(int key) {
		
	}
	
}
