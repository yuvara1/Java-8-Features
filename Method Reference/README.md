# Method Reference Examples

This project demonstrates all four Java 8 method reference types using a `Student` model.

## Included Examples

1. Instance method of a particular object: `System.out::println`
2. Static method reference: `MyPrinter::printStudent`
3. Instance method of a particular object: `printer::printStudentInstance`
4. Instance method of an arbitrary object of a particular type: `Student::getEmail`
5. Constructor reference: `Student::new`

## Run

```powershell
javac -d out src\*.java
java -cp out Main
```

