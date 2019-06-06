package agenda;

public class Contacto {

	public static void main(String[] args) {
		//atributos
		String nombre;
		String numero;
		String email;
		
		public Contacto(String _nombre, String _numero,String _email){
			this.nombre=_nombre;
			this.numero=_numero;
			this.email=_email;
		}
		
		public Contacto(String _nombre, String _numero){
			this.nombre=_nombre;
			this.numero=_numero;
			this.email="Vacio";
		}
		
		public String getNombre(){
			return this.nombre;
		}
		
		public void setNombre(String _nombre){
			this.nombre=_nombre;		
		}
		
		public String getNumero(){
			return this.numero;
		}
		
		public void setNumero(String _numero){
			this.numero=_numero;		
		}
			
		public String getEmail(){
			return this.email;
		}
		
		public void setEmail(String _email){
			this.email=_email;		
		}
		
		public void DatosContacto(){
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Numero: "+this.getNumero());
			System.out.println("Email: "+this.getEmail());
		}
		
		public static float suma(float a, float b){
			return a+b;
		}

	}

}
