# TeachMeSkills_C27_Lesson_25_HW
Homework for lesson #25

1. **Task #1**

A web-application has been written in which, when going to the URLs: "/minsk", "/washington" and "/beijing", the following result is displayed: time in Minsk, time in Washington and time in Beijing, respectively.
Web-app contains:
- Servlet classes:
- **"BeijingTimeServlet"** - to display the current time in Beijing. Contains **"doGet"** method for processing GET-requests;
- **"MinskTimeServlet"** - to display the current time in Minsk. Contains **"doGet"** method for processing GET-requests;
- **"WashingtonTimeServlet"** - to display the current time in Washington. Contains **"doGet"** method for processing GET-requests.
- **"web.xml"** file which is configured, **"servlet/servlet"** and **"servlet-mapping/servlet-mapping"** are added to it;
- **"index.jsp"** file which was created to display the welcome-page that is displayed when entering the main page of the web-application.
**"WebServlet"** annotations have also been added to servlet classes.

2. **Task #2**

 A web-application has been written in which, we create a servlet that takes age as input and returns information about adulthood in the response.
 Web-app contains:
 - Servlet class **"AgeVerificationServlet"** for checking majority by age. Contains **"doPost"** method for processing POST-requests;
 - Validator class **"AgeValidator"** for checking adulthood by age. Contains **"validateAge"** method that checks and returns adult status.
 - **"web.xml"** file which is configured, **"servlet/servlet"** and **"servlet-mapping/servlet-mapping"** are added to it.
**"WebServlet"** annotation have also been added to servlet class.



