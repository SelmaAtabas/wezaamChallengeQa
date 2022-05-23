# Wezaam
This is a maven project and is built with Cucumber framework with Gherkin language.

1-Install Intellj Ide 2020.2
2-Install JDK 13.0.2
3- Install plugins Cucumber for Java , Gherkin and Junit
4- Add Dependencies
    Selenium
            <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                <artifactId>selenium-java</artifactId>
                <version>3.141.59</version>
            </dependency>
            
    WebdriverManager
            <dependency>
                <groupId>io.github.bonigarcia</groupId>
                <artifactId>webdrivermanager</artifactId>
                <version>4.1.0</version>
            </dependency>
     
    Cucumber java 
            <dependency>
                 <groupId>io.cucumber</groupId>
                 <artifactId>cucumber-java</artifactId>
                 <version>5.7.0</version>
             </dependency>
    Junit
            <dependency>
                        <groupId>io.cucumber</groupId>
                        <artifactId>cucumber-junit</artifactId>
                        <version>5.7.0</version>
                        <scope>test</scope>
                    </dependency>
                    <dependency>
                        <groupId>junit</groupId>
                        <artifactId>junit</artifactId>
                        <version>4.13</version>
                        <scope>test</scope>
                    </dependency>
    Cucumber report and html report
            <build>
                    <plugins>
                        <plugin>
                            <groupId>net.masterthought</groupId>
                            <artifactId>maven-cucumber-reporting</artifactId>
                            <version>5.0.0</version>
                            <executions>
                                <execution>
                                    <id>execution</id>
                                    <phase>verify</phase>
                                    <goals>
                                        <goal>generate</goal>
                                    </goals>
                                    <configuration>
                                        <projectName>Cucumber HTML Reports</projectName>
                                        <outputDirectory>${project.build.directory}</outputDirectory>
                                        <inputDirectory>${project.build.directory}</inputDirectory>
                                        <jsonFiles>
                                            <param>**/cucumber*.json</param>
                                        </jsonFiles>
                                    </configuration>
                                </execution>
                            </executions>
                        </plugin>
                    </plugins>
            
                </build>

About Test Steps
- Open https://www.facebook.com.
Define 3 test cases and automate two of them in login view.
1-It is about checking to create new account button.Because It is necessary to create a new account in order to login.
2-Checking Log in  button. It is necessary to use Facebook. 
3-Checking email and password box.It is necessary to login.Without these three important cases the user can not use facebook. So i choosed to validate them.These are smoke tests for an application.

Java Object Oriented Program was used for testing to seperate locators of elements and reusable methods.
You can run again failed test scenarios .Under the target folder you will see the reports. It has also screenshot and attachment.    