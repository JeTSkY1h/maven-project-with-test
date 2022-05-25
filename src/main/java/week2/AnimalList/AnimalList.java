package week2.AnimalList;

public class AnimalList {
    AnimalListItem head;

    void add(Animal value) {
        if (head == null) {
            head = new AnimalListItem(value);
        } else {
            AnimalListItem last = findLast();
            last.setNext(new AnimalListItem(value)); 
        }
    }

    void remove(Animal value) {
        AnimalListItem curr = head;
        AnimalListItem prev = null;
        
        while(!curr.getValue().equals(value)){
            prev = curr;
            curr = curr.getNext();
        }
        
        if(prev != null) {
            prev.setNext(curr.getNext()); 
        } else {
            head = head.getNext();
        }
    }

    AnimalListItem findLast(){
        AnimalListItem curr = head;
        while (curr.hasNext()) {
            curr = curr.getNext();
        }
        return curr;
    }


    @Override
    public String toString() {
        return head.toString();
    }



}