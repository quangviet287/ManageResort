package Resort;

import CreditCard.MasterCard;
import CreditCard.Payment;
import CreditCard.Visa;

import java.util.List;

public class Customer implements Payment {
    private String name;
    private String address;
    private int age;
    private int wallet;
    private int card;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public Villar getVillar() {
        Villar villar = new Villar();
        return villar;
    }

    public void returnDate() {
        switch (wallet) {
            case 100:
                System.out.println("Ban o duoc 10 ngay");
                break;
            case 50:
                System.out.println("Ban o duoc 5 ngay");
                break;
            case 30:
                System.out.println("Ban o duoc 3 ngay");
                break;
            default:
                System.out.println("");
        }
    }

    public void setInfoCus(String name, String address, int age, int card) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.card = card;
    }

    public String getInfoCus() {
        String info = "Name: " + getName() + "\nAge: " + getAge() + "\nAddress: " + getAddress();
        return info;
    }

    @Override
    public void getCreaditCard() {
        if (card == 1) {
            Payment visa = new Visa();
            if (visa instanceof Visa) {
                Visa visaPayment = (Visa) visa;
                visaPayment.getVisaProvider();
            }

        } else if (card == 2) {
            MasterCard masterCard = new MasterCard();
            masterCard.getCreaditCard();
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n";
    }

    public void findCus(String name, List<Customer> lists) throws Exception {
        for (Customer cus : lists) {
            if (name == cus.getName())
                System.out.println(cus.getInfoCus());
            else {
               throw new Exception("no no no ");
            }
        }
    }
}

