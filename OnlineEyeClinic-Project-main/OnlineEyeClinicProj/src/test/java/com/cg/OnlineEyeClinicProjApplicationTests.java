package com.cg;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dao.ITestRepo;


@SpringBootTest
class OnlineEyeClinicProjApplicationTests {

	
		@Autowired
		 ITestRepo repotest;
			@Test
		public	void testId() {
				int id=1;
				assertNotNull(repotest.findById(id).get());
			}
			@Test
			public void testGet() {
				assertNotNull(repotest.findAll());
			}
}