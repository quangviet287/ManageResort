package Resort;
public class House extends Acommodation {

    public void setInfoHouse(float size, String name, int date){
        this.size =size;
        this.name = name;
        this.date = date;
    }
    public String getInfoHouse(){
        String info = "Thong tin house \n"+" Name: "+getName()+"\n"+" Size: "+getSize()+"\n"+" Bed: "+getBed()+"\n"+" Price: "+getPrice();
        return info;
    }
    @Override
    public float getPrice() {
        return date*5;
    }

    @Override
    public float getBed() {
        return 4;
    }
}
