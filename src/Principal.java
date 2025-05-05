public class Principal {
    public static void main(String[] args) {
        //javier chavez
        ConsultaPelicula consulta = new ConsultaPelicula();
        Pelicula pelicula = consulta.buscarPelicula( 9);
        System.out.println(pelicula);

    }
}
