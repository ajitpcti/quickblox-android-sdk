package com.quickblox.snippets;

/**
 * Created by igorkhomenko on 7/9/14.
 */
public class ApplicationConfig {

    static boolean useUser1 = true;

    // prod
    //
    public static String AppID = "99";
    public static String AuthKey = "63ebrp5VZt7qTOv";
    public static String AuthSecret = "YavMAxm5T59-BRw";
    //
    public static String ServerApiDomain = "api.quickblox.com";
    public static String ServerChatDomain = "chat.quickblox.com";
    public static String ContentBucket = "qbprod";
    //
    public static int testUserID1 = 1647243;
    public static String testUserLogin1 = "igorquickblox9";
    public static String testUserPassword1 = "igorquickblox9";
    //
    public static int testUserID2 = 1647244;
    public static String testUserLogin2 = "igorquickblox91";
    public static String testUserPassword2 = "igorquickblox91";
    //
    public static String testRoomJID = "99_54424528535c12a13801b1fa@muc.chat.quickblox.com";




    public static int getTestUserID1(){
        return useUser1 ? testUserID1 : testUserID2;
    }
    public static String getTestUserLogin1(){
        return useUser1 ? testUserLogin1 : testUserLogin2;
    }
    public static String getTestUserPassword1(){
        return useUser1 ? testUserPassword1 : testUserPassword2;
    }
    public static String getTestUserPasswordForChat1() {
        return useUser1 ? testUserPassword1 : testUserPassword2;
    }

    public static int getTestUserID2(){
        return useUser1 ? testUserID2 : testUserID1;
    }
    public static String getTestUserLogin2(){
        return useUser1 ? testUserLogin2 : testUserLogin1;
    }
    public static String getTestUserPassword2(){
        return useUser1 ? testUserPassword2 : testUserPassword1;
    }
    public static String getTestUserPasswordForChat2() {
        return useUser1 ? testUserPassword2 : testUserPassword1;
    }
}
