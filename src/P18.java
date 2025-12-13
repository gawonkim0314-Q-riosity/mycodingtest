import java.util.HashSet;

public class P18 {
    
    private static boolean solution(int[] arr, int target){ 
        HashSet<Integer> hashSet = new HashSet<>(); 

        for (int i : arr) {
            if(hashSet.contains(target - i)){ 
                return true;
            }

            hashSet.add(i);
        }

        return false;
    }

    public static void main(String[] args) {
        boolean res = solution(new int[]{2,3,5,9},10);
        System.out.println(res);
    }
}
