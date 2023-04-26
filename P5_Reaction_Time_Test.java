import java.util.Arrays;

public class P5_Reaction_Time_Test {
    static String is_Reaction_time_test="true";
    static String Tab = "Reaction Time Test";
    static String Reaction_time_test="true";
    static String Monday="true",Tuesday="true",Wednesday="false",Thursday="true",Friday="true",Saturday="true",Sunday="false";
    static String first_slot_time_set= "true";
    static String Add_hours= "true";
    static String second_slot_time_set = "true";
    public void m1(){
        if(is_Reaction_time_test == "true"){
            System.out.println("In Fleets module Reaction_Time_Test Tab should appeared");
            if(Tab.equalsIgnoreCase("Reaction Time Test")){
                System.out.println("It should be displayed Reaction Time Test section with Heading=Reaction Time Test,info tip and Reaction Time Test toogle");
                if(Reaction_time_test=="true") {
                    System.out.println("It should be displayed the details of Reaction time test setting section as follows:\n"+
                            "a) Description\n"+
                            "b) Note with running Organization local time \n"+
                            "c) Day and Time settings\n" +
                            "d) Fields with text box:\n" +
                            "  * Minimum number of correct answers \n" +
                            "  * Minimum % of correct answers\n" +
                            "  * Maximum test attempts \n" +
                            "  * Lockout period (in minutes)\n" +
                            "e) Save Button");
                    if(Monday=="true"||Tuesday=="true"||Wednesday=="true"||Thursday=="true"||Friday=="true"||Saturday=="true"||Sunday=="true"){
                        System.out.println("The time slot dropdown and Add Hours button should be appeared");

                            if(Add_hours=="true"){
                                System.out.println("The second slot dropdown should be appeared");
                                }
                            else{
                                System.out.println("The second slot dropdown should not be appeared");
                            }
                    }
                    else{
                        System.out.println("Slot dropdowns should not be appeared");
                    }
                }
                else{
                    System.out.println("It should not be displayed the Reaction time test setting section");
                }
            }
            else{
                System.out.println("It should not be displayed Reaction Time Test section");
            }
        }
        else{
            System.out.println("In Fleets module Reaction_Time_Test Tab should not be appeared");
        }
    }

    public static void main(String[] args) {
        P5_Reaction_Time_Test obj = new P5_Reaction_Time_Test();
        obj.m1();
    }
}
