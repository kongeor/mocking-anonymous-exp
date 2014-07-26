package io.github.kongeor.mocking.anonymous.service;

import io.github.kongeor.mocking.anonymous.model.Worm;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RemoteServiceTest {

	private RemoteService service;
	private @Mock Worm worm;

	@Before
	public void setUp() {
		service = new RemoteService();
	}
	
	@Test(expected = IllegalStateException.class)
	public void testIsHero() {
		service.isHero(worm);
	}

}
