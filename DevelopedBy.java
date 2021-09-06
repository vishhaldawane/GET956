import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
//III
@Retention(RUNTIME)
@Target(TYPE)
public @interface DevelopedBy {
	String developer();
	double version();
	String company();
	String client();
	String modified();
}
