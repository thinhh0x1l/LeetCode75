package two_pointers;

public class _392_IsSubsequence {
    /** Solved **/
    public boolean isSubsequence(String s, String t) {

        int iS =0, iT = 0;
        char[] cS = s.toCharArray();
        char[] cT = t.toCharArray();
        while(iT < t.length()&& iS < s.length()){
            if(cS[iS] == cT[iT])
                iS++;
            iT++;
        }
        return iS >= s.length();
    }
    /** Solved **/
}
