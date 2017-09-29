package br.com.fatec.paint;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class Painel extends JPanel {
	QuadradoVermelho quadradoVermelho = new QuadradoVermelho();

	public Painel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				moveSquare(e.getX(), e.getY());
			}
		});
		addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				moveSquare(e.getX(), e.getY());
			}
		});

	}

	private void moveSquare(int x, int y){
		//Estado do quadrado atual, armazenado como variáveis finais
		final int CURR_X = quadradoVermelho.getX();
		final int CURR_Y = quadradoVermelho.getY();
		final int CURR_W = quadradoVermelho.getWidth();
		final int CURR_H = quadradoVermelho.getHeight();
		final int OFFSET = 1;
		
		if((CURR_X != x) || (CURR_Y != y)){
			//O quadrado esta se movendo, repaint o background
			repaint(CURR_X, CURR_Y, CURR_W+OFFSET, CURR_H+OFFSET);
			
			//Atualizando as coordenadas
			quadradoVermelho.setX(x);
			quadradoVermelho.setY(y);
			
			//Repaint o quadrado em sua nova localização
			repaint(quadradoVermelho.getX(), quadradoVermelho.getY(),
			quadradoVermelho.getWidth() + OFFSET, 
			quadradoVermelho.getHeight() + OFFSET);
		}
		
		}

	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw Text
		g.drawString("Esse é meu painel customizado!", 10, 20);

		quadradoVermelho.paintSquare(g);

	}

}
