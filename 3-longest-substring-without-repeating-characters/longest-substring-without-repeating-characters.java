class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> CharSet = new HashSet<Character>();
        int maxSub = 0;
        int left =0;
        for (int right =0;right<s.length();right++){
            char currentChar = s.charAt(right);
            while(CharSet.contains(currentChar)){
                CharSet.remove(s.charAt(left));
                left++;
            }
            CharSet.add(currentChar);
            maxSub = Math.max(maxSub,right-left+1);
        }
        return maxSub;

        
        }
    }
    
