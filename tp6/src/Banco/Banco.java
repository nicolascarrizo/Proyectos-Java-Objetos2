package Banco;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Solicitud> solicitudes;

	public Banco() {
		super();
		this.setClientes(new ArrayList<Cliente>());
		this.setSolicitud(new ArrayList<Solicitud>());
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	

	public ArrayList<Solicitud> getSolicitud() {
		return solicitudes;
	}

	public void setSolicitud(ArrayList<Solicitud> solicitud) {
		this.solicitudes = solicitud;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void agregarSolicitud(Solicitud solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	
	
}
	


