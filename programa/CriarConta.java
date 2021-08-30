package programa;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import banco.ContaEspecial;

public class CriarConta extends JFrame implements ActionListener {
	
	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3;
	private JButton b1;
	private JPanel painel;
	
	public CriarConta() {
		this.l1 = new JLabel("Titular: ", JLabel.LEFT);
		this.t1 = new JTextField();
		this.l2 = new JLabel("Saldo: ", JLabel.LEFT);
		this.t2 = new JTextField();
		this.l3 = new JLabel("Limite : ", JLabel.LEFT);
		this.painel = new JPanel();
		this.b1 = new JButton("Criar Conta");		
		
		this.setTitle("Criar Conta especial");
		this.setSize(500, 300);
		this.setLocation(50, 50);
		this.getContentPane().setBackground(new Color(180, 180, 180));
		
		this.montarLayout();
	}
	
	private void montarLayout() {
		this.getContentPane().setLayout(new GridLayout(3, 2));
		this.getContentPane().add(this.l1);
		this.getContentPane().add(this.t1);
		this.getContentPane().add(this.l2);
		this.getContentPane().add(this.t2);
		this.getContentPane().add(this.l3);
		this.getContentPane().add(this.t3);
		this.getContentPane().add(this.painel);
		this.getContentPane().add(this.b1);
		this.b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == this.b1) {
			//ContaEspecial conta = new ContaEspecial(t1.getText(),t2.getText(),t3.getText());
			String s = "Conta nº: "  + "Titular " + this.t1.getText() + " Saldo" + this.t2.getText();
			JOptionPane.showMessageDialog(null, s, "Conta Criada", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void main (String[] args) {
		JFrame janela = new CriarConta();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
	
	
	
	
	
}
