package com.me.mygdxgame;

import com.me.mygdxgame.screens.GameScreen;

import com.badlogic.gdx.Game;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}

}