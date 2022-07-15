package calculator2;

import java.util.Map;



public class GroupController implements GroupControllerService {

	DatabaseReader databaseReader;
	DatabaseWriter databaseWriter;
	
	
	public GroupController(DatabaseWriter mockWriter, DatabaseReader mockReader) {
		databaseReader = mockReader;
		databaseWriter = mockWriter;
	}

	public Map<String, Trainee> getAllTrainees() {
		return databaseReader.readGroup();
	}

	public void addTrainee(Trainee trainee) {
		databaseWriter.addTrainee(trainee);
	}

	public DatabaseReader getDatabaseReader() {
		return databaseReader;
	}

	public void setDatabaseReader(DatabaseReader databaseReader) {
		this.databaseReader = databaseReader;
	}

	public DatabaseWriter getDatabaseWriter() {
		return databaseWriter;
	}

	public void setDatabaseWriter(DatabaseWriter databaseWriter) {
		this.databaseWriter = databaseWriter;
	}

	public void removeTraineeByUsername(String string) {
		databaseWriter.deleteTraineeByUsername(string);
	}



}
