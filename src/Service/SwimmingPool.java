package Service;
public class SwimmingPool extends Service {
    private int timeCome;

    public int getTimeCome() {
        return timeCome;
    }

    public void setTimeCome(int timeCome) {
        this.timeCome = timeCome;
    }
    public void returnMessage(){
        if (timeCome<8){
            System.out.println("Ho boi chua mo cua, ban hay cho den 10h");
        }else System.out.println("Moi ban vao ho boi");
    }
    @Override
    public int getOpenTime() {
        return 10;
    }
}
