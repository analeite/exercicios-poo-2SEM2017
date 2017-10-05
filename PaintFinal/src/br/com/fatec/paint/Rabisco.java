package br.com.fatec.paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Rabisco {
	
	int X;
	int Y;
	
	Color cor = new Color(255, 0, 0);
	
	public Rabisco(){
		
	}
	
	public void lerCoordenadas(MouseEvent e){
		if(!e.isMetaDown()){
			X = e.getX();
			Y = e.getY();
		}
		
	}
	
	public void pintar(MouseEvent e, int espessura){
		if(!e.isMetaDown()){
			Graphics2D g = (Graphics2D) ((JPanel)e.getSource()).getGraphics();
			g.setStroke(new BasicStroke(espessura));
			int x = e.getX();
			int y = e.getY();
			g.drawLine(X, Y, x, y);
			g.dispose();
			X = x;
			Y = y;
		}
	}

}
