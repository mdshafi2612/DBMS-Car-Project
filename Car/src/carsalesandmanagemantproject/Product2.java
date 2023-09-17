package carsalesandmanagemantproject;

public class Product2 {

    private String c_email;
    private String plate_no;
    private String c_name;
    private String model;
    private String brand;
    private byte[] Image;

    public Product2() {
        
    }
    
    public Product2(String c_email, String plate_no, String c_name, String model, String brand, byte[] Image) {
        this.c_email = c_email;
        this.plate_no = plate_no;
        this.c_name = c_name;
        this.model = model;
        this.brand = brand;
        this.Image = Image;
    }

    public String getC_email() {
        return c_email;
    }

    public String getPlate_no() {
        return plate_no;
    }

    public String getC_name() {
        return c_name;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }
    
}