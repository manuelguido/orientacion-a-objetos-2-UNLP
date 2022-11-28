package practica3.practica3_1;

import java.time.Duration;

public class Finished extends State {

	public Duration workedTime(ToDoItem toDoItem) {
		return Duration.between(toDoItem.getStartDate(), toDoItem.getFinishDate());
	}
	
	public void addComment(ToDoItem toDoItem, String comment) {
		throw new RuntimeException("No se puede agregar nuevos comentarios a un ToDoItem finalizado");
	}
}
