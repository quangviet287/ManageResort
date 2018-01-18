package Main;

import Resort.Customer;
import Resort.Villar;
import Service.SwimmingPool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void day1() {
        Villar villar = new Villar();
        villar.setInfoVilla(100, "Villa_A", 5);
        Customer cus0 = new Customer();
        cus0.setName("Nguyen Van A");
        cus0.setAge(10);
        cus0.setWallet(100);
        //cus0.setVillar(villar.setInfoVilla(100,"Villa_A",5));
        Villar reVi = cus0.getVillar();
        reVi.setInfoVilla(100, "Villa_A", 5);
        cus0.returnDate();
        System.out.println("Khach hang " + cus0.getName() + " .Tuoi: " + cus0.getAge() + "\n Da thue vila: " + reVi.getInfoVilla());
        // System.out.println("Khach hang "+cus0.getName()+" .Tuoi: "+cus0.getAge()+"\n Da thue vila: " + villar.getInfoVilla());
        SwimmingPool sw = new SwimmingPool();
        sw.setTimeCome(7);
        System.out.println("Gio mo cua cua ho boi la: " + sw.getOpenTime() + "\nGio ban den: " + sw.getTimeCome());
        sw.returnMessage();
    }

    public static void day2() {
        Villar villar0 = new Villar();
        Villar villar1 = new Villar();
        Villar villar2 = new Villar();
        Villar villar3 = new Villar();
        Villar villar4 = new Villar();
        Villar[] villars = new Villar[5];
        villar0.setInfoVilla(100, "Villa_A", 10);
        villar0.setInfoVilla(110, "Villa_B", 9);
        villar0.setInfoVilla(120, "Villa_C", 8);
        villar0.setInfoVilla(130, "Villa_D", 7);
        villar0.setInfoVilla(140, "Villa_E", 6);
        villars[0] = villar0;
        villars[1] = villar1;
        villars[2] = villar2;
        villars[3] = villar3;
        villars[4] = villar4;
        System.out.println("DANH SACH VILLAS");
        for (int i = 0; i < 5; i++) {
            System.out.println(villars[i].getInfoVilla());
        }
    }

    public static void main(String[] arg) throws Exception {
        /*Customer cus = new Customer();
        cus.setName("ABC");
        Villar vila = new Villar();
        vila.setDate(5);
        vila.setName("vilar1");
        vila.setPriceSize(5000);
        vila.setSize(120);
        System.out.println("Khach hang "+cus.getName()+" da dat "+vila.getName()+" trong "+vila.getDate()+" ngay. So tien phai tra la: "+ vila.getPrice());*/
        /*House h1 = new House();
        float noBed =vila.getBed()+h1.getBed();
        System.out.println("So giuong co trong Resort la: "+ noBed);
        SwimmingPool sw = new SwimmingPool();
        sw.setName("Be boi 1");
        sw.setOpenTime("8:00 AM");
        sw.setEndTime("20:00 PM");
        System.out.println("Thoi gian mo cua cua "+sw.getName()+" la: " + sw.getHour());

        Tour t1 = new Tour();
        t1.setInfoTour("Da Nang","1000$","1/1/2018","1/15/2018");
        System.out.println(t1.getInfoTour());*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~Day2 Su dung Array~~~~~~~~~~~~~~~~~~~~~~~~~~~


       /* Villar villar0 = new Villar();
        Villar villar1 = new Villar();
        Villar villar2 = new Villar();
        Villar villar3 = new Villar();
        Villar villar4 = new Villar();
        Villar[] villars = new Villar[5];
        villar0.setInfoVilla(100,"Villa_A",10);
        villar0.setInfoVilla(110,"Villa_B",9);
        villar0.setInfoVilla(120,"Villa_C",8);
        villar0.setInfoVilla(130,"Villa_D",7);
        villar0.setInfoVilla(140,"Villa_E",6);
        villars[0]=villar0;
        villars[1]=villar1;
        villars[2]=villar2;
        villars[3]=villar3;
        villars[4]=villar4;
        System.out.println("DANH SACH VILLAS");
        for (int i = 0;i<5;i++){
            System.out.println(villars[i].getInfoVilla());
        }*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~Day1~~~~~~~~~~~~~~~~~~~~~~~~~~~
        /*Villar villar = new Villar();
        villar.setInfoVilla(100,"Villa_A",5);
        Customer cus0 = new Customer();
        cus0.setName("Nguyen Van A");
        cus0.setAge(10);
        cus0.setWallet(100);
        //cus0.setVillar(villar.setInfoVilla(100,"Villa_A",5));
        Villar reVi = cus0.getVillar();
        reVi.setInfoVilla(100, "Villa_A", 5);
        cus0.returnDate();
        System.out.println("Khach hang "+cus0.getName()+" .Tuoi: "+cus0.getAge()+"\n Da thue vila: " + reVi.getInfoVilla());
       // System.out.println("Khach hang "+cus0.getName()+" .Tuoi: "+cus0.getAge()+"\n Da thue vila: " + villar.getInfoVilla());
        SwimmingPool sw = new SwimmingPool();
        sw.setTimeCome(7);
        System.out.println("Gio mo cua cua ho boi la: "+sw.getOpenTime()+"\nGio ban den: "+sw.getTimeCome());
        sw.returnMessage();*/

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Day4 Su dung Array List~~~~~~~~~~~~~~~~~~~~~~~~~
       /* Customer customer0 = new Customer();
        customer0.setInfoCus("Le Van A","Da Nang", 50);
        Customer customer1 = new Customer();
        customer1.setInfoCus("Le Van B","Quang Nam", 40);
        Customer customer2 = new Customer();
        customer2.setInfoCus("Le Van C","Ha Noi", 25);
        Customer customer3 = new Customer();
        customer3.setInfoCus("Le Van D","Sai Gon", 51);

        List<Customer> Customers = new ArrayList<Customer>();
        Customers.add(0,customer0);
        Customers.add(1,customer1);
        Customers.add(2,customer2);
        Customers.add(3,customer3);
        for (Customer customers : Customers){
            System.out.println(customers.getInfoCus()+"\n");
        }*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Day 5 Implement Interface PayMent~~~~~~~~~~~~~~~~~~~~~~~~~
    	/*Customer cus = new Customer();
    	cus.setInfoCus("viet", "Da Nang", 21, 1);
    	System.out.println(cus.getInfoCus());
    	cus.getCreaditCard();*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Day 8 Map~~~~~~~~~~~~~~~~~~~~~~~~~
    	/*Employee em1 = new Employee();
    	em1.setInfoEmploy("Viet", "Da Nang", 20);
    	Employee em2 = new Employee();
    	em2.setInfoEmploy("Quang Viet", "Quang Nam", 21);
    	Employee em3 = new Employee();
    	em3.setInfoEmploy("Trinh Quang Viet", "Ha Noi", 22);
    	Employee em4 = new Employee();
    	em4.setInfoEmploy("Trinh Viet", "Sai Gon", 23);
    	Employee em5 = new Employee();
    	em5.setInfoEmploy("Quang", "Da Lat", 24);
    	Map<Integer, Employee> map = new HashMap<Integer, Employee>();
    	map.put(1, em1);
    	map.put(2, em2);
    	map.put(3, em3);
    	map.put(4, em4);
    	map.put(5, em5);
    	for (Map.Entry<Integer, Employee> data : map.entrySet()) {
            System.out.println(data.getKey() + " " + data.getValue().getInfoEmployees());
        }*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Day 9 Hashset~~~~~~~~~~~~~~~~~~~~~~~~~
    	/*Car car1 = new Car();
    	car1.setIdCar("92K1-05579");
    	Car car2 = new Car();
    	car2.setIdCar("92K1-04113");
    	Car car3 = new Car();
    	car3.setIdCar("92K1-99999");
    	//tao set colection
    	Set<Car>cars = new HashSet<Car>();
    	cars.add(car1);
    	cars.add(car2);
    	cars.add(car3);
    	cars.add(car3);
    	//duyet xe
    	for(Car listcars : cars) {
    		System.out.println(listcars);
    	}*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Day 10 Queue~~~~~~~~~~~~~~~~~~~~~~~~~
		/*Customer cus1 = new Customer();cus1.setName("Viet");
		Customer cus2 = new Customer();cus2.setName("Viet1");
		Customer cus3 = new Customer();cus3.setName("Viet2");
		Customer cus4 = new Customer();cus4.setName("Viet3");
		Customer cus5 = new Customer();cus5.setName("Viet4");
		Customer cus6 = new Customer();cus6.setName("Viet5");
		Customer cus7 = new Customer();cus7.setName("Viet6");
		Customer cus8 = new Customer();cus8.setName("Viet7");
    	Queue<Customer> movies = new LinkedList<Customer>();
    	movies.add(cus1);movies.add(cus6);
    	movies.add(cus2);movies.add(cus7);
    	movies.add(cus3);movies.add(cus8);
    	movies.add(cus4);movies.add(cus5);
    	//System.out.println(movies.peek());
    	//System.out.println(movies.toString());
        Iterator i = movies.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }*/

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Day 11 Stack~~~~~~~~~~~~~~~~~~~~~~~~~
        /*Employee em1 = new Employee();
        em1.setInfoEmploy("Viet", "Da Nang", 20);
        Employee em2 = new Employee();
        em2.setInfoEmploy("Quang Viet", "Quang Nam", 21);
        Employee em3 = new Employee();
        em3.setInfoEmploy("Trinh Quang Viet", "Ha Noi", 22);

        Stack<Employee> st = new Stack<Employee>();
        System.out.println("stack: " + st);
        showpush(st, em1);
        showpush(st, em2);
        showpush(st, em3);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }*/
        //~~~~~~~~~~~~~~~~~~~~~~~Day12~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        /*Employee em1 = new Employee();
        em1.setInfoEmploy("Viet", "Da Nang", 20);
        Employee em2 = new Employee();
        em2.setInfoEmploy("Quang Viet", "Quang Nam", 21);
        Employee em3 = new Employee();
        em3.setInfoEmploy("Trinh Quang Viet", "Ha Noi", 22);
        Employee em4 = new Employee();
        em4.setInfoEmploy("Trinh Viet", "Sai Gon", 23);
        Employee em5 = new Employee();
        em5.setInfoEmploy("Quang", "Da Lat", 24);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(em1);
        employees.add(em2);
        employees.add(em3);
        employees.add(em4);
        employees.add(em5);
        Collections.sort(employees);
        for (Employee element : employees) {
            System.out.println(element);
        }*/
        //~~~~~~~~~~~~~~~~~~~~~~~Day13~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Customer customer0 = new Customer();
        customer0.setInfoCus("Le Van A","Da Nang", 50,2);
        Customer customer1 = new Customer();
        customer1.setInfoCus("Le Van B","Quang Nam", 40,1);
        Customer customer2 = new Customer();
        customer2.setInfoCus("Le Van C","Ha Noi", 25,1);
        Customer customer3 = new Customer();
        customer3.setInfoCus("Le Van D","Sai Gon", 51,2);

        List<Customer> Customers = new ArrayList<Customer>();
        Customers.add(0,customer0);
        Customers.add(1,customer1);
        Customers.add(2,customer2);
        Customers.add(3,customer3);
        Customer cus = new Customer();
        cus.findCus("Le Van E",Customers);
        //~~~~~~~~~~~~~~~~~~~~~~~Day14~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        /*try {
            FileOutputStream fos = new FileOutputStream("E:\\abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Customer customer0 = new Customer();
            customer0.setInfoCus("Le Van A","Da Nang", 50,2);
            Customer customer1 = new Customer();
            customer1.setInfoCus("Le Van B","Quang Nam", 40,1);
            Customer customer2 = new Customer();
            customer2.setInfoCus("Le Van C","Ha Noi", 25,1);
            Customer customer3 = new Customer();
            customer3.setInfoCus("Le Van D","Sai Gon", 51,2);
            oos.writeObject(customer0);
            oos.writeObject(customer1);
            oos.writeObject(customer2);
            oos.writeObject(customer3);
            fos.close();
            oos.close();
            System.out.println("Save file success");
        }catch (IOException e){
            System.out.println("fails to save");
        }*/
    }
}
