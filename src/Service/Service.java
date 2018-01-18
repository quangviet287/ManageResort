package Service;
abstract class Service {
    protected String name;
    protected int openTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getOpenTime();
}
