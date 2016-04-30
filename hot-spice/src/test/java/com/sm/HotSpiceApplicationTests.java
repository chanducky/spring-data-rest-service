package com.sm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HotSpiceApplication.class)
@WebAppConfiguration
public class HotSpiceApplicationTests {

	@Test
	public void contextLoads() {
/*
		String ownerUrl = "http://localhost:9000/owners/1";
		ParameterizedTypeReference<Resource<Owner>> responseType = new ParameterizedTypeReference<Resource<Owner>>() {};

		ResponseEntity<Resource<Owner>> responseEntity =

				restTemplate.exchange(ownerUrl, GET, null, responseType);

		Owner owner = responseEntity.getBody().getContent();

		assertEquals("George", owner.getFirstName());
*/	}

}
