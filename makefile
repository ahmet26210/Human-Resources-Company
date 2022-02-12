# Compiler
JC = javac
# Run
R = java
# Book implementations folder
BOOK = src/book_implementation/
# My implementations source folder
SUPER = src/
# Driver class name
DRIVER = Test
# Flags
JFlags =  


grup1:
	$(JC) $(JFlags) $(SUPER)*.java $(BOOK)*.java $(DRIVER).java  -d classfiles
	$(R) -cp classfiles $(DRIVER)

# create javadoc files
javadoc:
	javadoc $(SUPER)*.java $(SUB)*.java -d javadoc

# clean javadoc and classfiles folder
clean:
	rm classfiles/ javadoc/ -r 
	

