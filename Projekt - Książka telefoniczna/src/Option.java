import java.util.NoSuchElementException;

enum Option {
    ADD(1, "Add contact."),
    FIND(2, "Search for contact."),
    DELETE(3, "Delete contact."),
    EXIT(4, "Exit program.");

    private final int number;
    private final String description;

    Option(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    static Option convertToOption(int number) {
        if (number > values().length || number < 1) {
            throw new NoSuchElementException("There is no option "+number);
        }
        return values()[number-1];
    }

    @Override
    public String toString() {
        return number + " " + description;
    }
}
