# getfit

Instructions for set-up

We are using the google calendar api, so you will have to 
provide your SHA1 fingerprint to the API. To do this, 
follow steps 1 and 2 on the following tutorial: 
https://developers.google.com/google-apps/calendar/quickstart/android

When choosing the package name (step 2.g), enter com.teambarb.getfit 
instead of com.example.quickstart. 

If you are using windows, enter the following in the commandline instead
of what is provided in step 1:
> "C:\Program Files\Java\jdk1.8.0_102\bin\keytool.exe" -exportcert -alias androiddebugkey -keystore C:\Users\Benjamin\.android\debug.keystore -list -v
You will only need to substitute your own paths for debug.keystore and keytool.exe. 
They should be in analogous locations to the ones shown here. 

Following these configuation steps, you should be able to use the 
application. Otherwise, you will get an error explaining that the app
has not been authenticated with the API. 

When using the application for the first time, you will need to sign on. 
We created sample google account for use with testing this app: 
Username: getfittester@gmail.com
Password: getfit1234




