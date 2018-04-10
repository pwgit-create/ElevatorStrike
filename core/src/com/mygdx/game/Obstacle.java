package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by woojen on 2016-10-05.
 */

public class Obstacle extends Sprite {

    Sprite sprite;

    public Obstacle(String textureFileName, float x, float y, int width, int height) {
        sprite = new Sprite(new Texture(textureFileName));
        sprite.setSize(width, height);
        sprite.setX(x);
        sprite.setY(y);
    }

    public Rectangle getCollisionRectangle() {
        return new Rectangle(
                sprite.getX(),
                sprite.getY(),
                sprite.getWidth(),
                sprite.getHeight());
    }

    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }


}
