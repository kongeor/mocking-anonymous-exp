package io.github.kongeor.mocking.anonymous.service;

import io.github.kongeor.mocking.anonymous.model.Worm;
import io.github.kongeor.mocking.anonymous.util.ListUtil;

import java.util.List;

public class WormService {

	private final List<Worm> worms;
	private HeroWormPredicate heroWormPredicate;

	public WormService(List<Worm> worms, HeroWormPredicate heroWormPredicate) {
		this.worms = worms;
		this.heroWormPredicate = heroWormPredicate;
	}
	
	public List<Worm> getHeroes() {
		return ListUtil.filter(worms, heroWormPredicate);
	}
}
