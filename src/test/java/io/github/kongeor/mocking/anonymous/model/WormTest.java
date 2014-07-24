package io.github.kongeor.mocking.anonymous.model;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class WormTest {

	@Test
	public void alive_worms_are_not_heroes() {
		assertThat(new Worm("", 10, 100, true).isHero()).isFalse();
	}
	
	@Test 
	public void not_enough_kills_or_xp_do_not_make_a_hero() {
		assertThat(new Worm("", 9, 900, false).isHero()).isFalse();
	}

	@Test 
	public void enough_kills_make_a_hero() {
		assertThat(new Worm("", 10, 900, false).isHero()).isTrue();
	}

	@Test 
	public void enough_xp_make_a_hero() {
		assertThat(new Worm("", 9, 1010, false).isHero()).isTrue();
	}
}
