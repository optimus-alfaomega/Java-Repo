package escrituraArchivos2;

// Ejemplo tomado del libro 
// D EITEL , P AUL J. Y H ARVEY M. D EITEL
// CÓMO PROGRAMAR EN J AVA . Séptima edición
// fines educativos
// Prueba de la clase CrearArchivoTexto.

public class PruebaCrearArchivoTexto
{
   public static void main( String args[] )
   {
      ArchivoTexto aplicacion = new ArchivoTexto();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
   } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

