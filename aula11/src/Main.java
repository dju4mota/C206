import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        //JOptionPane.showConfirmDialog(null, "ok");

        //String resp = JOptionPane.showInputDialog("Oi");

        try {
            throw new SaqueInvalido();
        } catch (SaqueInvalido e) {
            System.out.println("saque invalido");
        }


     /*   JOptionPane.showMessageDialog(null,"Erro");
        System.out.println(resp);
    */}
}