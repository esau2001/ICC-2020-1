package practica10; 

import processing.core.PApplet;

public class A extends PApplet{
	 
	 public static void main(String[] args){

	     main("practica10.A");

	 }

	 	@Override
	 	public void settings(){
	 	      size(800,800);
	 	}
        
        @Override 
        public void setup(){

        }

        /*@Override
        public void draw(){

        fill(0xFF000000);
        rect(0,0,200,0);
        fill(0xFF000000);
        rect(100,100,100,100); //ARGB A=transparencia R=red G=green B=blue FF
        }
*/
        @Override
        public void draw(){
        	for (int i = 0; i < 8; i ++){
        		if (i%2==0){
        			fill (0xFF000000);
        		}else{ fill (0xFFFFFFFF);
        			
        		}
        		rect (i * 100, 100, 100, 100);
        		}
}
}
        		
        	
        

