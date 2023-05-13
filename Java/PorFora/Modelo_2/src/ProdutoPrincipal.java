
import javax.swing.JOptionPane;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        
        String nome;
        double quantidade, valor;
        
        nome = JOptionPane.showInputDialog("Digite o nome do produto");
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do produto"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
        
        Produto objproduto = new Produto();
        objproduto.ImprimirProduto(nome, quantidade, valor);
    }
    
}
