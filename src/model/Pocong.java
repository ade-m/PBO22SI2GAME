package model;

public class Pocong  extends Enemy implements IBajuIronman,ISarungTangan {//subclass enemy
    
    @Override
    public void serang(){
        System.out.println("Pocong Serang!!! pocong jatuh");
    }

    @Override
    public void terbang() {
     System.out.println("Pocong Terbang!!!");   
    }

    @Override
    public void jetikanjari1() {
        
     System.out.println("Setengah Populasi Hilang!!!");   
     }

    @Override
    public void jetikanjari2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jetikanjari2'");
    }

    @Override
    public void jetikanjari3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jetikanjari3'");
    }
}
