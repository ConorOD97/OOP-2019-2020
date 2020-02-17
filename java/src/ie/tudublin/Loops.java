package ie.tudublin;

import processing.core.PApplet;


public class Loops extends PApplet
{
	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB,100);
		
	}
	
	public void Rectangle(float x, float y, float width, float height){
			for (int i=0;i<10;i++){
				noStroke();
				fill(i,10,10);
				rect(x,y,width,height);
				x+=width;
			}
		}

	public void Star(float X, float Y, float XX, float YY){
		int i = 0;
		int gap = 10;
		int numLines =width/gap + 1;
		
		while (i < numLines){
			line(X , Y, XX, YY);
			line(0 , X, width, XX);
			
			XX-=gap;	
			X += gap;
			i++;
		}

	}

	public void RowofCircles(float CX, float CY, float W, float H){
		int numCircles = 10;
		for (int i = 0; i < numCircles; i++){
			ellipse(CX,CY,W, H);
			CX += W;
		}
			
	}

	public void NestCircle(float CX,float CY,float W,float H){
		for (int i= 25; i < height; i+=50){
			for (int j = 25; j <width; j+=50){
				fill(i,j,j);
				ellipse(i,j,W, H);
			}
		}
	}

	public void draw()
	{	
		float X1 = 0;
		float Y1 = 0;
		float X2 = width;
		float Y2 = height;

		float W =50;
		float H = 50;
		float CX = W/2;
		float CY = height/2;

		background(8);		
		stroke(0);
		//Star(X1,Y1,X2,Y2);
		//fill(200);
		//RowofCircles(CX, CY, W, H);
		//Rectangle(X1,Y1,X2*.1f,Y2);
		NestCircle(CX, CY, W, H);
		// line(10, 10, 100, 10);
		// line(10, 20, 100, 20);
		// line(10, 30, 100, 30);
		// line(10, 40, 100, 40);

		// for(int y = 10 ; y <= 40 ; y += 10)
		// {
		// 	line(200, y, 300, y);
		// }

		// int yy = 10;
		// while(yy <= 40)
		// {
		// 	line(300, yy, 400, yy);
		// 	yy += 10;
		// }
	
	}
}
