package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	

	//float[] rainfall = new float[12];
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
	String month = months[0];
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		// for(int i=0;i<rainfall.length;i++){
		// 	System.out.println(rainfall[i]);
		// }

		// for (float f:rainfall){
		// 	System.out.println(f);
		// }

		// for (String s:months){
		// 	System.out.println(s);
		//}
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void largest(){
		float max = rainfall[0];

		for (int i=0;i<rainfall.length;i++){
			if (rainfall[i] > max){
				max = rainfall[i];
				month = months[i];
			}
		}
		System.out.println(month + ":\t" + max);
	}

	public void smallest(){
		float min = rainfall[0];
		
		for (int i=0;i<rainfall.length;i++){
			if (rainfall[i] < min){
				min = rainfall[i];
				month = months[i];
			}
		}
		System.out.println(month + ":\t" + min);
	}

	public void BarChart(){

		float h = rainfall[0];
		int x =0;
		int c =0;
		int barWidth = 30;
		for (int i=0;i<rainfall.length;i++){
			colorMode(HSB);
			fill(c,255,255);
			rect(x,height,barWidth,-h);

			c += (i*8);
			h = (rainfall[i])*4;
			x+=50;
		}
	}


	public void draw()
	{	
		background(0);		
		colorMode(HSB);
		BarChart();	
	}
}
