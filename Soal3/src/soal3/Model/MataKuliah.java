package soal3.Model;

public class MataKuliah {
    public int kodeMataKuliah;
    public String namaMataKuliah;
    public int jumlahSks;
    
    public void index(){
        System.out.println("Ini adalah method index");
    }
    
    public void store(){
        System.out.println("Ini adalah method store");
    }
    
    public void update(){
        System.out.println("Ini adalah method update");
    }
    
    public void destroy(){
        System.out.println("Ini adalah method destroy");
    }
    
    public void show(int id){
        System.out.println("Ini adalah method show: "+id);
    }
}
