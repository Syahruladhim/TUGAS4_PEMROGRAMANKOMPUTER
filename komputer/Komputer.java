/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package komputer;

/**
 *
 * @author ARUL
 */
public class Komputer {

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDiskSie() {
        return diskSie;
    }

    public void setDiskSie(String diskSie) {
        this.diskSie = diskSie;
    }

    public String getRam() {
        return ram;
    }

    /**
     * @param args the command line arguments
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    
      private String brand;
      private String model;
      private String disk;
      private String diskSie;
      private String ram;

    void setDiskSize(int diskSize) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setRam(int ramSize) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
