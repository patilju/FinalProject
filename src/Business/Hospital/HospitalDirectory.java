/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;
import java.util.ArrayList;
/**
 *
 * @author juile
 */
public class HospitalDirectory {
     private ArrayList<Hospital> Hospitals;

    public HospitalDirectory() {
        Hospitals = new ArrayList();
    }
    
    public Hospital createHospital(String name, String address, String phone){
        Hospital Hospital = new Hospital();
        Hospital.setHospitalName(name);
        Hospital.setHospitalAddress(address);
        Hospital.setHospitalContactNo(phone);

        Hospitals.add(Hospital);
        return Hospital;
    }

    public ArrayList<Hospital> getHospitals() {
        return Hospitals;
    }
    
    public Hospital findHospital(String name)
    {
        for(Hospital h : Hospitals)
        {
            if(h.getHospitalName() == name)
            {
                return h;
            }
        }
        return null;
    }
    
    public void deleteHospital(Hospital hospital)
    {
        Hospitals.remove(hospital);
    }
}
