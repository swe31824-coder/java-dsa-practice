public class Palindrome{
    public static void main(String[]args){
        int num=121;
        int reverse=0;
        int rem;
        int original=num;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(original==reverse){
            System.out.println(original+" is a palindrome number");
        }else{
            System.out.println(original+" is not a palindrome number");
        }
    }
}