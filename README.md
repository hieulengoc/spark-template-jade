spark-template-jade
===================

Spark templating system using [jade4j] (https://github.com/neuland/jade4j).

This repo is folked from https://github.com/perwendel/spark-template-engines/tree/master/spark-template-jade with changing from classpath to filepath.
The default template path is <ProjectRoot>/src/main/resources/templates. When initializing with filepath parameter, the path starts from <ProjectRoot>

```java
import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

/**
 * Jade template engine example.
 */
public class JadeTemplateExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Hello World!");

        // The hello.jade template file is in the resources/templates directory
        get("/hello", (rq, rs) -> new ModelAndView(map, "hello"), new JadeTemplateEngine());
    }
}
```
