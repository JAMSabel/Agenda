package agenda;

public class Agenda {
	public static void main(String[] args) {
		Contacto[] contactos;
		
		public Agenda(int tama�o){
			this.contactos=new Contacto[tama�o];
		}
		
		
		public void setContacto(Contacto c) {
			
			if (this.contactos==null) {
				this.contactos[0]=c;
			}else {
				int indice =busca_vacio_agenda();
				this.contactos[indice]=c;
			}
			
			
		}
		
		private int busca_vacio_agenda() {
			
			int indice=0;
			
			while(this.contactos[indice]!=null) {
				++indice;
			}
			return indice;
		
		}
		
		public void listarContactos() {
			
			if(this.contactos != null) {
				for (int i=0 ; i<this.contactos.length ;i++){
					if (this.contactos[i]==null) {
						
					}else 
						this.contactos[i].DatosContacto();
				}
		
		      }
		}

		public void buscarPorNombre(String nombre) {
			
			boolean encontrado = false;
			for (int i=0;i<this.contactos.length && !encontrado;i++){
				if(this.contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(nombre)){
					System.out.println("Su telefono es " + this.contactos[i].getNumero());
					encontrado = true;
				    }
			}
			if(!encontrado){
				System.out.println("No se ha encontrado el contacto");
			}
				
			     	
			 
		}
		
		
		public void eliminarContacto (Contacto c) {
			
			boolean encontrado = false;
			for(int i=0;i<this.contactos.length && !encontrado;i++){
				if(this.contactos[i]!=null && this.contactos[i].equals(c)){
					this.contactos[i]=null;
					encontrado=true;
				}
			}
			
			if(!encontrado){
				System.out.println("No se ha eliminado el contacto");
			}
			
		}
		
	}
}
	

	
		


	
