package tp7;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(Integer horasDeTrabajo, Integer sueldoBasico, boolean hijos, boolean casado,
			Integer cantHijos) {
		super(horasDeTrabajo, sueldoBasico, hijos, casado, cantHijos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer sueldo() {
		// TODO Auto-generated method stub
		return ((40 * this.getHorasDeTrabajo()) * 13) / 100;
	}
	
	


}
