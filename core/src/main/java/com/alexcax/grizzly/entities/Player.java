package com.alexcax.grizzly.entities;

import com.badlogic.gdx.Gdx;

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

        // - SIZE  para obtener valores de maximos reales
        float maxY = Gdx.graphics.getHeight() - SIZE;
        float maxX = Gdx.graphics.getWidth() - SIZE;

        x += dx * speed * delta;
        y += dy * speed * delta;

        //toda lla logica de limitar esta aca, pilas si hay Math de por medio hay logica matematica. no dire nada mas!! (geraquia de operaciones)
        // notar para alexander  en eta logicas nunca implementes if para validar, (ya aprendimos porque jajaja)
        x = Math.max(0f, Math.min(x, maxX));
        y = Math.max(0f, Math.min(y, maxY));

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
