package practica3.practica3_1;

import java.time.Duration;
//import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoItem {
	private String name;
	private State state;
	private LocalDateTime startDate;
	private LocalDateTime finishDate;
	private ArrayList<String> comments;

	/**
	 * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	 */
	public ToDoItem(String name) {
		this.setName(name);
		this.setState(new Pending());
		this.setStartDate(null);
		this.setFinishDate(null);
		this.comments = new ArrayList<String>();
	}

	/**
	 * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	 * pending, si se encuentra en otro estado, no hace nada)
	 */
	public void start() {
		this.getState().start(this);
	}

	/**
	 * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	 * estado es paused. Caso contrario (pending o finished) genera un error
	 * informando la causa específica del mismo
	 */
	public void togglePause() {
		this.getState().togglePause(this);
	}

	/**
	 * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
	 * in-progress o pausada, si se encuentra en otro estado, no hace nada)
	 */
	public void finish() {
		this.getState().finish(this);
	}

	/**
	 * Retorna el tiempo que transcurrió desde que se inició la tarea (start) hasta
	 * que se finalizó. En caso de que no esté finalizada, el tiempo que haya
	 * transcurrido hasta el momento actual. Si la tarea no se inició, genera un
	 * error informando la causa específica del mismo.
	 */
	public Duration workedTime() {
		return this.getState().workedTime(this);
	}

	/**
	 * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	 * contrario no hace nada."
	 */
	public void addComment(String comment) {
		this.getState().addComment(this, comment);
	}

	/**
	 * Getters & Setters
	 */
	public void setName(String n) {
		this.name = n;
	}

	public void setState(State s) {
		this.state = (s);
	}

	public void setStartDate(LocalDateTime d) {
		this.startDate = d;
	}

	public void setFinishDate(LocalDateTime d) {
		this.finishDate = d;
	}

	public String getName() {
		return this.name;
	}

	public State getState() {
		return this.state;
	}

	public LocalDateTime getStartDate() {
		return this.startDate;
	}

	public LocalDateTime getFinishDate() {
		return this.finishDate;
	}

	public ArrayList<String> getComments() {
		return this.comments;
	}
}
