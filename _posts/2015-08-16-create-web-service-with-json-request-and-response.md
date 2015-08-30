---
layout: post
title: Create Web Service with JSON Request/Response
---

In large-scale web applications, you would typically be receiving and sending data in XML or JSON format across the web.  
Make sure you are using Java6+ when you are creating web services that send JSON/XML responses. The annotation `@XmlRootElement` ensures that your POJO can be serialised into a JAX-RS response.  
You can change the settings in the `Java Build Path` of the project by choosing the appropriate `JRE System Library`.
  ![Image of Screenshot_20](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_20.png "Screenshot_20")  
  
Next, create a `Plain-Old Java Object (POJO)` class using which you can encase your response data. For demonstration, I have created a `Person` object with `id`, `firstName`, and `lastName` as its attributes.  
  ![Image of Screenshot_21](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_21.png "Screenshot_21")  
  
Now create a JAX-RS that can send a Person object in JSON format. For this, you need to use the annotation `@Produces` to specify the type of response-data that is sent.  
  ![Image of Screenshot_22](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_22.PNG "Screenshot_22")  
  
When you click on the web browser the following link, you will be able to see the Person object data:  
  `http://localhost:8080/jersey_example/rest/demo/getPerson`  
  ![Image of Screenshot_23](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_23.png "Screenshot_23")  
  
  
Now you can receive an updated Person object using `@Consumes` annotation. Just add the `updatePerson` method in `DemoRest` class.  
  ![Image of Screenshot_24](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_24.png "Screenshot_24")  
  
Sometimes, you may want to change the name of the property of the Person object in JSON format. By default, the properties are named in the way the attributes are named. You can override it with the help of `@XmlElement` annotation.  
  ![Image of Screenshot_25](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_25.png "Screenshot_25")  
  
Now to test your web service, you can use **RESTClient add-on for Mozilla Firefox**. You can type in the link for sending the request to the web service, enter the JSON request in the `Body of Request`, and select `Headers` as `application/json`. You will then be able to see the Person object data that you sent from the browser on the Eclipse console.  
  ![Image of Screenshot_26](https://raw.githubusercontent.com/ss37/jersey_example/gh-pages/public/images/screenshot_26.png "Screenshot_26")  
  
  
  
You can try and download a working project from [my Github account](https://github.com/ss37/jersey_example).  
