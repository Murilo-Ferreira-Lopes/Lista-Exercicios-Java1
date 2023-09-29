import javax.swing.*;

public class Atv3 {
    public static void main(String[] args) {
        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero: "));

        }while(numero != 0);

        JOptionPane.showMessageDialog(null, "programa Finalizado com Sucesso!!!");

    }
}
