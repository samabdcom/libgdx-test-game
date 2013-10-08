package com.me.mygdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Main {
	public static void main(String[] args) {
		new LwjglApplication(new MyGdxGame(), "My Gdx Game", 720, 480, true);
	}
}
