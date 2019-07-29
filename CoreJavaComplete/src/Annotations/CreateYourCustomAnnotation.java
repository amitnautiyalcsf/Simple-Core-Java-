package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
@interface SmartPhone  // this is the way to create you own custom annotation// this type of annotation where you dont have any variable is called as a marker Annotations
{

	String Os();

}*/


//Single value Annotations
/*
@interface SmartPhone
{

	String Os();

}
*/

//Multi Value Annotations


// below four called as Meta Annotation

@Inherited// to inherit this annotation in further classes as well
@Documented
@Target(ElementType.TYPE)// on what level or where this annotation will be used ,like this annotation will be used in the class
@Retention(RetentionPolicy.RUNTIME)// Till what point this annotation will be available.
@interface SmartPhone
{

	String os() default "Symbian";
	int version() default 1;

}

//@SmartPhone

@SmartPhone(os="Android", version=6) // it will override the default values 
class NokiaASeries
{
	
	String modelName;
	int siez;
	public NokiaASeries(String modelName, int siez) {
		super();
		this.modelName = modelName;
		this.siez = siez;
	}
	
	
	

}




public class CreateYourCustomAnnotation {

	public static void main(String[] args) {
	
		NokiaASeries obj = new NokiaASeries("N72", 6);
		System.out.println(obj.modelName);
		
		// To fetch the annotation value we have to use the Reflection Api. 
		// ReflectionApi is the new api in java using which u can get the values of an object or the features of an object 
		
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s= (SmartPhone) an;
		System.out.println(s.os());
		System.out.println(s.version());
		
		

		
	}

}
