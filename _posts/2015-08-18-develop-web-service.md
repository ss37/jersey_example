---
layout: post
title: Develop a Web Service
---

Your project hierarchy will appear as follows in Eclipse:
![Image for Screenshot_16](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_16.png "Screenshot_16")

Create a new class `DemoRest` in package `com.example.rest` and enter the code as shown in the screenshot.
![Image for Screenshot_17](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_17.PNG "Screenshot_17")
For now, you have created a simple web service that displays a plain-text response `Hello World!` on the web browser, when the request is sent.

Add the following code snippet in `WebContent->WEB-INF->web.xml`. This makes sure that all the appropriate requests are sent to the classes in the package com.example.rest.
![Image for Screenshot_18](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_18.png "Screenshot_18")
