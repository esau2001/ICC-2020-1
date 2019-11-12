/*
*@author Martinez Pardo Esaú
*@version 29/10/19
*/


package app; 

import processing.core.PApplet;
import processing.core.PImage;
import java.util.HashMap;
import ajedrez.Tablero;
import ajedrez.piezas.Color;
import ajedrez.piezas.Pieza; 
import ajedrez.piezas.Peon;
import ajedrez.piezas.Dama; 

public class Main extends PApplet{
	private Tablero tablero; 
	private HashMap<String, PImage> imagenes;
	 
	 public static void main(String[] args){

	     main("app.Main");

	 }

	 	@Override
	 	public void settings(){
	 	      size(displayHeight * 4 / 5, displayHeight * 4 / 5);
	 	}
        
        @Override 
        public void setup(){
        	tablero = Tablero.obtenerInstancia();
        	imagenes = new HashMap<>();
        	imagenes.put("PeonBLANCO", 
        		         loadImage(getClass().getResource("/w-pawn.png").getPath()));
        	imagenes.put("PeonNEGRO", 
        		         loadImage(getClass().getResource("/b-pawn.png").getPath()));
        	imagenes.put("DamaBLANCO", 
        		         loadImage(getClass().getResource("/w-queen.png").getPath()));
        	imagenes.put("DamaNEGRO", 
        		         loadImage(getClass().getResource("/b-queen.png").getPath()));
        	noLoop(); 


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
        	//for (int i = 0; i < 800/8; i ++){
        		//for (int a = 0; a<800/8; a++){
        			///if ((a%2 != 0 && i%2 != 0) || (a%2==0 && i%2 == 0)){
        			//fill (0xFFFFFF);
        		//}else{ 
        			//fill (0x000000);
        			
        		//}
        		//rect (a * (800/8), i * (800/8), (800/8), (800/8));

        		for (int i = 0; i<8; i++){
        		   for (int j=0; j<8;j++){
        		      if ((i+j)%2==0){
        		          fill(0xFFFFFFFF);

        		}else{
        		fill(0X44000000);
        	}
        	rect(j*(height/8), i * (height/8),
        	    height / 8, height /8);

        		Pieza pieza = tablero.obtenerPieza(i, j);
        		if (pieza != null){
        			image(imagenes.get(pieza.getClass().getSimpleName()
        				  + pieza.obtenerColor()), 
        			j * (height / 8),i*(height / 8), height/8,height/8);

        		}

        	}

        }

    }

}







        		
        		
        	
        

