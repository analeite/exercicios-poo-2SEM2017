package br.com.fatec.paint;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela extends JFrame {
	public Janela() {
		Rabisco rab1 = new Rabisco(Color.RED);
		Rabisco rab2 = new Rabisco(Color.BLUE);
		rab1.setBorder(BorderFactory.createLineBorder(Color.RED));
		rab2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		getContentPane().setLayout(new GridLayout(1, 2));
		getContentPane().add(rab1);
		getContentPane().add(rab2);
		getContentPane().add(limpar);
		
		//O que eu adicionei e não deu certo
		limpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				rab1.repaint();
			}
		}
		);
		
		pack();
		setVisible(true);
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	JButton limpar = new JButton("Limpar");
	
	 public static void main(String[] args){
	 new Janela();
	 }
}
