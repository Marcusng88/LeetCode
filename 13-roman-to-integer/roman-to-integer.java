class Solution {
    public int romanToInt(String s) {
        int answ =0;
        int[] list = new int[s.length()];
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i)=='I'){
                list[i] = 1;
            }
            if (s.charAt(i)=='V'){
                list[i] = 5;
            }
            if (s.charAt(i)=='X'){
                list[i] = 10;
            }
            if (s.charAt(i)=='L'){
                list[i] = 50;
            }
            if (s.charAt(i)=='C'){
                list[i] = 100;
            }
            if (s.charAt(i)=='D'){
                list[i] = 500;
            }
            if (s.charAt(i)=='M'){
                list[i] = 1000;
            }

        }
        int j=0;
        while(j<list.length-1){
            if (list[j+1]>list[j]){
                answ = answ + list[j+1]-list[j];
                j = j+2;
            }
            else {
                answ =answ + list[j];
                j++;
            }
        }
        if (j < list.length) {
            answ += list[j];
        }

        return answ;
        
    }
}