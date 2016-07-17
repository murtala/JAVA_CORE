package annotations;

@ClassPreamble (authors = { "xx" }
		 /*  author = "John Doe",
		   date = "3/17/2002",
		   currentRevision = 6,
		   lastModified = "4/12/2004",
		   lastModifiedBy = "Jane Doe",
		   // Note array notation
		   reviewers = {"Alice", "Bob", "Cindy"}*/
		)
public class Generation3List   {


	
	
	@Value("Sarah")
	private String firstName;

	public Generation3List(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
