package io.github.kongeor.mocking.anonymous.filter;

import io.github.kongeor.mocking.anonymous.model.Worm;
import io.github.kongeor.mocking.anonymous.service.RemoteService;

public class HeroWormFilter {

	private Worm worm;
	private RemoteService service;

	public HeroWormFilter(Worm worm, RemoteService service) {
		this.worm = worm;
		this.service = service;
	}
	
	public boolean isHero() {
		return service.isHero(worm) || worm.isHero();
	}
	
}
