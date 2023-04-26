import java.util.Scanner;

public class P2_User {
    static String Username = "tejal@joyride.city";
    static String Password = "Asdf@1234";
    static String Role = "fleetadmin";

    public void user_login(){

//Log in
        if(Username.equals("tejal@joyride.city") & Password.equals("Asdf@1234")){
                System.out.println("Login Successful");
//Permissions
              if(Role.equalsIgnoreCase("Admin")){
                System.out.println("Having following permissions:"+'\n'+"Analytics"+'\n'+"Org"+'\n'+"Map"+'\n'+"Fleets"+'\n'+"Geofence"+'\n'+"Vehicles"+'\n'+"Riders"+'\n'+"Rides"+'\n'+"Pricing"+'\n'+"Payment"+'\n'+"Setting");
            }
              else if(Role.equalsIgnoreCase("Fleetadmin"))
                {
                System.out.println("Having an following permissions:"+'\n'+"Analytics"+'\n'+"Map"+'\n'+"Fleets"+'\n'+"Geofence"+'\n'+"Vehicles"+"Setting");
            }
              else if (Role.equalsIgnoreCase("Fleetmanager")){
                System.out.println("Having an following permissions:"+'\n'+"Map"+'\n'+"Fleets"+'\n'+"Geofence"+'\n'+"Vehicles"+'\n'+"Setting");
            }
              else if (Role.equalsIgnoreCase("Citymanager")){
                System.out.println("Having an following permissions:"+'\n'+"Map"+'\n'+"Fleets"+'\n'+"Vehicles");
            }
              else if (Role.equalsIgnoreCase("Operator")){
                System.out.println("Having an following permissions:"+'\n'+"Analytics"+'\n'+"Map"+'\n'+"Fleets"+'\n'+"Vehicles"+'\n'+"Riders"+'\n'+"Rides"+'\n'+"Setting");
            }
              else if (Role.equalsIgnoreCase("Fleetoperator")){
                    System.out.println("Having an following permissions:" + '\n' + "Fleet" + '\n' + "Vehicles" + '\n' + "Setting");
                }
            }
//Error message-incorrect Username & Password
            else
            {
                if(Username!="tejal@joyride.city") {
                System.out.println("Login Failed : Incorrect Username");
                }
                else{
                    System.out.println("Login Failed : Incorrect Password");
                }
            }
        }

    public static void main(String[] args) {

        new P2_User().user_login();
    }
}
