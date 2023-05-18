package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testQueryMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertTrue(meeting.matches("Выкатка"));
        Assertions.assertFalse(meeting.matches("выкатка"));
        Assertions.assertTrue(meeting.matches("Приложение"));

    }

    @Test
    public void testQueryEpic() {
        String[] subtask = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtask);

        Assertions.assertTrue(epic.matches("Хлеб"));
        Assertions.assertFalse(epic.matches("Масло"));

    }

    @Test
    public void testQuerySimpleTask() {
        SimpleTask simple = new SimpleTask(5, "Позвонить родителям");

        Assertions.assertTrue(simple.matches("Позвонить"));
        Assertions.assertFalse(simple.matches("дедушке"));

    }

}
