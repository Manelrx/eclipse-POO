package interfaceGrafica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsaJComboBox extends JFrame implements ActionListener,ItemListener {
	JLabel label1;
	JTextField tadicionar, t1, t2;
	JComboBox combo;
	JButton novoItem;
	
	private void criarComponentesJanela() {
		this.label1 = new JLabel("Animais");
		this.label1.setForeground(Color.blue);
		this.label1.setFont(new Font("Arial", Font.BOLD, 15));
		this.novoItem =new JButton("Adiciona Item");
		this.t1 = new JTextField();
		this.t2 = new JTextField();
		this.tadicionar = new JTextField();
		String[] animais = { "Leão", "Elefante", "Cobra", "Jaboti"};
		combo = new JComboBox(animais);
	}
}
