package io.github.kongeor.mocking.anonymous.service;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.when;
import io.github.kongeor.mocking.anonymous.model.Worm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WormServiceTest {

	private List<Worm> worms;
	private @Mock Worm worm;
	private @Mock RemoteService remoteService;
	private @Mock HeroWormPredicate wormHeroFilter;
	
	private WormService wormService;

	@Before
	public void setUp() throws Exception {
		worms = new ArrayList<>();
		worms.add(worm);
		
		wormService = new WormService(worms, wormHeroFilter);
	}
	
	@Test
	public void testGetHeroes() {
		when(wormHeroFilter.test(worm)).thenReturn(true);
		assertThat(wormService.getHeroes()).containsExactly(worm);
	}

}
