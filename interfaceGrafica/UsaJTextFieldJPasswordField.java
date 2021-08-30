package interfaceGrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsaJTextFieldJPasswordField extends JFrame implements ActionListener {

	private JLabel l1, l2;
	private JTextField t1;
	private JPasswordField p2;
	private JButton b1;
	private JPanel painel;

	public UsaJTextFieldJPasswordField() {
		this.l1 = new JLabel("Nome ", JLabel.LEFT);
		this.t1 = new JTextField();
		this.l2 = new JLabel("Senha", JLabel.LEFT);
		this.p2 = new JPasswordField();
		this.p2.setEchoChar('*');
		this.painel = new JPanel();
		this.b1 = new JButton("Mostrar");

		this.setTitle("Usando JTextField e jPasswordField");
		this.setSize(320, 100);
		this.setLocation(50, 50);
		this.getContentPane().setBackground(new Color( 180,180, 180));
		
		this.montarLayout();
	}
	
	private void montarLayout() {
		this.getContentPane().setLayout(new GridLayout(3, 2));
		this.getContentPane().add(this.l1);
		this.getContentPane().add(this.t1);
		this.getContentPane().add(this.l2);
		this.getContentPane().add(this.p2);
		this.getContentPane().add(this.painel);
		this.getContentPane().add(this.b1);
		this.b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == this.b1) {
			String s = "Usuário: " + this.t1.getText()	 + " Senha: " + new String(this.p2.getPassword());
			JOptionPane.showMessageDialog(null, s, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	public static void main(String[] args) {
		JFrame janela = new UsaJTextFieldJPasswordField();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	
}
