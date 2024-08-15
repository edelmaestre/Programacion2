package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoPadre {
    private File archivo;
    FileWriter aEscritura;
    Scanner aLectura;
    PrintWriter pw;
    
    public ArchivoPadre(String namae) {
        this.archivo = new File(namae);
    }

    public void abrirArchivo() {
        try {
            this.aEscritura = new FileWriter(this.getArchivo(), true);
        } catch (IOException ex) {
            System.err.println("ERROR, NO SE ABRIO EL ARCHIVO..");
        }
    }
    public void cerrarArchivo() {
        if (this.aEscritura != null) {
            try {
                this.aEscritura.close();
            } catch (IOException ex) {
                System.err.println("ERROR AL CERRAR EL ARCHIVO MODO ESCRITURA..");
            }
        }

    }
    public File getArchivo() {
        return archivo;
    }
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
}
