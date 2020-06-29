package banco;

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
	
	public void otogarCreditoACliente(Solicitud solicitudDeCredito) {
		if(solicitudDeCredito.esCreditoAceptado()){
			this.aceptarCredito(solicitudDeCredito.getCliente());
			
		}
	}
	
	private void aceptarCredito(Cliente cliente) {
		cliente.setCredito(cliente.getSolicitudCredito().getMonto());
	}
	
	public void registrarSolicitudesDeClientes() {
		for (Cliente cliente : this.getClientes()) {
			this.agregarSolicitud(cliente.getSolicitudCredito());
		}
	}
	
	public void realizarSolicitudesDeCredito() {
		for (Cliente cliente : this.getClientes()) {
			this.otogarCreditoACliente(cliente.getSolicitudCredito());
		}
	}
	
	
}
	


