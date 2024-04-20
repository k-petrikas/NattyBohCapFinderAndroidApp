NattyBohCapFinderAndroidApp readme file

**what the project is about**
Natty Boh Cap Finder is an application dedicated to being able to input numbers of natty Boh caps and get the answers to the riddles of the caps by looking them up in a hashmap

Design:
- application runs on android native code (java). it takes a .txt file of numbers related to answers, parses though the file and stores them in a hashmap
- application then has input fields so users can enter in valid cap numbers and search for the answers

how to run application:
- import project into android studio
- run build.gradle 
- start up a local android device
- run application "app" on device



Quick notes for continued updates:
- moved unit tests to roboletric, seems to work very well 
- had to update all unit tests to new junit version
- updated compile SDK version for application (which took quite a while) 