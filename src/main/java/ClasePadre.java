import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClasePadre {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el string parámetro de la clase hija: ");

        String parametro = scan.nextLine();

        File directorio = new File("D:\\IntelliJ_Projects\\PSPEjercicio5\\target\\classes");

        ProcessBuilder pb = new ProcessBuilder("java", "ClaseHija", parametro);

        pb.directory(directorio);

        Process proceso = pb.start();

        int exitValue = proceso.waitFor();

        if(exitValue==1){
            System.out.println(args[0]);

        }else{
            System.out.println("No se ha introducido ningún parámetro.");
        }
    }
}
