package ejemplorecursividad;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// import com.deitel.jhtp7.cap14.RegistroCuenta;
public class CrearArchivoTexto {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("multiplicacion.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // agrega registros al archivo
    public void agregarRegistros(int a, int b, int c) {
      // objeto que se va a escribir en el archivo
        // System.out.printf("%d x %d = %d \n", a, b, c);
        try // env�a valores al archivo
        {
            // obtiene los datos que se van a enviar al archivo

            salida.format("%d x %d = %d \n", a, b, c);

        } // fin de try
        catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error al escribir en el archivo.");
            return;
        } // fin de catch
        catch (NoSuchElementException elementException) {
            System.err.println("Entrada invalida. Intente de nuevo.");
            // entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
        } // fin de catch

    } // fin del m�todo agregarRegistros

    // cierra el file
    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase CrearArchivoTexto

