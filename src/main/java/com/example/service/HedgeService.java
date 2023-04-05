package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HedgeFundrepo;
import com.example.model.Client;


@Service
public class HedgeService {
	
	@Autowired
	private HedgeFundrepo hedgerepo;
	
	public Client saveClientDetails(Client newClient) {
		return hedgerepo.save(newClient);	
	}
	
	public List<Client> saveAllClientDetails(List<Client> clients) {
		return hedgerepo.saveAll(clients);	
	}
	
	public List<Client> getAllClients(){
		return hedgerepo.findAll();
	}
	
	public Client getAllClientById(int id){
		return hedgerepo.findById(id).orElse(null);
	}
	
	public Client getAllClientByName(String name){
		return hedgerepo.findByName(name);
	}
	
	public String deleteClientById(int id) {
		hedgerepo.deleteById(id);
		return "Client Data with "+id+"has been deleted";
	}

	public Client updateClientDetails(Client client) {
//		Client existingClient = hedgerepo.findById(client)
		
		return hedgerepo.save(client);
		
		
	}

}
