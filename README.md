# Hero-Squad

 This is an App that allows users to select and recruit superheroes and assign each hero to a squad that well befits the hero. 

#### Getting Started

 These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

#### Prerequisites

You need to install the following softwares:
Java,
Spark,
Visual Studio Text Editor

#### Dependencies
Gradle , Velocity Template Engine, Junit

This is how to install the softwares required:

Installing gradle;

Download Gradle from the Gradle website.

Extract the downloaded file in the directory you'd like to install Gradle in. /usr/local/gradle is recommended, but not required. This should automatically create a subdirectory located at /usr/local/gradle/gradle-x.x ( x.x is simply a placeholder for the specific version of your Gradle download).

In the command line, add Gradle to your PATH variable with the command: export PATH=/usr/local/gradle/gradle-x.x/bin:$PATH. Again, replace x.x with the specific version of your Gradle download.

Installing Java;
Click wiki how's blog and follow instructions on how to install Java.  

run $ java -version to ensure everything is installed correctly.

#### Running the tests

This is how to run the tests;

We use JUnit to create tests to test the back-end logic of our App.
First we import the JUnit libraries [org.junit.Test, static org.junit.Assert.*]. Using the BDD process, we begin with the simplest behavior then run the first test. Once tests pass, then test through all the individual methods in the two classes, the Hero class and the Squad class.

Example for squad class;
Tests whether the squad object has been instantiated correctly, which returns true.

@Test
  public void Squad_instantiatesCorrectly_true() {
    Squad mySquad = new Squad("Knights", "18", "Defence");
    assertEquals(true, mySquad instanceof Squad);
  }  
 Example for Hero class;
 Tests whether the hero object has been instantiated correctly, which returns true.

 @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Vice", "26", "Wisdom", "Memory", 1);
    assertEquals(true, myHero instanceof Hero);
  }

  Once done with the tests, paste the file path provided for in the terminal as output, and check on the test report.


#### Deployment



#### Built With:

Java programming language,
Spark Framework- The front-end web framework,
Gradle - Dependency Management


#### Author

Peter Nyabuto

#### License

This project is licensed under the MIT License - see the LICENSE.md file for details

 