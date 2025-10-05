
project 생성하고, 웹 jsp도 사용할 수 있게 하려면 아래 jsp 경로를 생성해주면 됨.
SRC 안에 있어야함.

# jsp 경로
src/main/webapp/WEB-INF/views/

# JSP 인식 시키는 법
pom.xml에 해당 내용 추가
```
<dependencies>
    <!-- JSP 엔진 -->
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>

    <!-- JSTL -->
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>

    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>

```

# JSP 뷰 리졸버(View Resolver) 명시
src/main/resources/application.properties 이 파일에 아래 내용 추가
```
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

# 세팅 된 프로젝트 구조
```
.
├── HELP.md
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── lst
│   │   │           └── user_management
│   │   │               ├── ServletInitializer.java
│   │   │               └── UserManagementApplication.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   ├── static
│   │   │   └── templates
│   │   └── webapp
│   │       └── WEB-INF
│   │           └── views
│   │               └── index.jsp
│   └── test
│       └── java
│           └── com
│               └── lst
│                   └── user_management
│                       └── UserManagementApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── lst
    │           └── user_management
    │               ├── ServletInitializer.class
    │               └── UserManagementApplication.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    └── test-classes
        └── com
            └── lst
                └── user_management
                    └── UserManagementApplicationTests.class

36 directories, 18 files
```

# 실행 명령어
```
./mvnw spring-boot:run

```