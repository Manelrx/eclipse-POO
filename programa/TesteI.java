package programa;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import banco.Conta;
import banco.ContaEspecial;
import banco.ContaPoupanca;

public class TesteI extends JInternalFrame implements ActionListener, ItemListener {
	public static ArrayList<Conta> contas = new ArrayList<Conta>();
	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3;
	private JButton b1, b2;
	private JRadioButton contaEspecial, contaPoupanca;
	private ButtonGroup escolheConta;
	
	
	
	
	private void setarAtributosEscolheConta() {
		this.escolheConta.add(contaEspecial);
		this.escolheConta.add(contaPoupanca);
	}
	
	private void adicionarItemListener() {
		this.contaEspecial.addItemListener(this);
		this.contaPoupanca.addItemListener(this);
	}
	
	private void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.b1) {
			
		}else if(e.getSource() == this.b2) {
			
		}
	}
}

