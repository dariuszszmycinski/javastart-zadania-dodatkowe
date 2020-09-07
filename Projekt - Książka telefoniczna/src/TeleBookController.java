import java.io.IOException;
import java.util.*;

class TeleBookController {
    private TeleBook teleBook = new TeleBook();
    private Scanner input = new Scanner(System.in);

    public TeleBookController() {
        teleBook = FileUtils.read();
    }

    public void loop() {
        Option chosenOption = null;
        do {
            showOptions();
            try {
                chosenOption = chooseOption();
                executeOption(chosenOption);
            } catch (NoSuchElementException e) {
                System.err.println("No such option.");
            }
        } while (chosenOption != Option.EXIT);
    }

    private void showOptions() {
        System.out.println("Choose option: ");
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }


    private Option chooseOption() {
        try {
            int optionInt = input.nextInt();
            input.nextLine();
            return Option.convertToOption(optionInt);
        } catch (InputMismatchException e) {
            System.err.println("Please choose option number.");
        }
        return null;
    }

    private void executeOption(Option option) {
        switch (option) {
            case ADD:
                addContact();
                break;
            case FIND:
                search();
                break;
            case DELETE:
                delete();
                break;
            case EXIT:
                close();
                break;
            default:
                System.err.println("Please choose correct option number.");
                break;
        }
    }

    private void delete() {
        System.out.println("Delete contact with a name:");
        String name = input.nextLine();
        if (teleBook.remove(name)) {
            System.out.println("Contact removed.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private void search() {
        System.out.println("Name or number fragment:");
        String nameOrTelephone = input.nextLine();
        List<Contact> result = teleBook.find(nameOrTelephone);
        if (result.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts found:");
            result.forEach(System.out::println);
        }
    }

    private void addContact() {
        System.out.println("New contact name:");
        String name = input.nextLine();
        System.out.println("New contact number:");
        String telephone = input.nextLine();
        try {
            boolean add = teleBook.add(name, telephone);
            if (add) {
                System.out.println("New contact added");
            } else {
                System.out.println("Contact with this name already exists.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Name and number can not be empty.");
        }

    }

    private void close() {
        input.close();
        try{
            FileUtils.save(teleBook);
            System.out.println("Changes saved.");
        }catch (IOException e){
            System.out.println("Changes not saved!");
        }
        System.out.println("Bye bye!");
    }

}
