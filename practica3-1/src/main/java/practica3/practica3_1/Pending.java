package practica3.practica3_1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {
	
	public void start(ToDoItem toDoItem) {
		toDoItem.setStartDate(LocalDateTime.now());
		toDoItem.setState(new InProgress());
	}
	
	public Duration workedTime() {
		// Aún no comienza
		throw new RuntimeException("El objeto ToDoItem aún no se a iniciado");
	}
	
	public void addComment(ToDoItem toDoItem, String comment) {
		toDoItem.getComments().add(comment);
	}
}
