package langPackageExample.reflectExamp;
import java.lang.reflect.*;
public class ReflectDemo {

	public static void main(String[] args) {
		Class c=My.class;
        
        Field field[]=c.getDeclaredFields();
        
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }

	}

}
