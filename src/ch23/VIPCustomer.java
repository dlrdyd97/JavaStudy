package ch23;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        customerGrade="VIP";
        bonusRatio=0.05;
        salesRatio=0.1;

//        System.out.println("하위클래스 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
