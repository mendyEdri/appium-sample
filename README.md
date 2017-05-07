# appium-sample


#### Downloading Appium


#### brew
If you don’t have brew installed – install via this command: (make sure you are NOT using sudo)
```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

Type this commands: 
```
1. $ brew install node                       
2. $ npm install -g appium 			  #get appium
3. $ npm install wd 				  #get appium client
4. $ appium & 				 	  #start appium
```
#### Download IntelliJ
https://www.jetbrains.com/idea/download/#section=mac

•	Install Xcode 8 from Mac app store

•	Download the command line build tools from Apple (Find/Search ‘Command Line Tools’ for you Xcode version), open the .dmg file -> double click the .pkg file and go through the installation process.

#### Install Java 8
http://www.oracle.com/technetwork/java/javase/downloads/index.html
Find the download link that fits your operating system


Open the .dmg file and double click on the .pkg file in the window has been open, go through the installation process.

#### Install Maven 

Type into terminal
```
$ brew install maven
```

#### Install libimobiledevice
```
$ brew install libimobiledevice
```

#### Install authorize-ios
```
$ npm install -g authorize-ios
# run authorize
$ authorize-ios
```

#### Install appium-doctor
```
$ npm install –g appium-doctor
#run appium-doctor with flag –-ios/--android to check if dependencies are met. i.e:
$ appium-doctor –ios
```

#### New Project: 

#### Install carthage
```
$ brew install carthage
```
###### Create Cartfile, navigate to the project path and run this command
```
$ touch Cartfile
```
###### Run update command
```
$ carthage update --platform iOS
```
###### Create Xcode build, navigate to your xcode proj folder and run this:
```
$ xcodebuild -sdk iphonesimulator
$ npm install -g ios-deploy
$ brew install carthage ./Scripts/bootstrap.sh –d
```
in path: /usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent


Navigate to: {your_user}/node_modules/appium/node_modules/appium-xcuitest-driver/	
```
$ install Scripts/bootstrap.sh –d
```





### Android: 
in Terminal, go to home directory:
```
$ cd ~
```
Check if you have .bash_profile file:


Check if you ANDROID_HOME is Defined:
```
$ open ~/.bash_profile
```	
	.bash_profile file
```
export ANDROID_HOME=/Users/{YOUR_PATH}/Library/Android/sdk
export ANDROID_SDK=$ANDROID_HOME
PATH=$PATH:/Applications/apache-ant-1.8.4/bin
PATH=$PATH:/usr/local/share/npm/bin/
PATH=$PATH:$ANDROID_HOME/build-tools
PATH=$PATH:$ANDROID_HOME/platform-tools
PATH=$PATH:$ANDROID_HOME/tools
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
export PATH
```


Create Appium sample project:
Appium Sample


