package com.camada2.AdministradorArchivos;

public class MainArchivos {
    public static void main(String[] args) {
        try {
            Archivo archivo1 = ArchivoFactory.getInstance().crearArchivo("Archivo Concreto");
            ((ArchivoConcreto) archivo1).setNombre("Video1");
            ((ArchivoConcreto) archivo1).setTipoArchivo("archivo");
            Archivo archivo2 = ArchivoFactory.getInstance().crearArchivo("Archivo Concreto");
            ((ArchivoConcreto) archivo2).setNombre("Video2");
            ((ArchivoConcreto) archivo2).setTipoArchivo("archivo");
            Archivo archivo3 = ArchivoFactory.getInstance().crearArchivo("Archivo Concreto");
            ((ArchivoConcreto) archivo3).setNombre("Texto1");
            ((ArchivoConcreto) archivo3).setTipoArchivo("archivo");
            Archivo archivo4 = ArchivoFactory.getInstance().crearArchivo("Archivo Concreto");
            ((ArchivoConcreto) archivo4).setNombre("Texto2");
            ((ArchivoConcreto) archivo4).setTipoArchivo("archivo");
            Archivo archivo5 = ArchivoFactory.getInstance().crearArchivo("Archivo Concreto");
            ((ArchivoConcreto) archivo5).setNombre("Texto3");
            ((ArchivoConcreto) archivo5).setTipoArchivo("archivo");
            Archivo carpeta1 = ArchivoFactory.getInstance().crearArchivo("Archivo Carpeta");
            ((Carpeta) carpeta1).setNombre("Carpeta1");
            ((Carpeta) carpeta1).agregarArchivo(archivo1);
            ((Carpeta) carpeta1).agregarArchivo(archivo2);
            ((Carpeta) carpeta1).agregarArchivo(archivo3);
            ((Carpeta) carpeta1).agregarArchivo(archivo4);
            ((Carpeta) carpeta1).agregarArchivo(archivo5);

            System.out.println(carpeta1);

            ((Carpeta) carpeta1).eliminarArchivo(archivo5);
            System.out.println(carpeta1);

            Archivo carpeta2 = ArchivoFactory.getInstance().crearArchivo("Archivo Carpeta");
            ((Carpeta) carpeta2).setNombre("Carpeta2");
            ((Carpeta) carpeta1).agregarArchivo(carpeta2);
            System.out.println("Aca agregue carpeta");
            System.out.println(carpeta1);
            ((Carpeta) carpeta1).eliminarArchivo(carpeta2);
            System.out.println("Aca elimine carpeta");
            System.out.println(carpeta1);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
