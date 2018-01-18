package Resort;
public class Villar extends Acommodation {

    public void setInfoVilla(float size, String name, int date){
        this.size =size;
        this.name = name;
        this.date = date;
    }
    public String getInfoVilla(){
        String info = "Thong tin vila \n"+" Name: "+getName()+"\n"+" Size: "+getSize()+"\n"+" Bed: "+getBed()+"\n"+" Price: "+getPrice();
        return info;
    }
    @Override
    public float getPrice() {
        return date*10;
    }

    @Override
    public float getBed() {
        return 1;
    }

}
