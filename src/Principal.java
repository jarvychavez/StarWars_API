import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el número de la pelicula de Star Wars que quiera consultar:");



        try {
            var numeroDePelicula = Integer.valueOf(teclado.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

        }catch (NumberFormatException e){
            System.out.println("Número no encontrado" +e.getMessage());
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }



    }
}
