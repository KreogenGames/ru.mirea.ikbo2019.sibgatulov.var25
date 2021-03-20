package Practice_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;


public class SetSem<E> implements Set {
    private ArrayList<E> lst= new ArrayList<>();
    public static final Semaphore semaphore = new Semaphore(1);

    public SetSem(){
    }

    @Override
    public int size() {
        int a = 0;
        try {
            semaphore.acquire();
                a = lst.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean isEmpty() {
        boolean a = false;
        try {
            semaphore.acquire();
            a = lst.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean contains(Object o) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public Iterator iterator() {
        Iterator<E> a = null;
        try {
            semaphore.acquire();
                a = lst.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public Object[] toArray() {
        Object[] a = null;
        try {
            semaphore.acquire();
                a = lst.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean add(Object o) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.add((E) o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean remove(Object o) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
                lst.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        boolean a = false;
        try {
            semaphore.acquire();
                a = lst.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] obj = null;
        try {
            semaphore.acquire();
                obj = lst.toArray(a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
