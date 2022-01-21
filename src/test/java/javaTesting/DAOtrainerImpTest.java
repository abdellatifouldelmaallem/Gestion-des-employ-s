package javaTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import daoTrainer.DAOtrainer;
import daoTrainer.DAOtrainerImp;
import junit.framework.Assert;
import model.Trainer;

class DAOtrainerImpTest {

	@Test
	void testSaveTrainer() {
		DAOtrainer trainerDAO = new DAOtrainerImp();
		Trainer oneTrainer = new Trainer("mohamed","baqal","mohamed@gmail.com",111333);
		trainerDAO.saveTrainer(oneTrainer);
		
		assertEquals("mohamed",oneTrainer.getFname());
	}

	@Test
	void testUpdateTrainer() {
		DAOtrainer trainerDAO = new DAOtrainerImp();
		Trainer oneTrainer = new Trainer(2,"mohamed","baqal","mohamed@gmail.com",111333);
		trainerDAO.updateTrainer(oneTrainer);
		
		assertEquals("mohamed",oneTrainer.getFname());
	}

	@SuppressWarnings("deprecation")
	@Test
	void testDeleteTrainer() {
		DAOtrainer trainerDAO = new DAOtrainerImp();
		trainerDAO.deleteTrainer((long) 5);
		 Assert.assertNull(trainerDAO.getTrainer((long) 5));
	}

	@Test
	void testGetTrainer() {
		DAOtrainer trainerDAO = new DAOtrainerImp();
		Trainer oneTrainer = new Trainer();
		oneTrainer = trainerDAO.getTrainer((long) 1);
		Assertions.assertEquals("youssef",oneTrainer.getFname());
	}

	@Test
	void testGetAllTrainer() {
		DAOtrainer trainerDAO = new DAOtrainerImp();
		 Assertions.assertEquals(2,trainerDAO.getAllTrainer().size());
	}

}
