This is a java project created using Eclipse. This project contains a code that will be loaded and executed at runtime by DynamicClassLoading Android app.

In the DynamicCode_Java/gen/ folder there are two jar files: 
1. HiddenBehavior.jar contains the .class file
2. dexHiddenBehavior.jar is the jar file that will be used by DynamicClassLoading to download the code. This jar file contains classes.dex file

## If you change the code in the DynamicCode_Java/src/edu/uci/seal/icc/HiddenBehavior.java, for example to include more ICC attacks, you need to create two new jar files as follows:

### Create HiddenBehavior.jar
- Build the project using Java 1.7 not 1.8. If you are using Eclipse, you can change that from the properties of the project
- From Eclipse (File -> Export-> JAR Files) then follow the instructions. Read [this](https://www.cs.utexas.edu/~scottm/cs307/handouts/Eclipse%20Help/jarInEclipse.htm) for more information
- From a command line: jar cvfm HiddenBehavior.jar manifest.txt *.class. Read [this](http://www.skylit.com/javamethods/faqs/createjar.html) for more information

### Create dexHiddenBehavior.jar
- Use "dx" command tool to create this jar file. dx can be found at "android-sdk/ build-tools/[version number]/dx". Then run the following command:
dx --dex --output= dexHiddenBehavior.jar path/to/HiddenBehavior.jar

### Push dexHiddenBehavior.jar to the emulator using this command:
adb push path/to/dexHiddenBehavior.jar destination-path-on-emulator

### Change the path in the [DynamicClassLoading app](https://github.com/mhammad2/DynamicClassLoading/blob/master/app/src/main/java/edu/uci/seal/dynamic/MainActivity.java) to the destination-path-on-emulator that you specified in the previous step
