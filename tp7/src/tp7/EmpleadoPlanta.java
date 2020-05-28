package tp7;

public class EmpleadoPlanta extends Empleado{

	public EmpleadoPlanta(Integer horasDeTrabajo, Integer sueldoBasico, boolean hijos, boolean casado,
			Integer cantHijos) {
		super(horasDeTrabajo, sueldoBasico, hijos, casado, cantHijos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer sueldo() {
		return ((this.getSueldoBasico() + (150 * this.getCantHijos())) * 13) / 100;
	}

	

}
