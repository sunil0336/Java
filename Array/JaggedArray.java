public class JaggedArray {
    public static void main(String[] args) {
        
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[4];


// int normal for loop we have to get .length for colums
        for(int i=0;i<nums.length;i++){
            for(int j=0; j< nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();
// the enhace for loop automatically detects the length of no.of colums we don't have to mention

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
