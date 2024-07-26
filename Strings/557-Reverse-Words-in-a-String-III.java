class Solution {
    public String reverseWords(String s) {
        char Arr[] = s.toCharArray();
        int len = Arr.length;
        int start = 0;
        for(int end = 0 ; end<=len;end++){
            if(end == len || Arr[end]==' '){
                reverse(Arr,start,end-1);
                start=end+1;
            }
        }
        return new String(Arr);
    }
    public void reverse(char arr[], int i, int j){
        while(i < j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}