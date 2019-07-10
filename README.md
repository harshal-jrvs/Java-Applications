# Java Grep App
  ## Introduction
  This app tries to mimic Unix command called `grep` which stands for `global regular expression print`.This app searches for the text pattern or regular expression recursively in the given directory and output the matched  lines to a temp file.
  ## Usage
  To run the following app open up Intellij and click on edit configuration on top left of the IDE and type the argument `.*data.* /home/dev/jrvs/bootcamp/ /tmp/grep.out` in program parameters separated by space.
  ![image](https://user-images.githubusercontent.com/51926543/60534768-90eb9680-9cd0-11e9-839b-b329ef2b90ba.png)
  It searches all the files in `/home/dev/jrvs/bootcamp/`  directory , sub directory and looks for the key word data and output it to file located in tmp folder with the fine name of `grep.out`.
  ##### Note: You can also search for different keyword instead of data.
  ##### For Example: Lets say you have stored your password somewhere in the directory but you do not know where it is. Instead of opening all the file and checking if it is there which is time consuming, we can make use of this such application that will output the result in milliseconds by onlu chnaging the regex pattern to `.*password.*`.
The three armument that are passed are `regex rootPath, outFile`
##### regex
Regex stands for regular expression is a sequence of character that defines search pattern. Usually such pattern are used by String searching algorithm  for "find" or "find and replace" operation on Strings.
##### rootPath
Root directory path that need searching for your desired keyword.
##### outFile
The output from the result is directed to the file name of your choice and location instead of displaying on terminal.
  
  ## Design and Implementation
  You can talk about the following points
  - Pseudo code and workflow
  - Libraries
  - Diagrams
  ## Enhancements and Issues
  #### Enhancements
  1. Instead of searching all the files we can specify which file need to be search for example (.txt,. csv etc.), this would eliminate searching for irrelevant files and reduce time complexity.
  2. Implement features like `fgrep` which will search for a fixed string rather than regex pattern. 
  3.  Output the total matches found just like Google search.
  #### Issue
  4. Make sure to close the buffer reader by doing so it releases any system resources associated with it.  If you do not close the buffer reader it may cause memory leak.
  
  # Java JDBC App
  ## Introduction
  JDBC stands for Java Database Connectivity. This JDBC app uses Java API to connect and execute the query with the database. JDBC API uses JDBC driver to connect with database. By the help of JDBC API, we can save, create, update and fetch tabular data from the database.
  ## Design and Implementation
  You can talk about the following points
  - Ps eudo code and workflow
  - Libraries
  - Diagrams
  ## Enhancements and Issues
   #### Enhancements
  5. Use Connection Polling
  6. Use Stored Procedure
  7. Use Statement Polling
  8. Remove Auto-Commit 
  #### Issue
  9. The Docker image does not retain database information for the next time I want to work on.  
  # Twitter CLI App
  ## Introduction
  This application allows you to create, read and delete tweets on Twitter from terminal. This is similar to the postman app that uses `HTTP GET`,`HTTP POST`  to get information is JSON String . Twitter CLI app has three main features that user uses most of the time in real world. 
  - What does this app do?
  ## Usage
  - explain arguments and behaviour
  - usage examples
  ## Design and Implementation
  You can talk about the following points
  - Pseudo code and workflow
  - Libraries
  - Diagrams
  ## Enhancements 
  10. Allow multiple user to reuse this code with their credential to post, delete and show tweet.
  11. S


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE5NjEzNTg2NTMsLTE0MDY1ODc0OTgsLT
M3MTQ2OTI2OCwtMTQ1NjI5MTk5Niw2NDk0ODI1MTcsLTEyNjc5
MzI0MDQsLTEwODkyMzMzMTAsMTI1MjE2NjgxMSwtNjA3NzQ5Mz
I1LC0xOTk5Mzk2Njc1LDEyNTc0NzQwNjgsLTEwMzQ1NjgyNjYs
LTkyNDExODk0MywtMTgwMDA3Njg1NiwtMTA3NTQyOTQ2MSwtMj
AyMDA5MTkyOSwtMTc0MjIxNTA2OSwtNTI4ODU0MzEwLDE5Njk2
MTY2MjAsMTU3NzEwNzU5Ml19
-->