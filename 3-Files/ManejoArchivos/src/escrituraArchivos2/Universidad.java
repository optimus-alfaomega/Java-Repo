/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraArchivos2;

/**
 *
 * @author reroes
 */
public class Universidad {
    private String nombre;
    private String ciudad;
    private int numero_alumnos_hombres;
    private int numero_alumnos_mujeres;
    
    public Universidad(int n_hombres, int n_mujeres, String n, String c){
        agregar_n_alumnos_hombres(n_hombres);
        agregar_n_alumnos_mujeres(n_mujeres);
        agregar_ciudad(c);
        agregar_nombre(n);
    }
    
    public void agregar_nombre(String n){
        nombre = n;
    }
    
    public void agregar_ciudad(String n){
        ciudad = n;
    }
    
    public void agregar_n_alumnos_hombres(int n){
        numero_alumnos_hombres = n; 
    }
    
    public void agregar_n_alumnos_mujeres(int n){
        numero_alumnos_mujeres = n; 
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_ciudad(){
        return ciudad;
    }
    
    public int obtener_numero_hombres(){
        return numero_alumnos_hombres;
    }
    
    public int obtener_numero_mujeres(){
        return numero_alumnos_mujeres;
    }
}
