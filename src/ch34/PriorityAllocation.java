package ch34;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다.");
    }
}
