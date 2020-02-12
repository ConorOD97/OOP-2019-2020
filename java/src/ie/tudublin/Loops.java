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
		colorMode(HSB);
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	

	public void Star(float X, float Y, float XX, float YY){
		int i;
		int loop =51;
		
			for (i = 0;i<loop;i++){
				line(X+=10 , Y, XX, YY);
			}

			X = 0;
			for (i = 0;i<loop;i++){
				line(X , Y+=10, XX, YY);
			}

			for (i = 0;i<loop;i++){
				line(X+=10 , Y, XX, YY);
			}

			for (i = 0;i<loop;i++){
				line(X , Y-=10, XX, YY);
			}

	}

	public void RowofCircles(float CX, float CY, float W, float H){
		for (int i = 0;i<=10;i++){
			ellipse(CX,CY,W, H);
		}
			
	}

	public void draw()
	{	
		
		float X = -10;
		float Y = 0;
		float XX = width/2;
		float YY = height/2;

		float W =50;
		float H = 50;
		float CX = W/2;
		float CY = height/2;

		background(210);		
		stroke(0);
		Star(X,Y,XX,YY);
		//RowofCircles(CX, CY, W, H);
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
