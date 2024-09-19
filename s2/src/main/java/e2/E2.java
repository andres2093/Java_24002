package e2;

public class E2 {
    public static void main(String[] args) {
        String mensaje;
        byte calificacion = 10;
        if (calificacion >= 1 && calificacion <= 10) {
            switch (calificacion) {
                case 10:
                    mensaje = "¡Excelente!";
                    break;
                case 9:
                case 8:
                    mensaje = "¡Muy bien!";
                    break;
                case 7:
                    mensaje = "¡Bien hecho!";
                    break;
                case 6:
                    mensaje = "¡Pasaste!";
                    break;
                default:
                    mensaje = "¡Intenta de nuevo!";
            }
            System.out.println("Calificación: " + calificacion + ". " + mensaje);
        } else {
            System.out.println("¡La calificación debe estar entre 1 y 10!");
        }

        System.out.println("-----------------------------");

        String mesActual = "mar";

        switch (mesActual){
            case "ene":
                System.out.print(" feb,");
            case "feb":
                System.out.print(" mar,");
            case "mar":
                System.out.print(" abr,");
            case "abr":
                System.out.print(" may,");
            case "may":
                System.out.print(" jun,");
            case "jun":
                System.out.print(" jul,");
            case "jul":
                System.out.print(" ago,");
            case "ago":
                System.out.print(" sep,");
            case "sep":
                System.out.print(" oct,");
            case "oct":
                System.out.print(" nov,");
            case "nov":
                System.out.print(" dic");
        }
    }
}
