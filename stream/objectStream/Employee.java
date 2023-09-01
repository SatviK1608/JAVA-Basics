package stream.objectStream;

import java.io.Serializable;

//DAO Class
public class Employee implements Serializable {
 private String id;
 private String name;

// public Employee(String id, String name) {
//     this.id = id;
//     this.name = name;
// }

 public Employee(String id, String name) {
	// TODO Auto-generated constructor stub
	 this.id=id;
	 this.name=name;
}

public String getId() {
     return id;
 }

 public String getName() {
     return name;
 }
}
