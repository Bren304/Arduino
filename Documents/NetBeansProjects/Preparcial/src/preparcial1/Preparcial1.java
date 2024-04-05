package preparcial1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Codigo Realizado por Brennedy Yesid Munoz Jimenez
//
public class Preparcial1 {
    
    public static void main(String[] args) {
        
        ViewFigurasGeometricas myViewFigGeo = new ViewFigurasGeometricas();
        myViewFigGeo.setVisible(true);
        
        /*
        byte option1, option2;
        String txtGen = "Elija una de las sigueintes opciones \n1 para Rectángulo \n2 para Triangulos \n3 para Ciruclos \n0 para salir";
        String txt1 = "1 para calcular Area \n2 para calcular Perimetro \n3 para Diagonal \n0 para volver";
        String txt2 = "1 para calcular Area \n2 para calcular Perimetro \n3 para Hipotenusa \n0 para volver";
        String txt3 = "1 para calcular Area \n2 para calcular Perimetro \n3 para Diagonal \n0 para volver";
        String ingAltura = "Ingrese el valor de la altura";
        String ingBase = "Ingrese el valor de la base";
        String ingRadio = "Ingrese el valor del radio";

        option1 = Byte.parseByte(JOptionPane.showInputDialog(txtGen));
        do {
            switch (option1) {
                case 1:
                    Rectangulos myRectangulo = new Rectangulos();

                    option2 = Byte.parseByte(JOptionPane.showInputDialog(txt1));
                    switch (option2) {
                        case 1:
                            myRectangulo.altura = Double.parseDouble(JOptionPane.showInputDialog(ingAltura));
                            myRectangulo.base = Double.parseDouble(JOptionPane.showInputDialog(ingBase));

                            if (myRectangulo.altura == myRectangulo.base) {
                                System.out.println("son iguales");
                                Cuadrados myCuadrado = new Cuadrados();
                                myCuadrado.altura = myRectangulo.altura;
                                myCuadrado.base = myRectangulo.base;

                                JOptionPane.showMessageDialog(null, myCuadrado.calcularArea());
                            } else {
                                System.out.println("son diferentes");
                                JOptionPane.showMessageDialog(null, myRectangulo.calcularArea());
                            }
                            break;
                        case 2:
                            myRectangulo.altura = Double.parseDouble(JOptionPane.showInputDialog(ingAltura));
                            myRectangulo.base = Double.parseDouble(JOptionPane.showInputDialog(ingBase));

                            if (myRectangulo.altura == myRectangulo.base) {
                                Cuadrados myCuadrado = new Cuadrados();
                                myCuadrado.altura = myRectangulo.altura;
                                myCuadrado.base = myRectangulo.base;

                                JOptionPane.showMessageDialog(null, myCuadrado.calcularPerimetro());
                            } else {
                                JOptionPane.showMessageDialog(null, myRectangulo.calcularPerimetro());
                            }
                            break;
                        case 3:
                            myRectangulo.altura = Double.parseDouble(JOptionPane.showInputDialog(ingAltura));
                            myRectangulo.base = Double.parseDouble(JOptionPane.showInputDialog(ingBase));

                            if (myRectangulo.altura == myRectangulo.base) {
                                Cuadrados myCuadrado = new Cuadrados();
                                myCuadrado.altura = myRectangulo.altura;
                                myCuadrado.base = myRectangulo.base;

                                JOptionPane.showMessageDialog(null, myCuadrado.calcularDiagonal());
                            } else {
                                JOptionPane.showMessageDialog(null, myRectangulo.calcularDiagonal());
                            }
                            break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                            break;
                    }
                    option1 = Byte.parseByte(JOptionPane.showInputDialog(txtGen));
                    break;
                case 2:
                    Triangulos myTriangulo = new Triangulos();

                    option2 = Byte.parseByte(JOptionPane.showInputDialog(txt2));
                    switch (option2) {
                        case 1:
                            myTriangulo.altura = Double.parseDouble(JOptionPane.showInputDialog(ingAltura));
                            myTriangulo.base = Double.parseDouble(JOptionPane.showInputDialog(ingBase));

                            JOptionPane.showMessageDialog(null, myTriangulo.calcularArea());
                            break;
                        case 2:
                            myTriangulo.altura = Double.parseDouble(JOptionPane.showInputDialog(ingAltura));
                            myTriangulo.base = Double.parseDouble(JOptionPane.showInputDialog(ingBase));

                            JOptionPane.showMessageDialog(null, myTriangulo.calcularPerimetro());
                            break;
                        case 3:
                            myTriangulo.altura = Double.parseDouble(JOptionPane.showInputDialog(ingAltura));
                            myTriangulo.base = Double.parseDouble(JOptionPane.showInputDialog(ingBase));

                            JOptionPane.showMessageDialog(null, myTriangulo.calcularHipotenusa());
                            break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                            break;
                    }
                    option1 = Byte.parseByte(JOptionPane.showInputDialog(txtGen));
                    break;
                case 3:
                    Circulos myCirculo = new Circulos();

                    option2 = Byte.parseByte(JOptionPane.showInputDialog(txt3));
                    switch (option2) {
                        case 1:
                            myCirculo.radio = Double.parseDouble(JOptionPane.showInputDialog(ingRadio));

                            JOptionPane.showMessageDialog(null, myCirculo.calcularArea());
                            break;
                        case 2:
                            myCirculo.radio = Double.parseDouble(JOptionPane.showInputDialog(ingRadio));

                            JOptionPane.showMessageDialog(null, myCirculo.calcularPerimetro());
                            break;
                        case 3:
                            myCirculo.radio = Double.parseDouble(JOptionPane.showInputDialog(ingRadio));

                            JOptionPane.showMessageDialog(null, myCirculo.calcularDiagonal());
                            break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                            break;
                    }
                    option1 = Byte.parseByte(JOptionPane.showInputDialog(txtGen));
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                    option1 = Byte.parseByte(JOptionPane.showInputDialog(txtGen));
                    break;
            }
        } while (option1 != 0);
        
        */
    }
}
