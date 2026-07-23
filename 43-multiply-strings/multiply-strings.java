class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0") ) return "0";
        // num1 = 23, num2 = 41
        // num 23 * 41
        int[] arr= new int[num1.length()+num2.length()];
        Arrays.fill(arr,-1);

        // construct the array
        // [3,2]
        // [3,14,8]
        // [3,4,9]
        for(int i = num2.length() -1 ;i>=0; i--){
            int pos = num2.length()-1 -i;
            
            for(int j = num1.length()-1; j>=0; j--){
                int digit1 = num1.charAt(j)-'0';
                int digit2 = num2.charAt(i)-'0';
                if(arr[pos]==-1){
                    arr[pos] = 0;
                }
                arr[pos] += digit1*digit2;
                if(arr[pos]>9){
                    // int temp = arr[pos] % 10;
                    if(arr[pos+1]==-1){
                        arr[pos+1] = 0;
                    }
                    arr[pos+1] += arr[pos] / 10;
                    arr[pos] %= 10; 
                }
                // checkElement(arr);
                pos++;
            }
        }

        

        // calculate the result
        // 3 + 40 + 900 
        int initialPow = 0;
        int x = 0;
        StringBuilder res = new StringBuilder();
        while(x<arr.length && arr[x]!=-1){
            // System.out.println(arr[x]);
            res.insert(0, String.valueOf(arr[x]));
            System.out.println(res);

            x++;
        }
        return res.toString();
        
    }

    private static void checkElement(int[] num){
        int x = 0;
        while(x<num.length ){
            if(num[x]>9){
                // int temp = num[x] % 10;
                num[x+1] += num[x] / 10;
                num[x] %= 10; 
            }
            x++;
        }
    }
}