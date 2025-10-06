
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

# DB
```
postgresql 사용


CREATE DATABASE user_management_db;
CREATE USER lst WITH PASSWORD '1111';
GRANT ALL PRIVILEGES ON DATABASE user_management_db TO lst;


CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    user_id VARCHAR(50) NOT NULL,
    user_pw VARCHAR(100) NOT NULL,
    user_email VARCHAR(100),
    phone VARCHAR(20),
    address TEXT,
    create_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    update_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO user_account (user_id, user_pw, user_email, phone, address)
VALUES
('user1', 'pass1', 'user1@example.com', '010-1111-1111', 'Seoul'),
('user2', 'pass2', 'user2@example.com', '010-2222-2222', 'Busan'),
('user3', 'pass3', 'user3@example.com', '010-3333-3333', 'Daegu'),
('user4', 'pass4', 'user4@example.com', '010-4444-4444', 'Incheon'),
('user5', 'pass5', 'user5@example.com', '010-5555-5555', 'Gwangju'),
('user6', 'pass6', 'user6@example.com', '010-6666-6666', 'Daejeon'),
('user7', 'pass7', 'user7@example.com', '010-7777-7777', 'Ulsan'),
('user8', 'pass8', 'user8@example.com', '010-8888-8888', 'Suwon'),
('user9', 'pass9', 'user9@example.com', '010-9999-9999', 'Jeonju'),
('user10', 'pass10', 'user10@example.com', '010-1010-1010', 'Changwon');


```