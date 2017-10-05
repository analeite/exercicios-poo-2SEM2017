package br.com.fatec.paint;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Janela extends JFrame {

	Rabisco objRabisco = new Rabisco();
	
	public Janela(){
		super("Paint");
		setSize(630, 600);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);
		setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			
		}
				);
		initComponents();

		
		}

	public void initComponents() {
		getContentPane().setLayout(null);
		cor.setBounds(10, 80, 150, 25);
		espessuraTraco.setBounds(265, 40, 100, 25);
		espessuraTraco.setFont(f1);
		espessura.setMaximum(10);
		espessura.setBounds(230, 80, 150, 25);
		limpar.setBounds(450, 80, 150, 25);
		
		limpar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				painelDesenho.repaint();				
			}
			
		}
				
				);
		
		painelDesenho.setBounds(10, 130, 600, 420);
		painelDesenho.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		painelDesenho.setBackground(Color.white);
		
		painelDesenho.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				objRabisco.lerCoordenadas(e);
			}
		}
				
				);
		
		painelDesenho.addMouseMotionListener(new MouseAdapter(){
			public void mouseDragged(MouseEvent e){
				objRabisco.pintar(e, espessura.getValue());
				
			}
		}
				
				);

		getContentPane().add(cor);
		getContentPane().add(espessuraTraco);
		getContentPane().add(espessura);
		getContentPane().add(limpar);
		getContentPane().add(painelDesenho);;
	}

	Font f1 = new Font("Arial", Font.PLAIN, 15);

	JButton cor = new JButton("Cor");
	JButton limpar = new JButton("Limpar");
	JLabel espessuraTraco = new JLabel("Espessura");
	JSlider espessura = new JSlider();
	JPanel painelDesenho = new JPanel();

}
