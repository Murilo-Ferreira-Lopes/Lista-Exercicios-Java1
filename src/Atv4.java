import javax.swing.*;

public class Atv4 {
    public static void main(String[] args) {
        double salario = 1000;

        while (salario < 5000) {
            salario += 100;
            JOptionPane.showMessageDialog(null, "O salário ainda é R$" + salario);

        }
        JOptionPane.showMessageDialog(null, "O salário final é R$" + salario);
    }
}
