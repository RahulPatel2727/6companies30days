package Microsoft;
import java.util.*;
public class Combination_Sum_III {
    public static void main(String[] args) {
        int k = 4;
        int v = 21;
        List<List<Integer>> ans;
        ans = combinationSum3(k, v);
        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        find3(k,n,1,new ArrayList<>(), ans);
        return ans;
    }
    public static void find3(int k, int val, int ind,  List<Integer>ds, List<List<Integer>> ans){
        if(val == 0 && ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i <= 9; i++){
            if(i <= val ){
                ds.add(i);
                find3(k, val - i,i+1, ds, ans);
                ds.remove(ds.size() - 1);
            }
        }
    }
}
