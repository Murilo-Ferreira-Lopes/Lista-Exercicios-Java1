import javax.swing.*;

public class Atv5 {
    public static void main(String[] args) {
        String[] ListaCarros = {"fiesta", "onix", "fusca", "saveiro"};

        for (String carro : ListaCarros) {
            JOptionPane.showMessageDialog(null, "O carro atual: " + carro);
        }

    }
}
