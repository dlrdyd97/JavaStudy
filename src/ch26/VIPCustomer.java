package ch26;

public class VIPCustomer extends Customer {


    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade="VIP";
        bonusRatio=0.05;
        salesRatio=0.1;

//        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint+=price*bonusRatio;
        return price-(int)(price*salesRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+" 담당 상담원 번호는 "+agentID+" 입니다.";
    }

    //    public VIPCustomer() {
//        customerGrade="VIP";
//        bonusRatio=0.05;
//        salesRatio=0.1;
//    }



    public int getAgentID() {
        return agentID;
    }
}
