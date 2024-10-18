package MyWork.LeetCode;

public class ConvertToTitle {
    public static void main(String[] args) {

        System.out.println(convertToTitle(70152)); // Output: "ZY"
    }



    public  static  String convertToTitle(int num){
        StringBuffer stringBuffer=new StringBuffer();


        while (num>0){
            int remainder= (num-1) % 26;
            System.out.println(remainder+"----------");
            char currentChar;


            currentChar=(char) ('A'+remainder);
            stringBuffer.append(currentChar);

           num=(num-1)/26;

        }

        System.out.println(stringBuffer+"------------------------------------------");

        return stringBuffer.reverse().toString();
    }
}
