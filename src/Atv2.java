import javax.swing.*;

public class Atv2 {
    public static void main(String[] args) {

       int senha;
       do{
       senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua senha numerica:"));
       if(senha != 123){
        JOptionPane.showMessageDialog(null,"Senha Incorreta!");
       }
       }while(senha != 123);
       JOptionPane.showMessageDialog(null, "Senha Correta!!!\nBem Vindo! :)");
    }

}
