package ru.itis.inf301.db.model.ListModel;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

// Реализация итерфейса List с помощью двухсвязного списка.

public class List<T> implements java.util.List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public List() {
    }

    // Конструктор, в который передается массив элементов
    public List(T[] massive) {
        for (T t : massive) {
            add(t);
        }
    }

    // Возвращает текущий размер
    @Override
    public int size() {
        return size;
    }

    // Возвращает true, если список пустой, иначе false
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Возвращает true, если элемент есть в списке, иначе false;
    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    // ርዪቹልፕቹጋ ፪ሃ ነልፕልክል
    @Override
    public Iterator iterator() {
        return null;
    }

    // Возвращает список ввиде массива
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> tmp = head;
        for (int i = 0; i < size; ++i) {
            array[i] = tmp.getValue();
            tmp = tmp.getNext();
        }
        return array;
    }

    // Добавляет элемент в конец списка
    @Override
    public boolean add(T o) {
        if (size == 0) {
            head = new Node<>(o);
            tail = head;
        } else {
            Node<T> tmp = new Node<>(o);
            tmp.setPrev(tail);
            tail.setNext(tmp);
            tail = tail.getNext();
        }
        size++;
        return true;
    }

    /* Удаляет элемент по значению, заранее проверяя, есть ли такой элемент в списке.
    Возвращает true, если удален, иначе false
     */
    @Override
    public boolean remove(Object o) {
        int tmp = indexOf(o);
        if (tmp != -1) {
            remove(tmp);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    // Очищает список.
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /* Возвращает значение по индексу. Если индекс задан неверно, сообщит об этом в консоль и вернет null */
    @Override
    public T get(int index) {
        Node<T> tmp = moveTo(index);
        if (tmp != null) {
            return tmp.getValue();
        }
        return null;
    }

    /* Заменяет элемент списка с нужным индексом. Возвращает предыдущее значение, которое стояло под этим индексом.
    Если индекс задан неверно, сообщит об этом в консоль и вернет null
    */
    @Override
    public T set(int index, T element) {
        Node<T> tmp = moveTo(index);
        if (tmp == null) {
            return null;
        }
        T prevValue = tmp.getValue();
        tmp.setValue(element);
        return prevValue;
    }

    // Добавляет элемент в нужную позицию. Если индекс задан неверно, сообщит об этом в консоль
    @Override
    public void add(int index, T element) {
        if (index == size) {
            add(element);
        } else {
            Node<T> tmp = moveTo(index);
            if (tmp == null) {
                return;
            }
            Node<T> nNode = new Node<>(element);
            nNode.setNext(tmp);
            if (tmp != head) {
                tmp.getPrev().setNext(nNode);
                nNode.setPrev(tmp.getPrev());
            } else {
                head = nNode;
            }
            tmp.setPrev(nNode);
            size++;
        }
    }

    // Удаляет элемент по индексу. Если индекс задан неверно, то выведет об этом сообщение в консоль
    @Override
    public T remove(int index) {
        Node<T> tmp = moveTo(index);
        if (tmp == null) {
            return null;
        }
        Node<T> prev = tmp.getPrev();
        Node<T> next = tmp.getNext();
        if (next != null) {
            next.setPrev(prev);
        }
        if (prev != null) {
            prev.setNext(next);
        }
        if (tmp == head) {
            head = tmp.getNext();
        }
        size--;
        return tmp.getValue();
    }

    /* Возвращает ссылку на элемент стоящий под нужным индексом.
    Если индекс задан неверно, то выведет об этом сообщение в консоль и вернет null
    */
    private Node<T> moveTo(int index) {
        if (index >= size || index < 0) {
            System.out.println("Неверный индекс!");
            return null;
        }
        Node<T> tmp = head;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    // Возвращает индекс первого найденного элемента, иначе возвращает -1
    @Override
    public int indexOf(Object o) {
        int tmpInd = -1;
        Node<T> tmp = head;
        for (int i = 0; i < size; ++i) {
            if (tmp.getValue().equals(o)) {
                return i;
            }
            tmp = tmp.getNext();
        }
        return tmpInd;
    }

    // Возвращает индекс последнего вхождения в список, иначе возвращает -1
    @Override
    public int lastIndexOf(Object o) {
        int tmpInd = -1;
        Node<T> tmp = head;
        for (int i = size - 1; i > -1; --i) {
            if (tmp.getValue().equals(o)) {
                return i;
            }
            tmp = tmp.getNext();
        }
        return tmpInd;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    // Хз че делает, но в интерфейсе было
    /* P.S. Копирует список в массив, если хватает места. Иначе создает новый.
    Если места больше, то следующий после последнего элемента списка будет null
    */
    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length < size) {
            a = (E[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }

        Object[] result = a;
        Node<T> tmp = head;
        for (int i = 0; i < size; ++i) {
            result[i] = tmp.getValue();
            tmp = tmp.getNext();
        }

        if (a.length > size)
            a[size] = null;
        return a;
    }
}
