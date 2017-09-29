package br.com.fatec.entidade;

import java.awt.Graphics;

public class Oval extends DuasDimensoes{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(cor);
		
		if(preenchido){
			g.fillOval(0, 0, largura-1, altura-1);
		}
		else{
			g.drawOval(0, 0, largura-1, altura-1);
		}
	}

}
