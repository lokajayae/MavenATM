# SONARQUBE EXPLORATION ASSIGNMENT

## Desciption
Test secara automatisasi dengan menggunakan SonarQube dan Code Coverage menggunakan JUnit dan Jacoco. Software Under Test (SUT) merupakan aplikasi ATM lebih khususnya pada fitur Cash Withdrawal.

## Prerequisite
- JAVA JDK 11
- Maven 3.X
- SonarQUbe
- SonarScanner for Maven

## Instalation and Environment
- [Maven](https://maven.apache.org/install.html)
- [SonarQube](https://docs.sonarqube.org/latest/setup/install-server/)
- [Sonarscanner](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/)

## Run the Test
```
mvn test
```

## Deploy the Test to SonarQube
```
mvn clean install
mvn clean verify sonar:sonar -D sonar.login=myToken
```

## Test Result
- Number of Test Case : Not Available
- Pass : Not Available
- Fail : Not Available
- Code Coverage : Not Available