package programa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import programa.CriarConta;


// https://www.devmedia.com.br/construindo-janelas-com-swing/5752
public class MenuApp extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu menuConta, menuOperacoes;
	JMenuItem criarConta, verSaldo, realizarDeposito, realizarSaque,sair;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == criarConta) {
			CriarConta.executaCriaConta();
		} else if (e.getSource() == verSaldo) {
			
		} else if (e.getSource() == realizarDeposito) {
			
		} else if (e.getSource() == realizarSaque) {
			
		} else if (e.getSource() == sair) {
			System.exit(0);
		}
	}
	
	public MenuApp() {
		this.setBounds(180, 50, 480,280);
		this.setTitle("Tela principal");
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		this.menuBar = new JMenuBar();
		this.setJMenuBar(this.menuBar);
		this.sair = new JMenuItem("Sair");
		
		this.menuConta = new JMenu("Conta");
		this.menuOperacoes = new JMenu("Operações");
		this.criarConta = new JMenuItem("Criar Conta");
		this.menuConta.add(criarConta);
		this.verSaldo = new JMenuItem("Ver Saldo");
		this.realizarDeposito = new JMenuItem("Realizar Deposito");
		this.realizarSaque = new JMenuItem("Realizar saque");
		this.menuOperacoes.add(realizarDeposito);
		this.menuOperacoes.add(realizarSaque);
		this.menuConta.add(menuOperacoes);
		this.menuBar.add(menuConta);
		this.menuBar.add(sair);
		this.criarConta.addActionListener(this);
		this.verSaldo.addActionListener(this);
		this.realizarDeposito.addActionListener(this);
		this.realizarSaque.addActionListener(this);
		this.sair.addActionListener(this);
	}
	
	public void instanciaJPanel() {
		MenuApp telaPrincipalApp = new MenuApp();
		this.getContentPane().add(telaPrincipalApp);
	}
	
	public static void main (String[] args) {
		//executaPrograma();
		new MenuApp();
	}
	
	public static void executaPrograma() {
		JFrame telaPrincipal = new MenuApp();
		telaPrincipal.setUndecorated(true);
		telaPrincipal.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPrincipal.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
}
