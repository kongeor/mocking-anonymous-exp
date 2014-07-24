package io.github.kongeor.mocking.anonymous.filter;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import io.github.kongeor.mocking.anonymous.model.Worm;
import io.github.kongeor.mocking.anonymous.service.RemoteService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HeroWormFilterTest {

	
	private @Mock Worm worm;
	private @Mock RemoteService service;
	
	private HeroWormFilter filter;
	
	@Before
	public void setUp() {
		filter = new HeroWormFilter(worm, service);
	}

	@Test
	public void is_hero_if_service_says_so() {
		when(service.isHero(worm)).thenReturn(true);
		assertThat(filter.isHero()).isTrue();
	}

	@Test
	public void is_hero_if_worm_says_so() {
		when(worm.isHero()).thenReturn(true);
		assertThat(filter.isHero()).isTrue();
	}
	
	@Test
	public void is_not_hero_is_service_and_worm_say_no() {
		assertThat(filter.isHero()).isFalse();
	}

}
