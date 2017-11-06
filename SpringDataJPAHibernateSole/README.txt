NOTE:
1. Spring Data JPA by default looks for an EntityManagerFactory named entityManagerFactory.
	In applicationContext.xml, we name it with "entityManager" which will cause exception: 
	No bean named 'entityManagerFactory' available
	To solve the problem:
	1) Rename to "entityManagerFactory"
	2) Declare EntityManagerFactory Name: <jpa:repositories base-package="edu.mum.repository" entity-manager-factory-ref="entityManager"/>
	
2. You must create Schema in DB first, otherwise, tables cannot be generated and saved.

3. object references an unsaved transient instance - save the transient instance before flushing : edu.mum.domain.Product.hotLine -> edu.mum.domain.Phone
	By default no operations are cascaded if only use @OneToOne
	
4. @JoinColumn(name = "phone_id", nullable = false). By default, it's propertyname_idname

5. Cascading is about deletion of one object from the database causing deletion of other (dependent) objects

6. mappedBy means I'm not the owner, it won't generate a column in current table

7. ManyToMany demo isn't completed. Only add annotations on Entity to show generated database