/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparcial1;

/**
 *
 * @author aula11
 */
public class Cuadrados extends Rectangulos {

    @Override
    public final double calcularArea(){
        area = Math.pow(base, 2);
        return area;
    }
    
    @Override
    public final double calcularPerimetro(){
        perimetro = 4*base;
        return perimetro;
    }
    
    @Override
    public final double calcularDiagonal(){
        diagonal = Math.sqrt(2*Math.pow(base, 2));
        return diagonal;
    }
}
