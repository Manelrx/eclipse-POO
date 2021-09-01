package programa;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import banco.Conta;
import banco.ContaEspecial;

public class CriarConta extends JFrame implements ActionListener {
	public static ArrayList<Conta> contas = new ArrayList<Conta>();

	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3;
	private JButton b1, b2;

	public CriarConta() {
		this.l1 = new JLabel("Titular: ", JLabel.CENTER);
		this.t1 = new JTextField();
		this.l2 = new JLabel("Saldo: ", JLabel.CENTER);
		this.t2 = new JTextField();
		this.l3 = new JLabel("Limite : ", JLabel.CENTER);
		this.t3 = new JTextField();
//		this.painel = new JPanel();
		this.b1 = new JButton("Criar Conta");
		this.b2 = new JButton("Ver Contas");

		this.setTitle("Criar Conta especial");
		this.setSize(300, 300);
		this.setLocation(50, 50);
		this.getContentPane().setBackground(new Color(100, 180, 180));

		this.montarLayout();
	}

	private void montarLayout() {
		this.getContentPane().setLayout(new GridLayout(4, 2));
		this.getContentPane().add(this.l1);
		this.getContentPane().add(this.t1);
		this.getContentPane().add(this.l2);
		this.getContentPane().add(this.t2);
		this.getContentPane().add(this.l3);
		this.getContentPane().add(this.t3);
//		this.getContentPane().add(this.painel);
		this.getContentPane().add(this.b2);
		this.b2.addActionListener(this);
		this.getContentPane().add(this.b1);
		this.b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.b1) {
			ContaEspecial conta = new ContaEspecial((contas.size()+1),t1.getText(), t2.getText(), t3.getText());
			String s = "Conta nº " + conta.getNumConta() + "Titular: " + conta.getTitular().getNome() + " Saldo: R$" + conta.getSaldo();
			JOptionPane.showMessageDialog(null, s, "Conta Criada", JOptionPane.INFORMATION_MESSAGE);
			contas.add(conta);
		} else if (e.getSource() == this.b2) {
			this.dispose();
			TelaDeEscolha.executar();
		}
	}

	public static void main(String[] args) {
		executaCriaConta();

	}
	public static void executaCriaConta() {
		JFrame janela = new CriarConta();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

}
