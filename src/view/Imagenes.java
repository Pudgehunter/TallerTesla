package view;

import controller.ControlAll;
import model.Logica;
import processing.core.PApplet;
import processing.core.PImage;

public class Imagenes {

	PApplet app;
	private static Imagenes image;
	ControlAll controlpantalla;
	PImage[] img = new PImage[6];
	private int pantalla;

	private Imagenes(PApplet app) {
	this.app = app;	
	
	img = new PImage[]{app.loadImage("Imagenes/1.jpg"),
			app.loadImage("Imagenes/2.jpg"),
			app.loadImage("Imagenes/3.jpg"),
			app.loadImage("Imagenes/4.jpg"),
			app.loadImage("Imagenes/5.jpg"),
			app.loadImage("Imagenes/6.jpg"),
			app.loadImage("Imagenes/7.jpg")};
	}
	
	public static Imagenes getInstanceImagenes(PApplet app) {
		if(image == null) {
			image = new Imagenes(app);
		}
		return image;
	}

	public void loadImageMenu() {
		app.image(img[0],0,0,395,700);
	}
	public void loadImageLogIn() {
		app.image(img[1],0,0,395,700);
	}
	public void loadImageStart() {
		app.image(img[2],0,0,395,700);
	}
	public void loadImageCarOne() {
		app.image(img[3],0,0,395,700);
	}
	public void loadImageCarCompared() {
		app.image(img[4],0,0,395,700);
	}
	public void loadImageCarBuying() {
		app.image(img[5],0,0,395,700);
	}
	public void loadImageExit() {
		app.image(img[6],0,0,395,700);
	}
			
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public static Imagenes getImage() {
		return image;
	}

	public static void setImage(Imagenes image) {
		Imagenes.image = image;
	}

	public PImage[] getImg() {
		return img;
	}

	public void setImg(PImage[] img) {
		this.img = img;
	}
	
}
	


