
import javax.swing.JOptionPane;

public class Professor {
    public void ImpromirNovoSalario(double salario){
        double novosalario = salario * 1.50;
        
        if(novosalario < 1000){
            JOptionPane.showMessageDialog(null,"Seu novo salario é " + novosalario + " Precisa trabalhar mais");
            
        }else{
            JOptionPane.showMessageDialog(null,"Seu novo salario é " + novosalario + " Show de bola");
        }
        
    }
}
