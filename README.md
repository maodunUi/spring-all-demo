# spring-boot demo

## 1. 自定义starter
1. 创建两个maven module
   
           hello-spring-boot-starter
           <dependency>
           <groupId>cn.maodun</groupId>
           <artifactId>hello-spring-boot-starter-autoconfigure</artifactId>
           <version>1.0-SNAPSHOT</version>
           </dependency> 

        hello-spring-boot-starter-autoconfigure
                <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter</artifactId>
                </dependency>

2. hello-spring-boot-starter-autoconfigure 这个项目中写我们的业务。另外添加META-INF/spring..factories文件
3. 安装模块
4. 外部引用hello-spring-boot-starter模块
注意：一个有趣的现象。如果测试项目的包结构与autoconfigure模块一致，即使没有META-INF/spring..factories引入的配置类 也会被扫描进去。

