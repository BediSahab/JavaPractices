package annotations;

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)
public @interface MyAnno {
	String name();
    String project();
    String date() default "today";
    String version() default "13";
}
