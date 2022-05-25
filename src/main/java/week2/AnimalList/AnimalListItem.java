package week2.AnimalList;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    AnimalListItem(Animal value){
        this.value = value;
    }

    public void setNext(AnimalListItem next){
        this.next = next;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public Animal getValue(){
        return value;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString(){
        String res = value.toString();
        if (hasNext()) {
            res += " -> ";
            res += next.toString();
        }
        return res;
    }

}