package com.company;

public class ErrorLog {

    private String machineId;
    private String description;


    public ErrorLog(String message) {
        int x = message.indexOf(":");
        machineId = message.substring(0,x);
        description = message.substring(x+1);
    }


    public boolean containsKey(String keyword) {
        int z = description.indexOf(keyword);
        if (z == -1){
            return false;
        }
        else if (z ==0){
            String x = description.substring(keyword.length(), keyword.length()+1);
            return (x.equals(" "));

        }
        else return true;
    }

    public String getMachineId() { return machineId;}
    public String getDescription() { return description; }

    public static void main(String[] args) {
        ErrorLog er1 = new ErrorLog("CLIENT2:security alert");
        ErrorLog er2 = new ErrorLog("Webserver:disk offline");
        ErrorLog er3 = new ErrorLog("SERVER22:file not found on disk3");
        ErrorLog er4 = new ErrorLog("SERVER15:read error on disk DSK7");
        ErrorLog er5 = new ErrorLog("SERVER22:write error on disk");
        ErrorLog er6 = new ErrorLog("Webserver:error on /dev/disk");
        ErrorLog er7 = new ErrorLog("Webserver:disk");
        System.out.println();

        System.out.println("containsKey:");
        System.out.println("message 1 " + er1.containsKey("disk")); //false
        System.out.println("message 2 " + er2.containsKey("disk")); //true
        System.out.println("message 3 " + er3.containsKey("disk")); //false
        System.out.println("message 4 " + er4.containsKey("disk")); //true
        System.out.println("message 5 " + er5.containsKey("disk")); //true
        System.out.println("message 6 " + er6.containsKey("disk")); //false
        System.out.println("message 6 " + er6.containsKey("error"));//true
        System.out.println("message 7 " + er7.containsKey("disk")); //true


    }

}