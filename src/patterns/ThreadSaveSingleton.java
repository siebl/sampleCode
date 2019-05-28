package patterns;

/**
 * This class is a singleton.
 * The only instance of this class will be created during the first call of <code>getInstance()</code>.<br />
 * Creating the instance of this class is thread save and ensures minor blocking time, by only synchronizing the creation.
 * For basic explanation of how a Singleton works see the class <code>Singleton</code>.
 */
public class ThreadSaveSingleton
{
	/**
	 * The instance.
	 */
	private static ThreadSaveSingleton instance;
	/**
	 * Used for locking the code, which creates the instance.
	 */
	private static Object mutex = new Object();
	
	private ThreadSaveSingleton()
	{
		//init code
	}
	
	/**
	 * Only if the instance does not yet exist, the code enters a locked block.
	 * Therefore the code only blocks if two threads access the method at the same time and the instance does not exist already.
	 * 
	 * @return The only instance
	 */
	public static ThreadSaveSingleton getInstance()
	{
		ThreadSaveSingleton result = instance;
		if( result == null )
		{
			synchronized (mutex)
			{
				result = instance;
				if( result == null )
				{
					instance = new ThreadSaveSingleton();
					result = instance;
				}
			}
		}
		
		return result;
	}
	
	public void doStuff()
	{
		//TODO
	}
	
}
