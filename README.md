# Composite_Primary_Key
If table contains more than one primary key column then it is called as Composite Primary key
To work with composite primary keys we will use below two annotations
@Embeddable : It is used at class level which contains primary keys mapped variables
@EmbeddedId : It is used in entity to refer Embeddable class.
Note: We can't use Generators for composite primary key columns
