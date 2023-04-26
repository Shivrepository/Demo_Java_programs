public class else_if_ladder {
    static boolean service_flag ;
    static boolean rebalance_flag;
    static boolean maintenance_flag=true;
    static boolean agency_flag;
    static boolean missing_flag;
    static boolean stolen_flag;
    static boolean battery_flag;

    static boolean iot_flag;
    static boolean unavailable_flag;
    public void single_events()
    {
        if(service_flag==true)
        {
            System.out.println("service start");
        }
        else if(service_flag==false)
        {
            System.out.println("service end");
        }
        if(rebalance_flag==true)
        {
            System.out.println("rebalance_pick_up");
        }
        else if(rebalance_flag==false)
        {
            System.out.println("provider_drop_off, unspecified");
        }
        if(maintenance_flag==true)
        {
            System.out.println("maintenance_pick_up");
        }
        else if(maintenance_flag==false)
        {
            System.out.println("provider_drop_off,unspecified");
        }
        if(agency_flag==true)
        {
            System.out.println("agency_pick_up");
        }
        else if(agency_flag==false)
        {
            System.out.println("agency_drop_off,unspecified");
        }

        if (missing_flag==true)
        {
            System.out.println("missing");
        }
        else if(missing_flag==false)
        {
            System.out.println("located");

        }
        if(stolen_flag==true)
        {
            System.out.println("missing");
        }
        else if (stolen_flag==false)
        {
            System.out.println("located");
        }
        if (battery_flag==true)
        {
            System.out.println("battery_low");
        }
        else if (battery_flag==false)
        {
            System.out.println("battery_charged,off_hours");
        }
        if (iot_flag==true)
        {
            System.out.println("comm_lost");
        }
        else if (iot_flag==false)
        {
            System.out.println("comms_restored,unspecified");
        }
        if (unavailable_flag==true)
        {
            System.out.println("unspecified");
        }
        else if(unavailable_flag==false)
        {
            System.out.println("unspecified");
        }
    }

    public static void main(String[] args) {
        else_if_ladder flags = new else_if_ladder();
        flags.single_events();
    }
}
