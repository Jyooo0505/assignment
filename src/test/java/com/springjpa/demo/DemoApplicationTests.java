package com.springjpa.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.springjpa.demo.modal.Cases;
import com.springjpa.demo.repository.CasesRepo;

@SpringBootTest
class CaseApplicationTests {

	@Autowired
	private CasesRepo casesRepo;
	
	@Test
	public void testSave()
	{
		Cases c=new Cases();
		c.setId(10);
		c.setCase_number("ABCDEFG");
		c.setCreated_at(new Date());
		casesRepo.save(c);
		
		assertEquals(c,casesRepo.findById(c.getId()));
	}

}
