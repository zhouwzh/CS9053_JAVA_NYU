
public class GetNameArgument {
	
	public static void main(String[] args) {
		// This will print out the contents of the args array.
		// Don't worry about the specifics of how this works. We
		// will get to that next week
		System.out.print("args is " + java.util.Arrays.toString(args));
		// if there are command line arguments, then the first will be in
		// args[0], the second in arg[1], and so on. If there are no command
		// line arguments, then args[0] will give an error
		System.out.println();
		System.out.print("Hello "+ args[0]+"!");
	}
}
