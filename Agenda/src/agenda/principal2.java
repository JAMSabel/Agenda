package agenda;

import java.util.Scanner;

public class principal2 {

	public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
		
		Agenda mi_agenda = new Agenda(5);
		
		Contacto mi_contacto;
		
		String nombre, telefono, email;
		boolean band = true;
		
		System.out.println("ingresar opcion");
		int opcion;
		
		while (band == true ){
			System.out.println("[1] A�adir Contacto");
			System.out.println("[2] Editar Contacto");
			System.out.println("[3] Buscar Contacto");
			System.out.println("[4] Eliminar Contacto");
			System.out.println("[5] Listar Contacto");
			System.out.println("[0] Finalizar Contacto");
			
                        String op = reader.nextLine();

			opcion = integer.parseInt(op);
			
			switch (opcion) {
			case 0 :
				band = false;
				break;
				
			case 1: 
				System.out.println("Ingresa nombre contacto: "+"\n");
				nombre = reader.nextLine();
				System.out.println("Ingresa telefono contacto: "+"\n");
				telefono = reader.nextLine();
				System.out.println("Ingresa email contacto: "+"\n");
				email = reader.nextLine();
				
				mi_contacto = new Contacto(nombre,telefono,email);
			        mi_agenda.setContacto(mi_contacto);
			
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				 mi_agenda.listarContactos();
				 break;

			default:
				break;
				
			
				
			}
		}

		


	}

}
