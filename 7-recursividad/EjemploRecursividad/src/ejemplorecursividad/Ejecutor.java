/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorecursividad;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // TODO code application logic here
        
        MultiplicacionRusa mr = new MultiplicacionRusa();
        CrearArchivoTexto c = new CrearArchivoTexto();
        c.abrirArchivo();
        for(int i = 1; i<=10; i++){
            int a = i;
            int b = i + 10;
            int resultado = mr.mult_rusa(a, b); 
            c.agregarRegistros(a, b, resultado);
        }
        c.cerrarArchivo();
        
        
    }
}
