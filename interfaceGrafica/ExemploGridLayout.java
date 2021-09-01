package interfaceGrafica;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

public class ExemploGridLayout extends JFrame{
	public ExemploGridLayout() {
	GridLayout layout = new GridLayout(2, 3, 10, 10);
	this.setLayout(layout);
	this.add(new JLabel("O rato roeu a roupa do rei de Roma"));
	this.add(new JLabel("5 minutos para daqui a pouco"));
	this.add(new JLabel("Cara caramba cara cara oh"));
	this.add(new JLabel("A"));
	this.add(new JLabel("B"));
	}

	public static void main(String[] args) {
		JFrame janela = new ExemploGridLayout();
		janela.setBounds(250, 50, 600, 170);
		janela.setTitle("GridLayout");
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		}
}