package homeWork42;

import java.util.*;

public class WorkWithLindKedList {

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        list1.add(111);
        list1.add(222);
        list1.add(333);


        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);

        System.out.println("get index 1: " + list.get(1));
        System.out.println("Додаєм колекцію");

        list.addAll(list1);
        System.out.println("Додаєм колекцію у індекс");

        list.addAll(0, list1);
        System.out.println("Очищаем колекцію");

        list.clear();

        System.out.println("contains object: " + list.contains(133));

        System.out.println("contains collection: " + list.containsAll(list1));

        System.out.println("Hash Cod: " + list.hashCode());

        System.out.println("Cupusta: " + list1.isEmpty());

        list.removeAll(list1);

//        list.remove(1);

        Integer ob = new Integer(55555);

        list.remove(ob);

        list.retainAll(list1);

        System.out.println("count: " + list.size());

        System.out.println("equals: " + list.equals(list));

        Integer integer1 = new Integer(222);

        System.out.println(list.indexOf(integer1));

        System.out.println(list.lastIndexOf(integer1));

//        list.set(7, integer1);

        System.out.println("NameClass: " + list.getClass().getName());

        System.out.println(list.toString());

        System.out.println("Method toArray");

        Object[] ob1 = list.toArray();


        for (int i = 0; i < list.size(); i++) {
            System.out.println(ob1[i].toString());
        }
        System.out.println("after method toArray");

        System.out.println("DO");

        Object[] integer = new Object[list.size()];

        Object[] ob2 = list.toArray(integer);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(ob2[i].toString());
        }
        System.out.println("PISLJA");

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        list.addFirst(676);

        list.addLast(878);

        Object object = list.clone();

        System.out.println(object.toString());
        Integer el = list.element();

        System.out.println("element : " + el.toString());

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        list.offer(0);

        System.out.println("offerFirst: " + list.offerFirst(555));

        System.out.println("OfferLast: " + list.offerLast(444));

        System.out.println("Peek:" + list.peek());

        System.out.println("PeekFirst: " + list.peekFirst());

        System.out.println("PeekLast: " + list.peekLast());

        System.out.println("Poll: " + list.poll());

        System.out.println("PoolFirs: " + list.pollFirst());

        System.out.println("PollLast: " + list.pollLast());

        System.out.println("Pop: " + list.pop());

        list.push(1000);

        System.out.println("RemoveFirst: " + list.removeFirst());

        System.out.println("RemoveFirstOccurence: " + list.removeFirstOccurrence(4));

        System.out.println("RemoveLast: " + list.removeLast());

        System.out.println("RemoveLastOccurence: " + list.removeLastOccurrence(3));

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("ListIteratorNext");

        ListIterator<Integer> listOne = list.listIterator();

        while (listOne.hasNext()) {
            System.out.println(listOne.next());
        }

        System.out.println("ListIteratorPrevios");

        while (listOne.hasPrevious()) {
            System.out.println(listOne.previous());
        }

//        listOne = list.listIterator(5);

        System.out.println("ListIteratorIndex");

        while (listOne.hasPrevious()) {
            System.out.println(listOne.previous());
        }
    }
}
