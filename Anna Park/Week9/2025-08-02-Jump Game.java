public class jumpGame {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false;
            }
            // maxReachable 갱신
            maxReachable = Math.max(maxReachable, i + nums[i]);
        }

        return true;
    }
}