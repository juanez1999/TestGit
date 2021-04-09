import processing.core.PApplet;

public class Principal extends PApplet{


	
	public static void main(String[] args) {
		PApplet.main("Principal");
	}
	
		
	@Override
	public void settings() {
		size(580,580);
	}
	
	int bolitas = 3;
	//float angulo = 0;
	int[] velocidades;
	float[] angulos;
	int[] colores;
	
	int colorL = color (random (255), random(255), random (255));
	
	int [] x = new int [bolitas];
	int [] y = new int [bolitas];
	
	@Override
	public void setup() {
		println("holis");

		
		x[0] = 100; 
		y[0] = 100; 

		velocidades = new int[bolitas];
		angulos = new float[bolitas];
		colores = new int[bolitas];
		
		for (int i = 0; i < bolitas; i++) {
			velocidades[i] = (int) random(20,40);
			angulos[i] = random(0,5);
			colores[i] = color(random(255),random(255),random(255));
		}

	}
	
	@Override
	public void draw() {
		background(255);
		
		strokeWeight(2);
		
		int posX = 100;
		int posY = 100;
	
		int x1 = 60;
		int y1 = 0;
		
		for (int i = 0; i < bolitas; i++) {
				angulos[i] += PI/velocidades[i];
				fill(colores[i]);
				moons(posX, posY, x1, y1,angulos[i]);
				posX+=150;
			}
		

	}

	
	public void moons (int x, int y, int x1, int y1, float angulo) {
		ellipse(x,y,50,50);
		
		pushMatrix();
		translate(x,y);
		rotate(angulo);
		ellipse(x1,y1,20,20);
		popMatrix();
	}
	
}
	