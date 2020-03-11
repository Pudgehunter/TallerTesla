package view;

import processing.core.PApplet;
import controlP5.*;
import controller.ControlAll;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	ControlAll controlar;
	public int pantalla;
	
	public void settings() {
		size(395,700);
	}
	
	public void setup() {
		controlar = ControlAll.getInstanceControllAll(this);
	}
	
	public void draw() {
		System.out.println(mouseX);
		System.out.println(mouseY);
		controlar.controlEjecutar();
	}
	
	public void mouseClicked() {
		controlar.mouseClick();
	}
	
}
	
