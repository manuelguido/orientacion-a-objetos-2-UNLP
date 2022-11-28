package practica3.practica3_1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State {

	public void start(ToDoItem toDoItem) {
		toDoItem.setState(new InProgress());
	}

	public void togglePause(ToDoItem toDoItem) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	public void finish(ToDoItem toDoItem) {
		toDoItem.setState(new Finished());
		toDoItem.setFinishDate(LocalDateTime.now());
	}

	public Duration workedTime(ToDoItem toDoItem) {
		return Duration.between(toDoItem.getStartDate(), LocalDateTime.now());
	}

	public void addComment(ToDoItem toDoItem, String comment) {
		toDoItem.getComments().add(comment);
	}
}
