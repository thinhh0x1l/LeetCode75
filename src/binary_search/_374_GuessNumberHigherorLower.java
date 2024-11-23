package binary_search;

public class _374_GuessNumberHigherorLower {
    int guess(int num){
        return 1;
    }
    public int guessNumber(int n) {
        int left = 1;
        while(left < n){
            int mid = left + (n-left)/2;
            if(guess(mid)<=0)
                n = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
