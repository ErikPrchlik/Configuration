# Configuration and University application
As part of the project for the subject project, I was given the task Configuration for a university application. It's only an android project that I can share because of know-how. But besides this project, I worked on two other projects. Widgets for university application as a practical part of my final bachelor's thesis. The second is the refactoring of the map module of the university application for master's studies. When I can't show the codes, I'd like to at least describe them and show the visualizations.

# Widgets
For my bachelor's thesis, I decided to create a widget that will be part of the university application as a daily helper for students. The widget themes were chosen by the most used modules. The most important are the menu and schedule widgets. Todo has not been used as expected, so we wanted to support this module by creating a widget.

<p align="middle">
  <img src='https://github.com/ErikPrchlik/Configuration/blob/main/gifs/add.gif' width='230'>
  <img src='https://github.com/ErikPrchlik/Configuration/blob/main/gifs/food.gif' width='230'> 
  <img src='https://github.com/ErikPrchlik/Configuration/blob/main/gifs/roz.gif' width='230'> 
  <img src='https://github.com/ErikPrchlik/Configuration/blob/main/gifs/todo.gif' width='230'>
</p>

The data were collected and stored by the Firebase real-time database and some of them also by the ROOM database. The biggest problem with this work lies in updating the views on the home screen of the device. Widgets are event-driven, meaning they catch incoming events and react based on them. The specifics of the menu is that it needs real-time data from Firebase that comes from other students who have rated the meals.

# Map modul refactoring
The most complex model of the university application was also the oldest. That's why we decided to refactor the code, use newer technologies and improve the logic and efficiency of the code. This part of the application was written in Java, so we decided to follow the development direction of this application and used the Kotlin programming application. We also changed database technologies from Firebase real-time databases and ROOM to ROOM again, but this time with a combination of REST API managed by the Retrofit library. As always, we strictly followed the principles of MVVM architecture and added technology to take care of dependency injection, Koin. Last but not least, the newer library of google map utilities was used, which allowed us to work more efficiently with the outdoor and indoor layers of the map to improve the user experience.

https://github.com/ErikPrchlik/Configuration/assets/34059320/8ab04a0f-a150-4cea-abf2-00a733037682


