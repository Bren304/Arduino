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
public class Circulos extends FigurasGeometricas{
    
    double radio, diagonal;
    
    
            
    @Override
    public final double calcularArea (){
        area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
    @Override
    public final double calcularPerimetro(){
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    
    public final double calcularDiagonal(){
        diagonal = 2*radio;
        return diagonal;
    }
}
