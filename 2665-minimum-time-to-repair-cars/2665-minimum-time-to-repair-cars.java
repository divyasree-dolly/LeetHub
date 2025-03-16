class Solution {
    public long repairCars(int[] ranks, int cars) {
         Arrays.sort(ranks);
        long left = 1, right =  (long) ranks[0] * (long) cars * (long) cars; //  rank * (cars) see the constraints , it will be 100*(100^6)^2 = 10^14
        long result = right;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepairInTime(ranks, cars, mid)) {
                result = mid;
                right = mid - 1; // Try a smaller time
            } else {
                left = mid + 1; // Increase time
            }
        }
        
        return result;
    }

    private boolean canRepairInTime(int[] ranks, int cars, long time) {
        long repairedCars = 0;
        for (int rank : ranks) {
            repairedCars += (long) Math.sqrt(time / rank); // Max cars this mechanic can repair
            if (repairedCars >= cars) return true; // No  to check further
        }
        return repairedCars >= cars;
    

    }
}