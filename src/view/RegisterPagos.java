package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;

public class RegisterPagos {
	private ControlP5 cp5;
	private static RegisterPagos registerPagos = null;
	PApplet app;
	String textName = "";
	
	private RegisterPagos(PApplet app) {
		this.app = app;
		this.cp5 = new ControlP5(app);
		
		cp5.addTextfield("Nombre")
	     .setPosition(174,166)
	     .setSize(155,25)
	     .setAutoClear(false)
	     .setColor(app.color(255))
	     ;
		app.fill(255);
		app.text(cp5.get(Textfield.class,"Nombre").getText(), 360,130);
		app.text(textName, 360,180);
		
		cp5.addTextfield("Numero de Tarjeta")
		 .setPosition(174,197)
		 .setSize(155,25)
		 .setAutoClear(false)
		 .setColor(app.color(255))
		     ;
		app.fill(255);
		app.text(cp5.get(Textfield.class,"Numero de Tarjeta").getText(), 360,130);
		app.text(textName, 360,180);
		
		  cp5.addTextfield("Mes")
		 .setPosition(175,227)
		 .setSize(49,25)
		 .setAutoClear(false)
		 .setColor(app.color(255))
		     ;
			app.fill(255);
			  app.text(cp5.get(Textfield.class,"Mes").getText(), 360,130);
			  app.text(textName, 360,180);
				  
		  cp5.addTextfield("Año")
		  .setPosition(244,227)
		  .setSize(82,25)
		  .setAutoClear(false)
		  .setColor(app.color(255))
			     ;
			app.fill(255);
		 app.text(cp5.get(Textfield.class,"Año").getText(), 360,130);
	  app.text(textName, 360,180);
					  
		  cp5.addTextfield("CSV")
		    .setPosition(174,257)
		    .setSize(50,25)
		    .setAutoClear(false)
		    .setColor(app.color(255))
			     ;
						app.fill(255);
						  app.text(cp5.get(Textfield.class,"CSV").getText(), 360,130);
						  app.text(textName, 360,180);

		}
	public static RegisterPagos getInstanceRegisterUsuario(PApplet app) {
		if(registerPagos == null) {
			registerPagos = new RegisterPagos(app);
		}
		return registerPagos;
	}
	
	public void RegisterClose() {
		cp5.hide();
	}
	public void RegisterOpen() {
		cp5.show();
	}
	
}