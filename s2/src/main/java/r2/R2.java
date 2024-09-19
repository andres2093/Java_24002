package r2;

public class R2 {
    public static void main(String[] args) {
        String mensaje;
        byte calificacion = (byte) ((Math.random() * 10) + 1);
        if (calificacion >= 1 && calificacion <= 10) {
            if (calificacion == 10) {
                mensaje = "¡Excelente!";
            } else if (calificacion == 9 || calificacion == 8) {
                mensaje = "¡Muy bien!";
            } else if (calificacion == 7) {
                mensaje = "¡Bien hecho!";
            } else if (calificacion == 6) {
                mensaje = "¡Pasaste!";
            } else {
                mensaje = "¡Intenta de nuevo!";
            }
            System.out.println("Calificación: " + calificacion + ". " + mensaje);
        } else {
            System.out.println("¡La calificación debe estar entre 1 y 10!");
        }

        System.out.println("--------------------------------");

        int numero = (byte) ((Math.random() * 10) + 1);
        String[] meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesActual = meses[numero];
        System.out.println(mesActual);

        if (mesActual.equals("enero")) {
            System.out.print("febrero, ");
            mesActual = "febrero";
        }
        if (mesActual.equals("febrero")) {
            System.out.print("marzo, ");
            mesActual = "marzo";
        }
        if (mesActual.equals("marzo")) {
            System.out.print("abril, ");
            mesActual = "abril";
        }
        if (mesActual.equals("abril")) {
            System.out.print("mayo, ");
            mesActual = "mayo";
        }
        if (mesActual.equals("mayo")) {
            System.out.print("junio, ");
            mesActual = "junio";
        }
        if (mesActual.equals("junio")) {
            System.out.print("julio, ");
            mesActual = "julio";
        }
        if (mesActual.equals("julio")) {
            System.out.print("agosto, ");
            mesActual = "agosto";
        }
        if (mesActual.equals("agosto")) {
            System.out.print("septiembre, ");
            mesActual = "septiembre";
        }
        if (mesActual.equals("septiembre")) {
            System.out.print("octubre, ");
            mesActual = "octubre";
        }
        if (mesActual.equals("octubre")) {
            System.out.print("noviembre, ");
            mesActual = "noviembre";
        }
        if (mesActual.equals("noviembre")) {
            System.out.print("diciembre");
        }
    }
}