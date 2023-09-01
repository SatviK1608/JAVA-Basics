package annotations.customAnnotationFields;

public class ElectionCandidate {
	@CandidateName
	String name;
	int age=18;

	public ElectionCandidate(String name,int age){
		this.name=name;
		this.age=age;
	}
	

}
