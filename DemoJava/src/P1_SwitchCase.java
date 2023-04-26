// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class P1_SwitchCase {

        static int a= 11
                ;

        public void Assignment()
        {
            System.out.println("Sequence of Month On Number Basis");
            switch(a)
            {
                case 1 : System.out.println(" 1 - January");  break;
                case 2 : System.out.println(" 2 - February"); break;
                case 3 : System.out.println(" 3 - March");    break;
                case 4 : System.out.println(" 4 - April");    break;
                case 5 : System.out.println(" 5 - May");      break;
                case 6 : System.out.println(" 6 - June");     break;
                case 7 : System.out.println(" 7 - July");     break;
                case 8 : System.out.println(" 8 - August");   break;
                case 9 : System.out.println(" 9 - September");break;
                case 10: System.out.println(" 10- October"); break;
                case 11: System.out.println(" 11- November"); break;
                case 12: System.out.println(" 12- December"); break;
                default: System.out.println("Not Exist");     break;
            }
        }
        public static void main(String []args) {
           new P1_SwitchCase().Assignment();
        }



    }

