package com.cit_android.riteshslider;

import android.content.SharedPreferences;

/**
 * Created by cit_android on 18/4/17.
 */

public class Appconstant {

     /*http://androidtutorialsrkt.blogspot.in/2014/12/sharedpreferences-example-in-android-in.html*/
    /*http://androidtutorialsrkt.blogspot.in/2014/12/sharedpreferences-example-in-android-in.html*/
    /*http://androidtutorialsrkt.blogspot.in/2014/12/sharedpreferences-example-in-android-in.html*/

    public static SharedPreferences mPrefs = null;
    public static final String islogin = "islogin";                // for saving the login status
    public static final int MODE = 0;                              //sharedpreference mode set to private
    public static SharedPreferences.Editor editor;                // editor
    public static SharedPreferences sh;             // sharedpreference variable
    public static String str_login_test;                         // for checking the value of islogin in splash screen
    public static String str_login_usertype;                         // for checking the value of usertype in splash screen
    public static final String MyPREFERENCES = "myprefe";
}
