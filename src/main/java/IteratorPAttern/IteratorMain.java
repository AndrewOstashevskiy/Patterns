package IteratorPAttern;

public class IteratorMain {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Iterator userIterator = developer.getIterator();
        while (userIterator.hasNext()){
            System.out.println(userIterator.next());
        }
    }
}

interface Iterator {
    boolean hasNext();

    Object next();
}


interface Collection{
    Iterator getIterator();
}

class Developer implements Collection{

    String[] ar = {"dfhdfh", "sgdg", "etgesry", "edhrtu"};


    @Override
    public Iterator getIterator() {
        return new ArrayIterator(ar);
    }
}

class ArrayIterator implements Iterator {

    String[] ar;
    int index = 0;

    public ArrayIterator(String[] ar) {
        this.ar = ar;
    }

    @Override
    public boolean hasNext() {
        return (index < ar.length) ? true : false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return ar[index++];
        }
        return null;
    }
}