import java.util.ArrayList;
import java.util.List;

class ExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        ArrayList<Boolean> canAddExtra = new ArrayList<>();
        int largestNum = 0;

        for(int i=0;i<candies.length;++i){
            if(largestNum<candies[i]) largestNum = candies[i];
        }

        for(int j=0;j<candies.length;++j){
            if(candies[j]+extraCandies >= largestNum) canAddExtra.add(true);
            else canAddExtra.add(false);
        }

        return canAddExtra;
    }
}