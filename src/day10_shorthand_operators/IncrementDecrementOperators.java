package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;//1
        i++;//1
        ++i;//1
        ++i;//1
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("lines of code = " + linesOfCode);
        //increase lines of code by 1, 4 diff ways
        linesOfCode++;
        ++linesOfCode;
        linesOfCode += 1;
        linesOfCode = linesOfCode + 1;
        System.out.println("lines of code = " + linesOfCode);

        //type 4 different ways of decreasing by 1
        linesOfCode = linesOfCode -1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("lines of code = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        letter--;
        --letter;
        letter--;
        System.out.println("letter = " + letter);

    }
}
