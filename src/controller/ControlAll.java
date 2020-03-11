package controller;

import view.Imagenes;
import view.RegisterPagos;
import model.Logica;
import view.RegisterUsuario;
import processing.core.PApplet;

public class ControlAll {
	PApplet app;
	Logica logica;
	Imagenes imagenes;
	RegisterUsuario registrar;
	RegisterPagos registrarPagos;
	private static ControlAll control;
	
	private ControlAll(PApplet app) {
		this.app = app;
		imagenes = Imagenes.getInstanceImagenes(app);
		logica = Logica.getInstanceLogica(app, this);
		registrar = RegisterUsuario.getInstanceRegisterUsuario(app);
		registrarPagos = RegisterPagos.getInstanceRegisterUsuario(app);
	}
	public static ControlAll getInstanceControllAll(PApplet app){
		if(control == null) {
			control = new ControlAll(app);
		}
		return control;
	}
	public void controlEjecutar() {
		logica.LogicaEjecutar();
	}
	public void mouseClick() {
		// TODO Auto-generated method stub
		logica.pantallaClicked();
	}
	
	public void controlMenu() {
		imagenes.loadImageMenu();
	}
	public void controlLogIn() {
		imagenes.loadImageLogIn();
	}
	public void controlStart() {
		imagenes.loadImageStart();
	}
	public void controlCarOne() {
		imagenes.loadImageCarOne();
	}
	public void controlCarCompared() {
		imagenes.loadImageCarCompared();
	}
	public void controlCarBuying() {
		imagenes.loadImageCarBuying();
	}
	public void controlExit() {
		imagenes.loadImageExit();
	}

	
	public void controlCpOpen() {
		registrar.RegisterOpen();
	}
	public void controlCpClose() {
		registrar.RegisterClose();
	}
	public boolean controlClienteReal() {
		if(registrar.UsuarioExistente() == true) {
			return true;
		}
		return false;
	}
	public void controlCpOpenPagos() {
		registrarPagos.RegisterOpen();
	}
	public void controlCpClosePagos() {
		registrarPagos.RegisterClose();
	}

	

}
