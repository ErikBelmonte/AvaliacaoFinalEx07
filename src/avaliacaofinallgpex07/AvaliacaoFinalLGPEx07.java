package avaliacaofinallgpex07;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Erik
 */
public class AvaliacaoFinalLGPEx07 {
    public static void main(String[] args) {
        String name;
        int code, x, codeF;
        double price, desc, tax, taxF;
        DecimalFormat f = new DecimalFormat ("0.0");
        
        name = JOptionPane.showInputDialog("Informe seu nome:");
        codeF = Integer.parseInt(JOptionPane.showInputDialog("Digite seu código de funcionário:"));
        price = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));
        code = Integer.parseInt(JOptionPane.showInputDialog("Digite um dos códigos para as seguintes formas pagamentos:"
                + "\n------------------------------------------------------------------------------------\n"
                + "Código 1 = À vista em dinheiro ou cheque -> recebe 15% de desconto. \n"
                + "Código 2 - À vista no cartão de crédito -> recebe 10% de desconto. \n"
                + "Código 3 - Em duas vezes -> preço normal de etiqueta sem juros. \n"
                + "Código 4 - Em três vezes -> preço normal de etiqueta mais juros de 10%."));
        
        if (code == 1){
            desc = ((price * 15)/100);
            price = price - desc;
            JOptionPane.showMessageDialog(null, "Nome do funcionário: "+name
                    +"\nSeu código de funcionário: "+codeF
                    +"\n----------------------------------------------------------------\n"
                    +"\nO cliente deverá pagar no total: R$"+f.format(price));
        }else if (code == 2){
            desc = ((price * 10)/100);
            price = price - desc;
            JOptionPane.showMessageDialog(null, "Nome do funcionário: "+name
                    +"\nSeu código de funcionário: "+codeF
                    +"\n----------------------------------------------------------------\n"
                    +"\nO cliente deverá pagar no total: R$"+f.format(price));
        }else if (code == 3){
            desc = price / 2;
            price = price - desc;
            JOptionPane.showMessageDialog(null, "Nome do funcionário: "+name
                    +"\nSeu código de funcionário: "+codeF
                    +"\n----------------------------------------------------------------\n"
                    +"\nO cliente deverá pagar no total: R$"+f.format(price));
        }else if (code == 4){
            x = 3;
            tax = ((price * 10)/100) * x;
            taxF = tax + price;
            JOptionPane.showMessageDialog(null, "Nome do funcionário: "+name
                    +"\nSeu código de funcionário: "+codeF
                    +"\n----------------------------------------------------------------\n"
                    +"\nO cliente deverá pagar no total: R$"+f.format(taxF));
        }else{
            JOptionPane.showMessageDialog(null, "Apenas números de 1 até 4 !!!");
        }
    }
}