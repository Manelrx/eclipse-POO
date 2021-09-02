package interfaceGrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsaJComboBox extends JFrame implements ActionListener, ItemListener {
	JLabel label1;
	JTextField tadicionar, t1, t2;
	JComboBox combo;
	JButton novoItem;

	private void criarComponentesJanela() {
		this.label1 = new JLabel("Animais");
		this.label1.setForeground(Color.blue);
		this.label1.setFont(new Font("Arial", Font.BOLD, 15));
		this.novoItem = new JButton("Adiciona Item");
		this.t1 = new JTextField();
		this.t2 = new JTextField();
		this.tadicionar = new JTextField();
		String[] animais = { "Leão", "Elefante", "Cobra", "Jaboti" };
		combo = new JComboBox(animais);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.novoItem && this.tadicionar.getText().length() != 0) {
			this.combo.addItem(tadicionar.getText());
			this.tadicionar.setText("");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		this.t1.setText(" O valor selecionado é " + this.combo.getSelectedItem().toString());
		this.t2.setText("Existem " + String.valueOf(this.combo.getItemCount()) + " itens");
	}

	private void setarAtributosJanela() {
		this.setTitle("Usando JComboBox");
		this.setBounds(50, 50, 400, 170);
		this.getContentPane().setBackground(new Color(190, 190, 190));
		this.getContentPane().setLayout(new GridLayout(3, 2));
		this.getContentPane().add(this.label1);
		this.getContentPane().add(this.combo);
		this.getContentPane().add(this.novoItem);
		this.getContentPane().add(this.tadicionar);
		this.getContentPane().add(this.t1);
		this.getContentPane().add(this.t2);
	}

	private void adicionarListeners() {
		this.novoItem.addActionListener(this);
		this.combo.addItemListener(this);
	}

	public UsaJComboBox() {
		this.criarComponentesJanela();
		this.setarAtributosJanela();
		this.adicionarListeners();
	}

	public static void main(String[] args) {
		JFrame janela = new UsaJComboBox();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
