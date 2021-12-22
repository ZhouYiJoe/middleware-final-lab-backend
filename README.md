# 运行本项目所需的依赖

| 依赖  | 版本   |
| ----- | ------ |
| Java  | 8      |
| MySQL | 8.0+   |
| Maven | 3.8.1+ |

# 运行项目前需要做的配置

把MySQL的root用户密码设为12345。

创建一个名为middleware_final_lab的数据库。

在数据库middleware_final_lab中新建一个表，表的创建语句如下。

```sql
CREATE TABLE `tstudentinfo` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `major` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

# 启动项目的方法

进入源代码文件夹下的middleware-final-lab-backend目录下，输入如下指令。

~~~shell
mvn spring-boot:run
~~~

若看到类似如下提示信息，则说明项目启动成功。

~~~shell
[INFO] Scanning for projects...
[INFO]
[INFO] --------------< com.example:middleware-final-lab-backend >--------------
[INFO] Building middleware-final-lab-backend 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> spring-boot-maven-plugin:2.5.6:run (default-cli) > test-compile @ middleware-final-lab-backend >>>
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ middleware-final-lab-backend ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 4 resources to META-INF/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ middleware-final-lab-backend ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 10 source files to E:\Documents\code\middleware-final-lab-backend\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ middleware-final-lab-backend ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory E:\Documents\code\middleware-final-lab-backend\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ middleware-final-lab-backend ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to E:\Documents\code\middleware-final-lab-backend\target\test-classes
[INFO]
[INFO] <<< spring-boot-maven-plugin:2.5.6:run (default-cli) < test-compile @ middleware-final-lab-backend <<<
[INFO]
[INFO]
[INFO] --- spring-boot-maven-plugin:2.5.6:run (default-cli) @ middleware-final-lab-backend ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.6)

2021-12-22 11:27:20.740  INFO 4772 --- [           main] c.e.MiddlewareFinalLabBackendApplication : Starting MiddlewareFinalLabBackendApplication using Java 16
.0.1 on LAPTOP-786PU1I8 with PID 4772 (E:\Documents\code\middleware-final-lab-backend\target\classes started by ZhouYiJoe in E:\Documents\code\middleware-final
-lab-backend)
2021-12-22 11:27:20.742  INFO 4772 --- [           main] c.e.MiddlewareFinalLabBackendApplication : No active profile set, falling back to default profiles: de
fault
2021-12-22 11:27:21.554  INFO 4772 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2021-12-22 11:27:21.575  INFO 4772 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-12-22 11:27:21.575  INFO 4772 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.54]
2021-12-22 11:27:21.754  INFO 4772 --- [           main] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs
. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can
 improve startup time and JSP compilation time.
2021-12-22 11:27:21.770  INFO 4772 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-12-22 11:27:21.775  INFO 4772 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 100
2 ms
2021-12-22 11:27:22.123  INFO 4772 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2021-12-22 11:27:22.254  INFO 4772 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''

2021-12-22 11:27:22.254  INFO 4772 --- [           main] c.e.MiddlewareFinalLabBackendApplication : Started MiddlewareFinalLabBackendApplication in 1.896 secon
ds (JVM running for 2.166)
~~~

在浏览器的地址栏中输入localhost:8080，即可访问该项目的主页。