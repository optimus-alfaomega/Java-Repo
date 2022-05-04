package lecturaArchivos;

// Ejemplo tomado del libro 
// D EITEL , P AUL J. Y H ARVEY M. D EITEL
// CÓMO PROGRAMAR EN J AVA . Séptima edición
// fines educativos

// Este programa prueba la clase LeerArchivoTexto.

public class PruebaLeerArchivoTexto
{
   public static void main( String args[] )
   {
      LeerArchivoTexto aplicacion = new LeerArchivoTexto();

      aplicacion.abrirArchivo();
      aplicacion.leer_informacion();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

