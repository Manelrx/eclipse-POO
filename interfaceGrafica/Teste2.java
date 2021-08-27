package interfaceGrafica;
import java.awt.*;
import javax.swing.*;

public class Teste2 extends JFrame{
	private JLabel label1, label2;
	private ImageIcon icone = new ImageIcon("c:/erro.png");
	public Teste2() {
		this.setTitle("Esse é o titulo");
		this.setSize(350, 120);
		this.setLocation(50, 50);
		this.getContentPane().setBackground(new Color (220, 220, 0));
		
		this.label1 = new JLabel("Esquerda", icone, JLabel.LEFT);
		this.label2 = new JLabel("Direita", JLabel.RIGHT);
		
		this.getContentPane().setLayout(new GridLayout(2, 1));
		this.getContentPane().add(this.label1);
		this.getContentPane().add(this.label2);
	}
	public static void main (String[] args) {
		JFrame janela = new Teste2();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
}
