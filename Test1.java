package com.lti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {
	public static void main(String[] args) {
			//Garden         myGarden             =   Home	   .getGarden("hint")			
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA"); //this will read the persistence.xml file
		System.out.println("Got the EntityManagerFactory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("Got the EntityManager :  "+entityManager);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("Got the EntityTransaction : "+entityTransaction);
		
		entityTransaction.begin();
				SavingsAccount savObj1 = new SavingsAccount(); //detached from hibernate
				savObj1.setAccountNumber(104);
				savObj1.setAccountHolderName("Adam");
				savObj1.setAccountBalance(8000); //till this point it is detached
				
				SavingsAccount savObj2 = new SavingsAccount(); //detached from hibernate
				savObj2.setAccountNumber(105);
				savObj2.setAccountHolderName("Miller");
				savObj2.setAccountBalance(9000); //till this point it is detached
				
				SavingsAccount savObj3 = new SavingsAccount(); //detached from hibernate
				savObj3.setAccountNumber(106);
				savObj3.setAccountHolderName("Rita");
				savObj3.setAccountBalance(95000); //till this point it is detached
				
				
				entityManager.persist(savObj1); //peristed object now : this will fire the insert query
				entityManager.persist(savObj2); 
				entityManager.persist(savObj3); 
				
		entityTransaction.commit();
		System.out.println("Object is persisted....ß");
		
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Resources closed...");
	}
	
}
/*
  
  layer1		database		savings
  layer2		POJO			SavngsAccount
  layer3		REPO			Hibernate JPA coding
  layer4		GLADIATOR		your project coding
  layer5		Controller		SpringREST
  layer6		Angular			Angular Services + Components + Pipes + Routing 
 
 FileHandling - Serialization
 OR
 Persistence - storing the "JAVA Object" on the database table as a "ROW
 
 
 	Persistence					- MyHome <--- Lodha | Hiranandani | 
	to retrieve the object 
	of EntityManagerFactory

	EntityManagerFactory		- Garden
	
	EntityManager				- Rose, Lotus, Lily
	|
	save(), get(),
	update(), delete()
	
	
	EntityTransaction			- rollback, commit

	Query						- custom queries
	
	persistence.xml				configurations of the EntityManagerFactory
								DriverName,URL, Username, Password
								other hibernate/jpa details
								
	
	--------- start hsqldb server
	1. download hsqdb.jar file from the site : http://hsqldb.org/
	2. extract it
	3. cd to the lib folder of "hsqldb extracted folder"
	4. java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:hibernatedb --dbname.0 mydb
	---------
	start the interface of it
	1. cd to the lib folder of "hsqldb extracted folder"
	2. java -jar hsqldb.jar
	3. select teh "database engine server" from the drop down -> Type
	4. at the URL append the db nane as : mydb
		e.g., jdbc:hsqldb:hsql://localhost/mydb
	5. username is SA
	6. password is not set 
	
	<property name="hibernate.dialect" value="org.hibernate.dialect.HSQLDialect" />
      
        <property name="javax.persistence.jdbc.driver" value="org.hsqldb.jdbc.JDBCDriver"/>
        <property name="javax.persistence.jdbc.url" value="jdbc:hsqldb:hsql://localhost/mydb"/>
        <property name="javax.persistence.jdbc.user" value="SA"/>
        <property name="javax.persistence.jdbc.password" value=""/>
    ---
    pom.xml
    ----
    <dependency>
		    <groupId>org.hsqldb</groupId>
		    <artifactId>hsqldb</artifactId>
		    <version>2.6.0</version>
		    
		</dependency>    
	 
*/




