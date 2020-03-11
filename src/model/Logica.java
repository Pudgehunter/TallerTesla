package model;

import java.util.ArrayList;

import controller.ControlAll;
import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	
	PApplet app;
	ControlAll control;
	private static Logica logica;
	private int pantalla;
	private boolean clienteReal;
	
	private Logica(PApplet app, ControlAll control) {
		this.app = app;
		this.control = control;
		pantalla = 0;
		clienteReal = false;
	}
	
	public static Logica getInstanceLogica(PApplet app, ControlAll control) {
		if(logica == null) {
			logica = new Logica(app, control);
		}
		return logica;
	}
	
	
	public void LogicaEjecutar() {
		switch(pantalla) {
		case 0:
			control.controlMenu();
			control.controlCpClose();
			control.controlCpClosePagos();
			break;
		case 1:
			control.controlLogIn();
			control.controlClienteReal();
			if(control.controlClienteReal() == true) {
				clienteReal = true;
			}
			break;
		case 2:
			control.controlStart();
			control.controlCpClose();
			control.controlCpClosePagos();
			break;
		case 3:
			control.controlCarOne();
			break;
		case 4:
			control.controlCarCompared();
			break;
		case 5:
			control.controlCarBuying();
			break;
		case 6:
			control.controlExit();
			control.controlCpClose();
			control.controlCpClosePagos();
			break;
		default:
			break;
		}
		
	}
	public void pantallaClicked() {
		switch(pantalla) {
		case 0:
			if(app.mouseX > 149 && app.mouseX < 246 && app.mouseY > 589 && app.mouseY < 625) {
			pantalla = 1;
			control.controlCpOpen();
			}
			break;
		case 1:
			if(app.mouseX > 149 && app.mouseX < 246 && app.mouseY > 589 && app.mouseY < 625) {
				if(clienteReal == true) {
				pantalla = 2;
				control.controlCpClose();
				}
				}
			break;
		case 2:
			if(app.mouseX > 26 && app.mouseX < 367 && app.mouseY > 161 && app.mouseY < 358) {
				pantalla = 3;
				}
			break;
		case 3:
			if(app.mouseX > 158 && app.mouseX < 233 && app.mouseY > 638 && app.mouseY < 651) {
				pantalla = 4;
				}
			break;
		case 4:
			if(app.mouseX > 164 && app.mouseX < 228 && app.mouseY > 637 && app.mouseY < 647) {
				pantalla = 5;
				control.controlCpOpenPagos();
				}
			break;
		case 5:
			if(app.mouseX > 172 && app.mouseX < 341 && app.mouseY > 366 && app.mouseY < 395) {
				pantalla = 6;
				}
			break;
		case 6:
			pantalla = 2;
			break;
		default:
			break;
		}
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}


	
}
