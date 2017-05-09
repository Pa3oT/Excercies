package main.pattern.composite;

import java.util.ArrayList;
import java.util.List;

abstract class TextPart {

    protected List<TextPart> value = new ArrayList();

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (TextPart textPart : value) {
            sb.append(textPart.getValue());
        }
        return sb.toString();
    }

    public void append(TextPart... textPart) {
        for (TextPart part : textPart) {
            value.add(part);
        }
    }
}

/**
 * Composite
 */
class Sentence extends TextPart {
    public Sentence(TextPart... value) {
        for (TextPart textPart : value) {
            this.value.add(textPart);
        }
    }
}

/**
 * Composite
 */
class Paragraph extends Sentence {

    public Paragraph(TextPart... value) {
        super(value);
    }

    @Override
    public String getValue() {
        return "    " + super.getValue() + "\n\n";
    }

}


/**
 * Leaf
 */
public class Symbol extends TextPart {
    private char value;

    public Symbol(char value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public void append(TextPart... textPart) {
        throw new UnsupportedOperationException();
    }
}


class Client {
    public static void main(String[] args) {
        Sentence sentence1  = new Sentence(
                new Symbol('H'),
                new Symbol('e'),
                new Symbol('l'),
                new Symbol('l'),
                new Symbol('o')
        );
        System.out.println(sentence1.getValue());

        Sentence sentence2  = new Sentence(
                new Symbol('w'),
                new Symbol('o'),
                new Symbol('r'),
                new Symbol('l'),
                new Symbol('d'),
                new Symbol('!')
        );

        Sentence sentence3 = new Sentence(sentence1, new Symbol(' '), sentence2);
        System.out.println(sentence3.getValue());

        Paragraph paragraph = new Paragraph(sentence3, new Symbol(' '), sentence3);
        System.out.println(paragraph.getValue());
    }
}