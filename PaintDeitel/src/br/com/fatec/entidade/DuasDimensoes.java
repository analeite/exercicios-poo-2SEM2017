package br.com.fatec.entidade;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JPanel;

//Classe que será base para outras classes

public class DuasDimensoes extends JPanel{
	protected Point inicio;
	protected Point fim;
	protected int altura;
	protected int largura;
	protected boolean preenchido;
	protected Color cor;
	
	public Point getInicio(){
		return inicio;
	}
	public void setInicio(Point inicio){
		this.inicio = inicio;
	}
	
	public Point getFim(){
		return fim;
	}
	
	public void setFIM (Point fim){
		this.fim = fim;
	}
	
	public int getAltura(){
		return altura;
	}
	public void setAltura (int altura){
		this.altura = altura;
	}
	
	public int getLargura(){
		return largura;
	}
	
	public void setLargura(int largura){
		this.largura = largura;
	}
	
	public boolean getPreenchido(){
		return preenchido;
	}
	
	public void setPreenchido (boolean preenchido){
		this.preenchido = preenchido;
	}
	
	public Color getCor(){
		return cor;
	}
	
	public void setCor(Color cor){
		this.cor = cor;
	}
	
	public DuasDimensoes(Point inicio, Point fim, int altura, int largura, boolean preenchido, Color cor){
		this();
		this.inicio = inicio;
		this.fim = fim;
		this.altura = altura;
		this.largura = largura;
		this.preenchido = preenchido;
		this.cor = cor;
	}
	
	public DuasDimensoes(){
		super();
		setOpaque(false);
	}
	

	
	

}
