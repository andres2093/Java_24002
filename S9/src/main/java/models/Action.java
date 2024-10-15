package models;

import java.io.Serializable;
import java.time.LocalDate;

public class Action implements Serializable {
    private LocalDate created;
    private String command;

    public Action(String command) {
        this.command = command;
        created = LocalDate.now();
    }

    public LocalDate getCreated() {
        return created;
    }

    public String getCommand() {
        return command;
    }
}
