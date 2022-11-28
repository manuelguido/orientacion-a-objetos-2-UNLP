package practica3.practica3_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	ToDoItem toDoItem;

	@BeforeEach
	void setUp() throws Exception {
		toDoItem = new ToDoItem("hacer tp1");
	}

	@Test
	public void testTemporario() {
		// 160 horas trabajadas, 2 hijos, es casado
		assertEquals(toDoItem.getName(), "hacer tp1");
	}

}
