import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number that want convert to string: ");
            int number = scanner.nextInt();
            int ones;
            int tens;
            int hundreds;
            String onesStr="";
            String tensStr="";
            String hundredsStr="";
            String result="";
            if (number > 999) {
                System.out.println("out of ability");
            } else if (number >= 0 && number < 10) {
                switch (number) {
                    case 0:
                        result="zero";
                        break;
                    case 1:
                        result = "one";
                        break;
                    case 2:
                        result = "two";
                        break;
                    case 3:
                        result = "three";
                        break;
                    case 4:
                        result = "four";
                        break;
                    case 5:
                        result = "five";
                        break;
                    case 6:
                        result = "six";
                        break;
                    case 7:
                        result = "seven";
                        break;
                    case 8:
                        result = "eight";
                        break;
                    case 9:
                        result = "nine";
                        break;
                }
            } else if (number >= 10 && number < 20) {
                switch (number){
                    case 10:
                        result="ten";
                        break;
                    case 11:
                        result="eleven";
                        break;
                    case 12:
                        result="twelve";
                        break;
                    case 13:
                        result="thirteen";
                        break;
                    case 14:
                        result="fourteen";
                        break;
                    case 15:
                        result="fifteen";
                        break;
                    case 16:
                        result="sixteen";
                        break;
                    case 17:
                        result="seventeen";
                        break;
                    case 18:
                        result="eighteen";
                        break;
                    case 19:
                        result="nineteen";
                        break;
                }
            } else if (number>=20 && number<100){
                ones=number%10;
                tens=number/10;
                switch (tens){
                    case 2:
                        tensStr="twenty";
                        break;
                    case 3:
                        tensStr = "thirty";
                        break;
                    case 4:
                        tensStr = "forty";
                        break;
                    case 5:
                        tensStr = "fifty";
                        break;
                    case 6:
                        tensStr = "sixty";
                        break;
                    case 7:
                        tensStr = "seventy";
                        break;
                    case 8:
                        tensStr = "eighty";
                        break;
                    case 9:
                        tensStr = "ninety";
                        break;
                }
                switch (ones){
                    case 0:
                        onesStr="";
                        break;
                    case 1:
                        onesStr="one";
                        break;
                    case 2:
                        onesStr="two";
                        break;
                    case 3:
                        onesStr = "three";
                        break;
                    case 4:
                        onesStr = "four";
                        break;
                    case 5:
                        onesStr = "five";
                        break;
                    case 6:
                        onesStr = "six";
                        break;
                    case 7:
                        onesStr = "seven";
                        break;
                    case 8:
                        onesStr = "eight";
                        break;
                    case 9:
                        onesStr = "nine";
                        break;
                }
                result=tensStr +" "+ onesStr;
            } else {
                ones=(number%100)%10;
                tens=(number%100)/10;
                hundreds=number/100;
                switch (hundreds){
                    case 1:
                        hundredsStr="one";
                        break;
                    case 2:
                        hundredsStr="two";
                        break;
                    case 3:
                        hundredsStr = "three";
                        break;
                    case 4:
                        hundredsStr = "for";
                        break;
                    case 5:
                        hundredsStr = "five";
                        break;
                    case 6:
                        hundredsStr = "six";
                        break;
                    case 7:
                        hundredsStr = "seven";
                        break;
                    case 8:
                        hundredsStr = "eight";
                        break;
                    case 9:
                        hundredsStr = "nine";
                        break;
                }
                if (tens==1){
                    switch (ones){
                        case 0:
                            tensStr="ten";
                            break;
                        case 1:
                            tensStr="eleven";
                            break;
                        case 2:
                            tensStr="twelve";
                            break;
                        case 3:
                            tensStr="thirteen";
                            break;
                        case 4:
                            tensStr="fourteen";
                            break;
                        case 5:
                            tensStr="fifteen";
                            break;
                        case 6:
                            tensStr="sixteen";
                            break;
                        case 7:
                            tensStr="seventeen";
                            break;
                        case 8:
                            tensStr="eighteen";
                            break;
                        case 9:
                            tensStr="nineteen";
                            break;
                    }
                } else {
                    switch (tens){
                        case 2:
                            tensStr="twenty";
                            break;
                        case 3:
                            tensStr = "thirty";
                            break;
                        case 4:
                            tensStr = "forty";
                            break;
                        case 5:
                            tensStr = "fifty";
                            break;
                        case 6:
                            tensStr = "sixty";
                            break;
                        case 7:
                            tensStr = "seventy";
                            break;
                        case 8:
                            tensStr = "eighty";
                            break;
                        case 9:
                            tensStr = "ninety";
                            break;
                    }
                }
                switch (ones){
                    case 0:
                        onesStr="";
                        break;
                    case 1:
                        onesStr="one";
                        break;
                    case 2:
                        onesStr="two";
                        break;
                    case 3:
                        onesStr = "three";
                        break;
                    case 4:
                        onesStr = "four";
                        break;
                    case 5:
                        onesStr = "five";
                        break;
                    case 6:
                        onesStr = "six";
                        break;
                    case 7:
                        onesStr = "seven";
                        break;
                    case 8:
                        onesStr = "eight";
                        break;
                    case 9:
                        onesStr = "nine";
                        break;
                }
                if (tens==1) {
                    result = hundredsStr+" hundred " + " and " + tensStr;
                } else if (tens==0 && ones==0){
                    result=hundredsStr+" hundred";
                } else {
                    result=hundredsStr+" hundred "+ " and "+tensStr+" "+onesStr;
                }
            }
            System.out.println(result);
        }
    }
}
