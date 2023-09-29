import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] ListaProfessores = {"Alana", "Alexia", "Jessica", "Odirlei", "Porssarle", "Samanta", "Thiago"};



        for (int contador = 0; contador < ListaProfessores.length; contador++) {
            JOptionPane.showMessageDialog(null, "O indice atual de professores: " + contador);
            if (contador == 0) {
                JOptionPane.showMessageDialog(null, "O numero de professores esta na primeira posicao!\nProfessor:"+ListaProfessores[contador]);
            } else if (contador % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O numero de professores e par!\nProfessor: " +ListaProfessores[contador]);
            } else {
                JOptionPane.showMessageDialog(null, "O numero de professores e Impar!\nProfessor: "+ListaProfessores[contador]);
            }
        }


    }
}