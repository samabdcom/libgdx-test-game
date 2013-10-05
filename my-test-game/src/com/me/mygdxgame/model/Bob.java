package com.me.mygdxgame.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bob {
	
	public enum State {
		IDLE, WALKING, JUMPING, DYING
	}
	
	public static final float SPEED = 4f; // unit per second
	public static final float JUMP_VELOCITY = 1f;
	public static final float SIZE = 0.5f; // half a unit
	
	Vector2 	position = new Vector2();
	Vector2 	acceleration = new Vector2(); // when jump
	Vector2 	velocity = new Vector2(); // speed
	Rectangle 	bounds = new Rectangle();
	State		state = State.IDLE;
	boolean 	facingLeft = true;
	
	public Bob(Vector2 position) {
		this.position = position;
		this.bounds.height = SIZE;
		this.bounds.width = SIZE;
	}
	
	public Rectangle getBounds() {
		return bounds;
	}
	
	public Vector2 getPosition() {
		return position;
	}
	
	public void setState(State newState) {
		this.state = newState;
	}
	
	public void update(float delta) {
		position.add(velocity.cpy().mul(delta));
	}
	
	public void setFacingLeft(boolean facingLeft) {
		this.facingLeft = facingLeft;
	}
	
	public Vector2 getAcceleration() {
		return acceleration;
	}
	
	public Vector2 getVelocity() {
		return velocity;
	}	
}