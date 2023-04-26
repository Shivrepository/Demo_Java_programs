public class P4_Flag_Filter {

    //"In_Service","Rebalance_Pickup","Maintenance_Pickup","Agency_Pickup","Missing","Battery_Critical","Unavailable","Stolen","IoT_Fault","Rented"
    static String allFlags[] = {"Unavailable","Stolen","IoT_Fault","Rented"};
    public void V_flags_filter() {
        for (String flags : allFlags) {

             if (flags.equalsIgnoreCase("In_Service")) {
                System.out.println("Show In Service vehicles");
            } else if (flags.equalsIgnoreCase("Rebalance_Pickup")) {
                System.out.println("Show Rebalance Pickup vehicles");
            } else if (flags.equalsIgnoreCase("Maintenance_Pickup")) {
                System.out.println("Show Maintenance_Pickup vehicles");
            } else if (flags.equalsIgnoreCase("Agency_Pickup")) {
                System.out.println("Show Agency_Pickup vehicles");
            } else if (flags.equalsIgnoreCase("Missing")) {
                System.out.println("Show Missing vehicles");
            } else if (flags.equalsIgnoreCase("Battery_Critical")) {
                System.out.println("Show Battery_Critical vehicles");
            } else if (flags.equalsIgnoreCase("Unavailable")) {
                System.out.println("Show Unavailable vehicles");
            } else if (flags.equalsIgnoreCase("Stolen")) {
                System.out.println("Show Stolen vehicles");
            } else if (flags.equalsIgnoreCase("IoT_Fault")) {
                System.out.println("Show IoT_Fault vehicles");
            } else if (flags.equalsIgnoreCase("Rented")) {
                System.out.println("Show Rented vehicles");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public static void main(String[] args) {
        new P4_Flag_Filter().V_flags_filter();
    }
}
