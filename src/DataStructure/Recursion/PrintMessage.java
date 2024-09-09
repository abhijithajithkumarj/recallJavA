package DataStructure.Recursion;

public class PrintMessage {

    public static void main(String[] args) {

//
//        System.out.println(
//                fibonacci(8));
//        int[] arr ={2,6,8,10,85,225,236,963,7412,96321};
//        int target=10;
//        System.out.println(search(arr,target,0, arr.length-1));

//        fun(8);

        System.out.println(
                palindrome(121));

        System.out.println(sum);

    }


    static  int fibonacci(int n){
        if (n<2){
            return n;
        }
        System.out.println(n);
        return  fibonacci(n-1) + fibonacci(n-2);
    }

     static void  print (int n){
     if (n==5){
       System.out.println(n);
       return;}


      System.out.println(n);
      print(n+1);
     }



    static int search(int [] arr, int target,int s, int e){
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (target==arr[m]){
            return m;
        }
        if (target<arr[m]){
           return  search(arr,target,s,m-1);
        }
        return search(arr,target, m+1,e);
    }

    static void fun(int n){
        if (n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    static int  factorial(int n){
        if (n==0){
            return 1;
        }

        return n * factorial(n-1);


    }


    static int sunOfDigit(int n){

        if (n==0){
            return 0;
        }
        return (n% 10) + sunOfDigit(n/10);
    }



    static int sum=0;

    static void reverseTheNumber(int n){
        if (n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverseTheNumber(n/10);
    }


    static  boolean  palindrome(int n){
        reverseTheNumber(n);
        return n==sum;
    }



}
