package com.practice.vaadin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prudent.crm.PrudentCRMApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PrudentCRMApplication.class)
@WebAppConfiguration
public class PrudentCRMApplicationTests {

	@Test
	public void contextLoads() {
	}

}
