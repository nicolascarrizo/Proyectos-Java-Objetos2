package tp3;


public class Persona {
	
		private String nombre;
		private Integer fechaNacimiento;
		private Integer edad;
		
		
		public Persona(String nombre, Integer fechaNacimiento, Integer edad) {
			super();
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
			this.edad = edad;
		}
		
		

		public String getNombre() {
			return nombre;
		}
		public Integer getFechaNacimiento() {
			return fechaNacimiento;
		}
		public Integer getEdad() {
			return edad;
		}
		
		public Boolean menorQue(Persona persona){
			
			if(this.getEdad() < persona.getEdad()) return true; else return false; 
			
		}
		
		

}
