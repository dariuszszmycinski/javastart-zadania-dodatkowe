import java.util.*;

class TeleBook implements Iterable<Contact> {
    private Map<String, Contact> contacts = new TreeMap<>();
    private FileUtils fileUtils = new FileUtils();

    public void setContacts(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public FileUtils getFileUtils() {
        return fileUtils;
    }

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public TeleBook() {};

    public TeleBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public boolean add(String name, String telephone){
        if (name==null||telephone==null){
            throw new NullPointerException("name and telephone cannot be null");
        }
        if (name.isEmpty()||telephone.isEmpty()){
            throw new IllegalArgumentException("name and telephone cannot be empty");
        }
        if (!contacts.containsKey(name)){
            contacts.put(name,new Contact(name, telephone));
            return  true;
        }else {
            return false;
        }
    }

    public boolean remove(String name){
        return contacts.remove(name) != null;
    }

    public List<Contact> find(String nameOrTelephone){
        List<Contact> result = new ArrayList<>();
        for (var entry: contacts.entrySet()) {
            if (entry.getKey().contains(nameOrTelephone)){
                result.add(entry.getValue());
            }
        }
        for (Contact contact:contacts.values()){
            if (contact.getTelephone().contains(nameOrTelephone)){
                result.add(contact);
            }
        }
        return result;
    }

    @Override
    public Iterator<Contact> iterator() {
        return contacts.values().iterator();
    }
}

