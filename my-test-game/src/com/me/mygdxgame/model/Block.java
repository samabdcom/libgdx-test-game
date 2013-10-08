package com.me.mygdxgame.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {
	
	public static final float SIZE = 1f;
	
	Vector2		position = new Vector2();
	Rectangle	bounds = new Rectangle();
	
	public Block(Vector2 pos) {
		this.bounds.x = pos.x;
		this.bounds.y = pos.y;
		this.position = pos;
		this.bounds.width = SIZE;
		this.bounds.height = SIZE;
	}
	
	public Vector2 getPosition() {
		return position;
	}
	
	public Rectangle getBounds() {
		return bounds;
	}
}