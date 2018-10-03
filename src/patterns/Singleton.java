package patterns;

/**
 * This class is a singleton.
 * There will only exist one instance of this class in the whole application.<br/>
 * You may use this class as follows:<br/>
 * <code>Singleton single = Singleton.getInstance();</code><br/>
 * <code>single.doStuff();</code>
 */
public class Singleton
{
	/**
	 * This is the instance which will be used everywhere in the application.
	 */
	private static Singleton instance = new Singleton();
	
	/**
	 * By setting the constructor to private, no one can create  another instance.
	 */
	private Singleton()
	{
		//init-code
	}
	
	/**
	 * Because this is a static method it may be called without an instance the class.
	 * It returns the only instance of the class.
	 */
	public static Singleton getInstance()
	{
		return instance;
	}
	
	/**
	 * Non-Static method to do the real work.
	 */
	public void doStuff()
	{
		//TODO
	}
}
