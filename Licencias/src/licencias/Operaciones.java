/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC-21
 */
public class Operaciones {
    private static Licencias licencia[];
    private static licenciaRequerida requisito;
    //private static int contador;

    @SuppressWarnings("ConvertToTryWithResources")
    public  static void agregarArchivo(Licencias academia) throws IOException{
        File file=new File("archivo.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
        bfWriter.write(""); 
        bfWriter.write(academia.getNivel()+";"+academia.getEdad()+";"+academia.getTiempo()+";"+academia.getLicencia()+"\r\n");
        bfWriter.close();
        fw.close();
    }
    public  static void crearArchivo(Licencias academia) throws IOException{
        File file=new File("archivo.txt");
        try (FileWriter fw = new FileWriter(file)) {
            BufferedWriter bfWriter;
            bfWriter = new BufferedWriter(fw);
            bfWriter.write(""); 
            bfWriter.write(academia.getNivel()+";"+academia.getEdad()+";"+academia.getTiempo()+";"+academia.getLicencia()+"\r\n");

            bfWriter.close();
        }
    }
    public static Licencias leerArchivo(){
        Licencias academia=new Licencias();
        File file=new File("archivo.txt");
        Scanner reader;
        String line;
        try{
            reader=new Scanner(file);

            while(reader.hasNextLine()){
                line= reader.nextLine();
                Scanner delimiter=new Scanner(line);
                delimiter.useDelimiter("\\s*;\\s*");
                academia.setAll(delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next());
            }
        }catch(FileNotFoundException s){

        }
        return academia;
    }

}
