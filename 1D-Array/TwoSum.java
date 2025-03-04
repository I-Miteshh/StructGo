class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,9,10,11,24,9};
        int target = 18 ;
        int[] result = twoSum(arr,target);
        System.out.println("Indices which adds upto "+ target + " are ");
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int desired_value = 0;
        for(int i=0; i<nums.length; i++){
            desired_value = target - nums[i];
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[j] == desired_value){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}

