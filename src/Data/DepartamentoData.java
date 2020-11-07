/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Departamento;
import java.util.ArrayList; 

/**
 *
 * @author LENOVO
 */
public class DepartamentoData {
    
    private static DepartamentoData departamentoData;
    
    private DepartamentoData(){
        
    }
    
    public static DepartamentoData GetInstance(){
        if(departamentoData == null){
            departamentoData = new DepartamentoData();
        }
        
        return departamentoData;
    }
    
    public ArrayList<Departamento> GetDepartamentos(){
        ArrayList<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento("01", "Amazonas"));
        departamentos.add(new Departamento("02", "Antioquia"));
        departamentos.add(new Departamento("03", "Arauca"));
        departamentos.add(new Departamento("04", "Atlantico"));
        departamentos.add(new Departamento("05", "Bolivar"));
        departamentos.add(new Departamento("06", "Boyaca"));
        departamentos.add(new Departamento("07", "Caldas"));
        
        return departamentos;
    }
}
