---
layout: post
title: Run and Test the Web Service
---

To test your web service, simply add the project in the server and start the server. I have used Tomcat 7 for this project.

Make sure the `Server` window is visible in Eclipse. If not then go to `Eclipse->Window->Show View->Other...->Server`.

Add a new server - `Apache Tomcat v7.0 server` and make sure you have the corresponding version of the `server runtime environment` configured.

Then add the project `jersey_example` to this new server and click on `Start` button. Open up your favorite browser and click on the following link:
`http://localhost:8080/jersey_example/rest/demo/helloworld`

You will see `Hello World` displayed in the browser.
![Image for Screenshot_19](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_19.png "Screenshot_19")