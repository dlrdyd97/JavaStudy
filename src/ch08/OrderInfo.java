package ch08;

public class OrderInfo {

    String id;
    String phoneNum;
    String address;
    String date;
    String time;
    int price;
    String menuNum;

    public OrderInfo(String id, String phoneNum, String address, String date, String time, int price, String menuNum) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNum = menuNum;
    }

    public void showOrderInfo(){
        System.out.println("주문 접수 번호 : "+id);
        System.out.println("주문 핸드폰 번호 : "+phoneNum);
        System.out.println("주문 집 주소 : "+address);
        System.out.println("주문 날짜 : "+date);
        System.out.println("주문 시간 : "+time);
        System.out.println("주문 가격 : "+price);
        System.out.println("메뉴 번호 : "+menuNum);
    }

}
