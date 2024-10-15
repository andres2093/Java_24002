import models.Action;
import utils.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Historial {
    private static List<Action> history;

    public static void main(String[] args) {
        try {
            history = Util.historyLoad();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            history = new ArrayList<>();
        }

        Util.historyPrint("Log inicial", history);

        history.add(new Action("Consulta db"));
        history.add(new Action("Crear registro"));
        history.add(new Action("Actualizar registro"));
        history.add(new Action("Eliminar registro"));
        history.add(new Action("Consulta db"));

        Util.historyPrint("Log final", history);
        try {
            Util.historySave(history);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
