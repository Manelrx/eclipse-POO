package programa;
import java.awt.*;
import programa.CriarConta;
import java.awt.event.*;
import javax.swing.*;
import banco.Conta;

public class TelaDeEscolha extends JFrame implements ActionListener {
	Conta auxiliar;

	private JLabel l1;
	private JTextField t1;
	private JButton voltar, acessarConta;
	
	public TelaDeEscolha() {
		this.l1 = new JLabel("Nº da conta: ", JLabel.CENTER);
		this.t1 = new JTextField();
		this.voltar = new JButton("Voltar");
		this.acessarConta = new JButton(" Acessar Conta");
		
		this.setTitle("Pesquisar Conta");
		this.setSize(300,300);
		this.setLocation(50,50);
		this.getContentPane().setBackground(new Color(100,180,180));
		
		this.montarLayout();
	}
	
	private void montarLayout() {
		this.getContentPane().setLayout(new GridLayout(4,2));
		this.getContentPane().add(this.l1);
		this.getContentPane().add(this.t1);
		this.getContentPane().add(this.voltar);
		this.voltar.addActionListener(this);
		this.getContentPane().add(this.acessarConta);
		this.acessarConta.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.voltar) {
			
		} else if (e.getSource() == this.acessarConta) {
			if(auxiliar.EncontraConta(t1.getText()) == null){
				JOptionPane.showMessageDialog(null, "Erro ao encontrar conta","Conta não localizada", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
