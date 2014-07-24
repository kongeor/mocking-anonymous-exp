package io.github.kongeor.mocking.anonymous.service;

import io.github.kongeor.mocking.anonymous.filter.HeroWormFilter;
import io.github.kongeor.mocking.anonymous.model.Worm;
import io.github.kongeor.mocking.anonymous.util.ListUtil;
import io.github.kongeor.mocking.anonymous.util.Predicate;

import java.util.List;

public class WormService {

	private List<Worm> worms;

	public WormService(List<Worm> worms) {
		this.worms = worms;
	}
	
	public List<Worm> getHeroes() {
		return ListUtil.filter(worms, new Predicate<Worm>() {
			public boolean test(Worm worm) {
				return new HeroWormFilter(worm, new RemoteService()).isHero();
			};
		});
	}
}
