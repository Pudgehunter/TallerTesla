package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;

public class RegisterUsuario {
	private ControlP5 cp5;
	private static RegisterUsuario rname = null;
	PApplet app;
	String textName = "";
	
	private RegisterUsuario(PApplet app) {
		this.app = app;
		this.cp5 = new ControlP5(app);
		
		cp5.addTextfield("Username")
	     .setPosition(45,430)
	     .setSize(290,40)
	     .setAutoClear(false)
	     .setColor(app.color(255))
	     ;
		app.fill(255);
		  app.text(cp5.get(Textfield.class,"Username").getText(), 360,130);
		  app.text(textName, 360,180);
		  
			cp5.addTextfield("Password")
		     .setPosition(45,500)
		     .setSize(290,40)
		     .setAutoClear(false)
		     .setColor(app.color(255))
		     ;
			app.fill(255);
			  app.text(cp5.get(Textfield.class,"Password").getText(), 360,130);
			  app.text(textName, 360,180);
		}
	public static RegisterUsuario getInstanceRegisterUsuario(PApplet app) {
		if(rname == null) {
			rname = new RegisterUsuario(app);
		}
		return rname;
	}
	
	public void RegisterClose() {
		cp5.hide();
	}
	public void RegisterOpen() {
		cp5.show();
	}
	public boolean UsuarioExistente() {
//		if(textName != "") {
//			return true;
//		}
//		return false;
		return true;
	}
	
}