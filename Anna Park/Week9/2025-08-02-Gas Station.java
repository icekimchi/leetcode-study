public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;     // 전체 순회 가능한가 판단
        int currentTank = 0;   // 현재 순회 가능한가 판단
        int startStation = 0;  // 출발할 수 있는 주유소 후보

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            totalTank += gain;
            currentTank += gain;

            // 현재까지 연료가 부족하면 이 지점까지는 못 오는 것
            if (currentTank < 0) {
                startStation = i + 1;  // 다음 주유소로 시작점 변경
                currentTank = 0;       // 다시 계산
            }
        }

        return totalTank >= 0 ? startStation : -1;
    }
}