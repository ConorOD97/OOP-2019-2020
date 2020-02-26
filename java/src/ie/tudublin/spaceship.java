package ie.tudublin;

import processing.core.PApplet;

public class spaceship extends PApplet{
    
        float x = 50;
        float cx[] = {x,x*2,x*3,x*4,x*5,x*6,x*7,x*8,x*9}; 

        public void settings(){
            size(500,500);
        }

        public void setup(){
            colorMode(HSB);
        }

        public void Enemies(){

            float cy = height/2;

            for (int i =0; i < cx.length;i++){
                noStroke();
                fill(map(i,0,cx.length,0,255),255,255);
                circle(cx[i],cy,100);
            }
        }

        public void draw(){
            background(0);
            stroke(255);
            Enemies();
        }
        
}
