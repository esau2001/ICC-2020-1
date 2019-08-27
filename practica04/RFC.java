import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

                System.out.println("Dame tu nombre completo");
	        String nombreCompleto = scanner.nextLine();
                String cumpleaños = scanner.nextLine();

            
               
                int primerEspacio = nombreCompleto.indexOf(' ');
                String primerasDos = nombreCompleto.substring(primerEspacio+1,primerEspacio+3);

                
              
                int segundoEspacio = nombreCompleto.lastIndexOf(' ');
                String inicialMaterno = nombreCompleto.substring(segundoEspacio+1,segundoEspacio+2);

               
                String inicialNombre = nombreCompleto.substring(0,1);

              
                String dia = cumpleaños.substring(0,2);

                String mes = cumpleaños.substring(3,5);

                String año = cumpleaños.substring(8,10);  

              
               
                String rfc  = primerasDos+inicialMaterno+inicialNombre+año+mes+dia;
                rfc = rfc.toUpperCase(); 
                System.out.println(rfc);

	}

}
