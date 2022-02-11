package annotations;

import java.lang.annotation.Annotation;

@Eclipse(workspace="E:/Abhisekh/My resources/ eclipse-workspace" ,jdk=17.0f)
class Editor
{
	int wide,tall;
	String  dimension;
	
	public Editor() {
		
	}
	public Editor(int wide,int tall,String dimension)
	
	{this.wide=wide;
	this.tall=tall;
	 this.dimension=dimension;
	 
	}
}
public class AnnotationDemo2
{
	public static void main(String[] args)
	{
		Editor e=new Editor();
		e.wide=1920;
		e.wide=1080;
		e.dimension=e.wide+"x" + e.tall;
		System.out.println(e.wide);
	     System.out.println(e.tall);
	     System.out.println(e.dimension);
	     Class c=e.getClass();
	     Annotation an=c.getAnnotation(Eclipse.class);
	     Eclipse es=(Eclipse)an;
	     System.out.println(es.workspace());
	     System.out.println(es.jdk());
	     
	}
}