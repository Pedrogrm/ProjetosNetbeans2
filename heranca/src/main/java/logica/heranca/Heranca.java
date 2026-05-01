/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.heranca;

/**
 *
 * @author pedro
 */
public class Heranca {

    public static void main(String[] args) {
        
        
        animal pet = new animal("Rex", 2);
        
        cachorro pet2 = new cachorro("Caramelo", "picolo", 3 );
        pet2.dormir();
        pet2.fazerBarulho();
    }
}
