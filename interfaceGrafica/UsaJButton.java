package interfaceGrafica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsaJButton extends JFrame implements ActionListener {

	private JButton b1;
	public UsaJButton() {
		b1 = new JButton("Mensagem");
		b1.setHorizontalTextPosition(AbstractButton.RIGHT);
		b1.setBackground(new Color(100, 180, 180));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Scripts", Font.BOLD, 20));
		b1.setEnabled(true);
		b1.setToolTipText("Clique aqui para ver a mensagem");
		b1.setMnemonic(KeyEvent.VK_B);
		b1.addActionListener(this);
		
		this.setTitle("Inserindo botoes na janela");
		this.setSize(350, 100);
		this.setLocation(50,50);
		this.getContentPane().setBackground(new Color(180, 180, 180));;
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(this.b1);		
	}
	
	public void actionPerformed(ActionEvent e ) {
		if (e.getSource() == b1) 
			JOptionPane.showMessageDialog(null, "Deu certo carai", "Botão clicado",JOptionPane.INFORMATION_MESSAGE);		
	}
	
	public static void main(String[] args) {
		JFrame janela = new UsaJButton();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	
}
