package com.wdfall.vslot_new.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-root-context.xml" })
@Slf4j
public class SpringTest {
	
	@Autowired
	TestObj message;
	
	@Test
	public void testMessage() {
		message.sayHello("gogo"); 
	}
	
}
