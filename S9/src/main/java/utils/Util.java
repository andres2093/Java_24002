package utils;

import models.Action;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Util {
    private static final String FILE_NAME = System.getProperty("user.home") + "/history";

    public static List<Action> historyLoad() throws IOException, ClassNotFoundException { // throws Exception
        List<Action> history = new ArrayList<>();
        if (new File(FILE_NAME).exists()) {
            ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(FILE_NAME)));
            history = (List<Action>) ois.readObject();
        }
        return history;
    }

    public static void historySave(List<Action> history) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(FILE_NAME)));
        oos.writeObject(history);
    }

    public static void historyPrint(String msg, List<Action> history) {
        System.out.println("------------------------");
        System.out.println(msg);
        for (Action action : history) {
            System.out.printf("Log %s %s %s: %s\n",
                    action.getCreated().getDayOfMonth(),
                    Month.values()[action.getCreated().getMonthValue() - 1],
                    action.getCreated().getYear(),
                    action.getCommand()
            );
        }
        System.out.println("------------------------");
    }
}
