package io.github.kongeor.mocking.anonymous.util;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListUtilTest {

    private List<String> list;
    
    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("Arnold");
        list.add("Chuck");
        list.add("John");
        list.add("Steven");
        list.add("Jason");
    }

    @Test
    public void testFilter() {
       assertThat(ListUtil.filter(list, new Predicate<String>() {
           public boolean test(String s) {
               return s.startsWith("J");
           }
       })).containsExactly("John", "Jason");
    }

}
