### behavior of config inheritance
1. @Lazy takes effect on the annotated class only. It will override parent config.
2. @Lazy makes methods inside the class or the annotated function invoked when needed, e.g. spring sees an @Autowire field. 
2. @Bean with same function name overrides parent config. And function body in child 
config will execute once. Override function will not run.
3. If one component is not marked with @Lazy, it will be created eagerly on component scan.
4. @Lazy & inheritance can potentially save lots of time when loading context during start up.
5. If lazy init is on, config class will be init just before calling @Bean method.
6. When eagerly creating beans, config file's @Autowire fields will be init first. Control flows 
to satisfy every needs of a bean creation. When definition sits in a config file, the config bean is 
created.
7. @Bean in parent config will be invoked after child config is fully initialized.
8. @Bean method searching can be placed as dfs searching from child config and stops at the first possible matching. 