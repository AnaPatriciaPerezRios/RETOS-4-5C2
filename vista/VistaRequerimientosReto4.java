package utp.misiontic2022.c2.p47.reto4.vista;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientosReto4;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;


public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1() {

        System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea 'Ortiz'");

       
        try {

            ArrayList<Requerimiento_1> Requerimiento_1Ortiz = controlador.consultarRequerimiento1();

            // Encabezado del resultado
            System.out.println("Nombre Primer_apellido Segundo_apellido Salario");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_1 Requerimiento_1 : Requerimiento_1Ortiz) {
                System.out.print(Requerimiento_1.getNombre()+" ");
                System.out.print(Requerimiento_1.getPrimer_Apellido()+" ");
                System.out.print(Requerimiento_1.getSegundo_Apellido()+" ");
                System.out.println(Requerimiento_1.getSalario());
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public static void requerimiento2() {

        System.out.println("Transformar y obtener el nombre de los lideres donde la primera letra sea en minúscula y las demás en mayúscula");

        try {
            ArrayList<Requerimiento_2> resultado = controlador.consultarRequerimiento2();
                
                System.out.println("Nombre");
            for (Requerimiento_2 transformar:resultado){
                System.out.println(transformar.getNombre());
         
        }} catch (Exception e) {
            System.err.println(e);
        }

    }

    public static void requerimiento3() {

        System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia");

        try {

            ArrayList<Requerimiento_3> cargoRequerimiento_3 = controlador.consultarRequerimiento3();

            // Encabezado del resultado
            System.out.println("Cargo Salario");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_3 requerimiento_3 : cargoRequerimiento_3) {
                System.out.print(requerimiento_3.getCargo()+" ");
                System.out.println(requerimiento_3.getPromedio());
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }

}






















































































/*class VistaRequerimientosReto4 {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1(){

        System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea 'Ortiz'");       

        try{

            ArrayList<Lider> lideresOrtiz = controlador.consultarLideresOrtiz();

            //Encabezado del resultado
            System.out.println("Nombre Primer_apellido Segundo_apellido Salario");
            
            //Cada VO cargado, mostrarlo en la vista
            for (Lider lider : lideresOrtiz) {
                System.out.printf("%s %s %s %s %n", 
                    lider.getNombre(), 
                    lider.getPrimer_apellido(), 
                    lider.getSegundo_apellido(), 
                    lider.getSalario()
                );   
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }

    public static void requerimiento2(){

        System.out.println("Transformar y obtener el nombre de los lideres donde la primera letra sea en minúscula y las demás en mayúscula");       

        try{

            ArrayList<Lider> nombreLideres = controlador.consultarNombreLideres();

            //Encabezado del resultado
            System.out.println("Nombre");
            
            //Cada VO cargado, mostrarlo en la vista
            for (Lider lider : nombreLideres) {
                System.out.printf("%s %n",                     
                    lider.getNombre()
                );   
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }

    public static void requerimiento3(){

        System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia");       

        try{

            ArrayList<Lider> cargoLideres = controlador.consultarSumaSalarios();

            //Encabezado del resultado
            System.out.println("Cargo Salario");
            
            //Cada VO cargado, mostrarlo en la vista
            for (Lider lider : cargoLideres) {
                System.out.printf("%s %f %n", 
                    lider.getCargo(),
                    lider.getSalario()                   
                );   
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }

    
    
}*/