package Resort;
abstract class Acommodation {
    protected String name;
    protected float size;
    protected float bed;
    protected float date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setBed(float bed) {
        this.bed = bed;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public abstract float getPrice();
    public abstract float getBed();
}
