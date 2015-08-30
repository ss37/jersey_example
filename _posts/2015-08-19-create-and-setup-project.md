---
layout: post
title: Create and Setup Project in Eclipse
---

For this project I have used the following tools:

  1. Eclipse Luna
  2. Tomcat 7
  3. JRE and JDK for Java 7  


In Eclipse, create a new `Maven Project`. 
    ![Image for Screenshot_1](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_1.png "Screenshot_1")
  
For simplicity, check the box for `Create a simple project (skip archetype selection)`.
    ![Image for Screenshot_2](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_2.png "Screenshot_2")

Click on `Next` and make sure you enter the following details:  
  `Group Id: com.example`  
  `Artifact Id: jersey_example`  
  `Packaging: jar`  
  `Name: jersey_example`  
    ![Image for Screenshot_3](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_3.png "Screenshot_3")  
Click on `Finish` and you will have created a new Maven Project.  


Click on the project `jersey_example` that you have just created in the `Project Explorer`. Open `pom.xml`.
    ![Image for Screenshot_4](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_4.png "Screenshot_4")  


Now right click on the project `jersey_example` in the `Project Explorer` and open up its `Properties`. Click on `Project Facets` on the left pane of the `Properties` and click on `Convert to faceted form...` link on its right.
    ![Image for Screenshot_5](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_5.png "Screenshot_5")  


Make sure you check `Dynamic Web Module` and its version is `3.0`. You should be able to see a new link blink at the bottom of the `Properties` window saying `Further configuration available`.
    ![Image for Screenshot_6](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_6.png "Screenshot_6")  


A new popup will be shown as follows. Check the box for `Generate web.xml deployment descriptor` and click `OK`.
    ![Image for Screenshot_7](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_7.png "Screenshot_7")  


Once you click on `OK` the previous `Properties` window will be shown. Click on `OK` and reopen the `Properties` window of your project. Open the `Deployment Assembly`.
    ![Image for Screenshot_8](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_8.png "Screenshot_8")  


Click on `Add` and select `Java Build Path Entries` from the window that pops open.
    ![Image for Screenshot_9](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_9.png "Screenshot_9")  


Select `Maven Dependencies` and click on `Finish`.
    ![Image for Screenshot_10](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_10.png "Screenshot_10")  


The `Deployment Assembly` of your project will now look like this:
    ![Image for Screenshot_11](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_11.png "Screenshot_11")  

Now add all the following `Dependencies` in `pom.xml`:  

  1. `jersey-container-servlet v2.21`  
  2. `jersey-server v2.21`  
  3. `jersey-media-moxy v2.21`  
  

Make sure all the versions are the same - in case you get a new version. In order to add a `Dependency` in `pom.xml`, click on the tab `Dependencies` in `pom.xml`, and click on `Add` button. Enter the name of the dependency you want to add and you will see the following set of `Search Results`:
    ![Image for Screenshot_12](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_12.PNG "Screenshot_12")  

  > In case you do not get any indexed search results, go to *Eclipse->Windows->Preferences->Maven* and make sure the following items are checked:
  > * Download Artifact Sources
  > * Download Artifact JavaDoc
  > * Download repository index updates on startup
  > Apply these changes and restart your Eclipse. Based on the speed of the network connection, it will take longer time to display the search results.  


Your dependencies will now appear as follows:  
    ![Image for Screenshot_13](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_13.PNG "Screenshot_13")  


Right click on `pom.xml` in the `Project Explorer` and `Run As->Maven build`. Enter the build configuration goal as `clean install`. Also ensure `Update Snapshots`, `Debug Output` and `Skip Tests` are checked.  
    ![Image for Screenshot_14](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_14.png "Screenshot_14")  


When you click on `Run` and all goes well, you will see the following output in the `Console` - `BUILD SUCCESS`.
    ![Image for Screenshot_15](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_15.png "Screenshot_15")  


  > As you have downloaded all the required jars for building a Jersey based JAX-RS, you can now create a new sample web service. Maven makes it easy to download all the required jars in one place without you having to manually search and download and reference them for your projects. When you share your projects with other developers, all they need to do is to `Run` the `pom.xml` file and get all the required jars, without having to worry about downloading and mistakenly using different versions of jars.
