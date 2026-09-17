/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2026c3clase2repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String nombre ="";
//        String variableTemporal="";
//        int peso=0;
//        
//        nombre=JOptionPane.showInputDialog("Dime tu nombre");
//        JOptionPane.showMessageDialog(null, "Este es el nombre solicitado " + nombre);
//        
//        variableTemporal=JOptionPane.showInputDialog("Dime tu peso");
//        peso=Integer.parseInt(variableTemporal);
//        peso=peso-5;
//        JOptionPane.showMessageDialog(null,"Mi peso: " + peso);

        /*
         * esto esta comentado
         */
        
        /*
        int edad=0;
        String temp="";
        temp=JOptionPane.showInputDialog("Digte su edad");
        edad=Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, edad);
        
        if(edad>=18){
            JOptionPane.showMessageDialog(null, "Si puede tomar alcohol, fumar, hacer pornografia");
            if (edad==18){
                JOptionPane.showMessageDialog(null, "Fijo va ir de fiesta");

            }
        }else{
            JOptionPane.showMessageDialog(null, "Le toca ir a misa todos los domingos");

        }
        
        
        if (edad==18)
           JOptionPane.showMessageDialog(null, "tiene apenas 18");
        JOptionPane.showMessageDialog(null, "esto simpre se va imprimir");

        */
        
        int dia =0;
        String temp1="";
        
        temp1=JOptionPane.showInputDialog("Digite el día de la semana");
        dia=Integer.parseInt(temp1);
        
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "LUNES");            
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "MARTES");
                //aqui puede ir mas logica.
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MIERCOLES");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "JUEVES");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "VIERNES");
                JOptionPane.showMessageDialog(null, "y el cuerpo lo sabe");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "SABADO");
                break;    
            case 7:
                JOptionPane.showMessageDialog(null, "DOMINGO");
                break;
            case 8:
            case 9:
            case 10:        
                JOptionPane.showMessageDialog(null, "Es un día virtual");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Día incorrecto");

        }
        
        
    }
    
}
