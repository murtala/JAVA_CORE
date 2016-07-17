package generics.generic_types;

/**
 * Generic version of the Box class.
 * 
 * @param <T>
 *            the type of the value being boxed
 */
public class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<Integer> integerBox1 = new Box<>();
	}
}
