import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClasePadre {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el string parámetro de la clase hija: ");

        String parametro = scan.nextLine();

        File directorio = new File("C:\\Users\\a21dominicohl\\IdeaProjects\\PSPEjercicio5\\target\\classes");

        ProcessBuilder pb = new ProcessBuilder("java", "ClaseHija", parametro);

        pb.directory(directorio);

        Process proceso = pb.start();

        proceso.waitFor();


    }
}
