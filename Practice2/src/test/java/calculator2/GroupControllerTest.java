package calculator2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;



class GroupControllerTest {

	@Test
	public void test_GetAllTraineesMethod_CallsReadGroupMethodOfInjectedDatabaseReader_WhenCalled() {
		GroupController traineeGroupController = new GroupController(new DatabaseWriter(), new DatabaseReader());
		Map<String, Trainee> allTrainees = traineeGroupController.getAllTrainees();
		GroupControllerService group1 = mock(GroupControllerService.class);
		when(group1.getAllTrainees()).thenReturn(allTrainees);
		
		assertEquals(group1.getAllTrainees(), allTrainees);
	}
	
	
	@Test
	public void test_addTraineeMethodPassTheTraineeToBeAddedtoTheDBWriter() {
		DatabaseReader reader = mock(DatabaseReader.class);
		DatabaseWriter writer = mock(DatabaseWriter.class);
//		GroupController traineeGroupController = new GroupController(writer, reader);
//		Map<String, Trainee> allTrainees = traineeGroupController.getAllTrainees();
		
		Trainee trainee1 = mock(Trainee.class);
		when(trainee1.getName()).thenReturn("Tom");
		
		
		GroupController group1 = mock(GroupController.class);
		when(group1.getDatabaseWriter()).thenReturn(writer);
		when(group1.getDatabaseReader()).thenReturn(reader);
		
		group1.addTrainee(trainee1);
		Map<String, Trainee> trainees = reader.readGroup();
		assertEquals(true,trainees.containsKey("Tom"));
			
	}

}
