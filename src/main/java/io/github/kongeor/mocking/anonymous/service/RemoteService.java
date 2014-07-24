package io.github.kongeor.mocking.anonymous.service;

import io.github.kongeor.mocking.anonymous.model.Worm;

public class RemoteService {

	public boolean isHero(Worm worm) {
		throw new IllegalStateException("Boom!");
	}
}
