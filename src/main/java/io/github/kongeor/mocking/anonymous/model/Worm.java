package io.github.kongeor.mocking.anonymous.model;

public class Worm {

	private String name;
	private int kills;
	private int xp;
	private boolean alive;

	public Worm(String name, int kills, int xp, boolean alive) {
		this.name = name;
		this.kills = kills;
		this.xp = xp;
		this.alive = alive;
	}

	public String getName() {
		return name;
	}
	
	public boolean isHero() {
		return !alive &&
				(kills >= 10 ||
				xp > 1000);
	}

	@Override
	public String toString() {
		return name + "(" + (alive ? "\u263A" : "\u271D") + ")" + 
				" [" + xp + "] {" + kills + "\u2620}";
	}
}
