package interfaceGrafica;
import javax.swing.*;
public class UsaOptionPane {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "digite seu Login", "Login no sitema", JOptionPane.QUESTION_MESSAGE);
		
		if (s == null) return;
		if(JOptionPane.showConfirmDialog(null,"Confirma login ?", "Caixa de Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
		{
			JOptionPane.showMessageDialog(null, s, "Login Confirmado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, s, "Login NÃO CONFIRMADO", JOptionPane.WARNING_MESSAGE);
			String[] nomes = {"João", "Maria", "Felipe", "Arthur"};
			int resposta = JOptionPane.showOptionDialog(null, "Escolha um login padrão", "Login no sistema", 0, JOptionPane.INFORMATION_MESSAGE, null, nomes, nomes[1]);
			if (resposta == 1);
			{
				JOptionPane.showMessageDialog(null, "Login " + s + "Invalido !!!", "Login Confirmado", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
