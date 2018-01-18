package Resort;
public class Tour {
	private String idTour;
	private String name;
	private String price;
	private String startDate;
	private String endDate;
    public String getIdTour() {
        return idTour;
    }

    public void setIdTour(String idTour) {
        this.idTour = idTour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setInfoTour(String name, String price, String startDate, String endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getInfoTour() {
        String info ="Thong tin tour: \n "+"Name: "+getName()+"\n"+" Price:  "+getPrice()+"\n"+" Start Date: "+getStartDate()+"\n"+" End Date: "+getEndDate();
        return info;
    }
}
