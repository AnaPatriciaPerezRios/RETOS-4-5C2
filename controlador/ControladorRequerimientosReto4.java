package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientosReto4 {
    // LiderDao dao = new LiderDao();
    // TransformarDao dao = new TransformarDao();
     
     public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
         Requerimiento_1Dao dao = new Requerimiento_1Dao();
         return dao.requerimiento1();
     }
 
     public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
         Requerimiento_2Dao dao = new Requerimiento_2Dao();
         return dao.requerimiento2();
     }
 
     public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
         Requerimiento_3Dao dao = new Requerimiento_3Dao();
         return dao.requerimiento3();
     }    
 }

   
     /*public ArrayList<Cargo_Salario> consultarRequerimiento4() throws SQLException {
         CargoDao dao = new CargoDao();
         return dao.requerimiento4();
     }*/