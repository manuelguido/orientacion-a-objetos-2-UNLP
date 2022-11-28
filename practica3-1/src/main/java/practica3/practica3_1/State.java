package practica3.practica3_1;

import java.time.Duration;

public abstract class State {

	public void start(ToDoItem toDoItem) {

	}

	public void togglePause(ToDoItem toDoItem) {

	}

	public void finish(ToDoItem toDoItem) {

	}

	public Duration workedTime(ToDoItem toDoItem) {
		return null;
	}

	public void addComment(ToDoItem toDoItem, String comment) {

	}
}
