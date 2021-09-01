package programa;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import banco.Conta;
import banco.ContaEspecial;

public class TelaDeEscolha extends JFrame implements ActionListener {
	ContaEspecial auxiliar = new ContaEspecial();

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
			this.dispose();
			CriarConta.executaCriaConta();
		} else if (e.getSource() == this.acessarConta) {
			Conta contaInformada = auxiliar.EncontraConta(t1.getText());
			if(contaInformada == null){
				JOptionPane.showMessageDialog(null, "Erro ao encontrar conta","Conta não localizada", JOptionPane.ERROR_MESSAGE);
			}else {
				String c = "Conta n° " + contaInformada.getNumConta() + " Titular: " + contaInformada.getTitular().getNome() + " Saldo: " + contaInformada.getSaldo();
				JOptionPane.showMessageDialog(null, c, "Saldo Solicitado", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
		
		public static void executar() {
			JFrame tela = new TelaDeEscolha();
			tela.setUndecorated(true);
			tela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setVisible(true);
		}
}
