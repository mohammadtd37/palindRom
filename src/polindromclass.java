import java.util.Scanner;

public class polindromclass {
    int counter =0;
    int revers1= 0 ;
    int i = 0;
    int revers = 0;
    int revers3 =0 ;
    public void   revers () {
        Scanner palindrom = new Scanner(System.in);
        int temp = palindrom.nextInt(); // vorodi
        //revers number
        int number = temp;
        while (number !=0) {
            revers = number % 10;
            revers1 = (revers1 * 10) + revers;
            number/=10 ;
            counter++ ;
        }
        System.out.println("revers  your number = "+revers1);
        System.out.println("counter your number = "+ counter);
        revers1 = temp ;
    }
    public void palindrom(){
        System.out.println("chek palindrom hard");
        if (counter%2==1 ){System.out.println("this number is not palindrom hard ");}
        else {
            int revers2 = 0 ;
            int temp2 =  revers1 ;
           while (i<counter/2){
                 revers2 = temp2 % 10;
                 revers3 = (revers3 * 10) + revers2;
                 temp2/=10;
                i++;
            }
            System.out.println("palindrom half= "+ revers3);
            int go = 0 ;
            int temp3 = revers1 ;
           while (go < counter/2){
               temp3/=10 ;
               go ++ ;}
            System.out.println( );
           if (temp3==revers3){System.out.println("yess this is the palindrom horra "+ temp3 +"=="+revers3 );}
           else System.out.println("nooooooooback revers = "+temp3+"!=" + revers3 );}
        }
    }

