package interfaceGrafica;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class ExemploFlowLayout extends JFrame {

	public ExemploFlowLayout() {
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER,10 ,10);
		this.setLayout(layout);
		this.add(new JLabel("O rato roeu a roupa do rei de Roma"));
		this.add(new JLabel("5 minutos para daqui a pouco"));
		this.add(new JLabel("Cara caramba cara cara oh"));
		this.add(new JLabel("A"));
		this.add(new JLabel("B"));
	}
	
	public static void main (String[] args) {
		JFrame janela = new ExemploFlowLayout();
		janela.setBounds(250, 50, 280, 170);
		janela.setTitle("FlowLayout");
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
