## Spanish translator
Translates English words to Spanish.

### Examples:
```java
String myWord = "el estudiante";
SpanishTranslator translator = new SpanishTranslator(myWord);
System.out.println( translator.getSpanish());
System.out.println("Expected: el estudiante");

translator.setSpanish("la profesora");
System.out.println( translator.getSpanish());
System.out.println("Expected: la profesora");

myWord = "verde";
translator = new SpanishTranslator(myWord);
System.out.println( translator.getSpanish());
System.out.println("Expected: verde");
```

### Outputs:
```
el estudiante: student
Expected: student

la profesora: null
Expected: null

aprender: to learn
Expected: to learn

verde: green
Expected: green

entender: to understand
Expected: to understand

la estudiante: student
Expected: student
```
