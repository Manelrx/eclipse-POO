package interfaceGrafica;

import java.awt.Color;
import javax.swing.JFrame;

public class PrimeiraJanela extends JFrame {
	
		public PrimeiraJanela() {
			this.setTitle("Titulo");
			this.setSize(1000, 500);
			this.setLocation(150, 50);
			this.setResizable(false);
			this.getContentPane().setBackground(Color.blue);
		}
		
		public static void main (String[] args) {
			
			PrimeiraJanela jan = new PrimeiraJanela();
			
			jan.setVisible(true);
		}
	
}
