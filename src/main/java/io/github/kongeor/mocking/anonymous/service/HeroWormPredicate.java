package io.github.kongeor.mocking.anonymous.service;

import io.github.kongeor.mocking.anonymous.filter.HeroWormFilter;
import io.github.kongeor.mocking.anonymous.model.Worm;
import io.github.kongeor.mocking.anonymous.util.Predicate;

public class HeroWormPredicate implements Predicate<Worm> {

	private final RemoteService remoteService;
	
	public HeroWormPredicate(RemoteService remoteService) {
		this.remoteService = remoteService;
	}
	
	@Override
	public boolean test(Worm worm) {
		return new HeroWormFilter(worm, remoteService).isHero();
	}
}
