/**
 * Tests the SpanishTranslator class
 *
 */
public class SpanishTranslatorTester
{
    public static void main(String[] args)
    {
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
        

    }
}