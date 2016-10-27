This is a java project created using Eclipse. This project contains a code that will be loaded and executed at runtime used by DynamicClassLoading Android app.

Steps to change the dynamically loaded code in the dexHiddenBehavior.jar file

1-	Change the code in the HiddenBehavior.java or create a new class. These classes should include the hidden ICC attacks
2-	Build the project using Java 1.7 not 1.8. If you are using Eclipse, you can change that from the properties of the project  
3-	Create a jar file from the Java project
4-	Change the .class file(s) in the JAR file to classes.dex file in a new JAR file. Use dx command tool to do that. dx can be found at android-sdk/ build-tools/[version number]/dx. Use the following jar file 
dx --dex --output= dexHiddenBehavior.jar /Users/Mahmoud/Documents/eclipseWorkspace/DynamicCode/gen/HiddenBehavior.jar
push the new jar file to the emulator using this command:
adb push <file-source-local> <destination-path-remote>
