package com.alexcax.grizzly.entities;

public class Player {

    private  static  final  float BASE_SPEED = 200F;
    private static final float SIZE = 32f;
    private float x ,  y ,  speed;

    //El constructor solo recibe x e y  son la pocision del oso  o  mas bien el jugador =D
    public  Player(float x, float y) {
        this.x = x;
        this.y = y;
        this.speed = BASE_SPEED;
    }

    // dx, dy: dirección (-1, 0, 1). delta: tiempo desde el último frame. cualquiere lrelacion con una derivada es pura coinciencia  necesitamos esto para renderizar en pantalla elmovimiento
    public void move(float dx, float dy, float delta) {
        x += dx * speed * delta;
        y += dy *speed  * delta;
    }


    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getSize() {
       return SIZE;
    }
}
