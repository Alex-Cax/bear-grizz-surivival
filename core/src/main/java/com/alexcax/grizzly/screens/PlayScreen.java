package com.alexcax.grizzly.screens;

import  com.alexcax.grizzly.entities.Player;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class PlayScreen implements Screen {

    private  Player grizzly;
     private ShapeRenderer shapeRenderer;
    @Override
    public void show() {
        grizzly = new Player(Gdx.graphics.getWidth()/2f, Gdx.graphics.getHeight()/2f);
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void render(float delta) {
        float dx = 0f;
        float dy = 0f;

        if (Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP)) {
            dy = 1f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)  || Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            dy = -1f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            dx = 1f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT) ) {
            dx = -1f;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
        grizzly.move(dx, dy, delta);


        Gdx.gl.glClearColor(0.1f, 0.2f, 0.1f,  0.1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
       shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
       shapeRenderer.setColor(0.545f, 0.270f, 0.074f, 1f);
       shapeRenderer.rect(grizzly.getX(), grizzly.getY(), grizzly.getSize(), grizzly.getSize());
       shapeRenderer.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}
