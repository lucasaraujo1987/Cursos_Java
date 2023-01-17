package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension tela = resolucao.getScreenSize();
        System.out.println("A sua resolução de tela é " +tela.width+ " x " +tela.height);
    }
    
}
