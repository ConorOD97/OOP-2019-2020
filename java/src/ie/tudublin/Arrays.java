package ie.tudublin;

// Hello from Jacob

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	// int[] xcoords = {20,40,60,80,140,160,180,200,220,240};
	// int[] ycoords = {345,360,315,390,330,240,330,135,390,150,300};
	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);
	}

	void drawLineGraph(){
		// int x = xcoords[0];
		// int y = ycoords[0];
		// int xx = xcoords[1];
		// int yy = xcoords[1];

		// for (int i=0;i<xcoords.length;i++){
			
			
		// 	stroke(255);
		// 	line(x, y, xx, yy);

		// 	x = xcoords[i];
		// 	y = ycoords[i];
		// 	xx = xcoords[i];
		// 	yy = ycoords[i];
		// }

		line(x,y,x1,y1);
	}
	void drawBarChart()
	{
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	void test()
	{
		
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
		//drawBarChart();
		drawLineGraph();
	}
}
