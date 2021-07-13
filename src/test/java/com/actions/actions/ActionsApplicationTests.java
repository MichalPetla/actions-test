package com.actions.actions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActionsApplicationTests {

	@Test
	void contextLoads() {
		String abc = "abc";

		Assertions.assertEquals("abc", abc);
	}

}
