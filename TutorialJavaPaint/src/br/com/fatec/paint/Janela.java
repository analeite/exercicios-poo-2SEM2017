package br.com.fatec.paint;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		System.out.println("Tela criada no EDT? " + SwingUtilities.isEventDispatchThread());
		JFrame f = new JFrame("Paint");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Painel());
		f.pack();
		f.setVisible(true);
	}

}
