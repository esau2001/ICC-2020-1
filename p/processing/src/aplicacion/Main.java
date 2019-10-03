package aplicacion;

import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Main.class.getName());
    }

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        if (mousePressed) {
            fill(255);
        } else {
            fill(0);
        }
        ellipse(mouseX, mouseY, 80, 80);
    }

}