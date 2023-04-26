public class P3_Status_Filter {

    //"On_ride","Idle","Reserved","Not_Connected","Out of service","Pause"
                               //     0        1        2            3                4            5
        static String allStatus [] = {"Not_Connected","Out of service","Pause"};
        public void V_status_filter() {
            for (String status : allStatus) {

                if(status.isEmpty()) {
                    System.out.println("Listout all the vehicles");
                }
                else if(status.equalsIgnoreCase("On_ride")) {
                    System.out.println("Show On ride vehicles");
                }
                else if(status.equalsIgnoreCase("Idle")) {
                    System.out.println("Show Idle vehicles");
                }
                else if(status.equalsIgnoreCase("Reserved")) {
                    System.out.println("Show Reserved vehicles");
                }
                else if(status.equalsIgnoreCase("Not_connected")) {
                    System.out.println("Show Not connected vehicles");
                }
                else if(status.equalsIgnoreCase("Out of service")) {
                    System.out.println("Show Out of service vehicles");
                }
                else if(status.equalsIgnoreCase("Pause")) {
                    System.out.println("Show Pause vehicles");
                }
                else{
                    System.out.println("Invalid");
                }
            }
        }

        public static void main(String[] args) {

            new P3_Status_Filter().V_status_filter();
        }
}
