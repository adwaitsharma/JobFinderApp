JobFinderApp
============

This is a Job Finder Android Application which can search jobs on (ASP.NET website) based on the user and job location(using GPS),
the user can define the distance to search.

The data should have the latitude and longitude of the job location which is further used to calculate the distance.

Also, this app will use Google Map and connects with .NET Web Service using ksoap 

The results will be displayed in the tabular way and in Google maps.


Note: 
In order to access the GPS, you will have to add the permission in the AndroidManifest.xml file
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>

In order to be able to communicate with the web service
<uses-permission android:name="android.permission.INTERNET" />

