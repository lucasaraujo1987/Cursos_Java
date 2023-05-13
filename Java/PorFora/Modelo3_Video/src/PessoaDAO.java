
import javax.swing.JOptionPane;


public class PessoaDAO {
    
    public void imprimirPessoa(PessoaDTO objpessoaDTO){
        String nome;
        nome = objpessoaDTO.getNome();
        
        JOptionPane.showMessageDialog(null, nome);
    }
    
}
