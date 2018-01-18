package Resort;

public class Car {
	private String idCar;
	public void setIdCar(String idCar) {
		this.idCar = idCar;
	}
	public String getIdCar() {
		return idCar;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+idCar;
	}
}
