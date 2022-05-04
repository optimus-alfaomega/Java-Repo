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
public class MultiplicacionRusa {

    public int mult_rusa(int a, int b) {
        if (a == 1) {
            return (b);
        }
        if (a % 2 != 0) {
            return (b + mult_rusa(a / 2, b * 2));
        } else {
            return (mult_rusa(a / 2, b * 2));
        }
    }
}
