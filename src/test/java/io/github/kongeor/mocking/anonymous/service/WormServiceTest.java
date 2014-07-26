package io.github.kongeor.mocking.anonymous.service;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;
import io.github.kongeor.mocking.anonymous.filter.HeroWormFilter;
import io.github.kongeor.mocking.anonymous.model.Worm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames="io.github.kongeor.mocking.anonymous.service.WormService$1")
public class WormServiceTest {

	private List<Worm> worms;
	private @Mock Worm worm;
	private @Mock RemoteService remoteService;
	private @Mock HeroWormFilter heroWormFilter;
	
	private WormService wormService;

	@Before
	public void setUp() throws Exception {
		worms = new ArrayList<>();
		worms.add(worm);
		
		whenNew(HeroWormFilter.class).withArguments(worm, remoteService)
				.thenReturn(heroWormFilter);

		wormService = new WormService(worms, remoteService);
	}
	
	@Test
	public void testGetHeroes() {
		when(heroWormFilter.isHero()).thenReturn(true);
		assertThat(wormService.getHeroes()).containsExactly(worm);
	}

}
