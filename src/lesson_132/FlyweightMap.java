package lesson_132;

import java.util.*;

import static lesson_132.Countries.DATA;

public class FlyweightMap extends AbstractMap<String, String> {

    private static class Entry implements Map.Entry<String, String> {
        int index;

        public Entry(int index) {

            this.index = index;
        }

        @Override
        public String getKey() {
            return DATA[index][0];
        }

        @Override
        public String getValue() {
            return DATA[index][1];
        }

        @Override
        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return index == entry.index;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index);
        }
    }


    static class EntrySet extends AbstractSet<Map.Entry<String, String>> {

        private int size;

        EntrySet(int size) {
            if (size < 0) {
                this.size = 0;
            }
            if (size > DATA.length) {
                this.size = DATA.length;
            } else {
                this.size = size;
            }
        }

        @Override
        public int size() {
            return size;
        }

        private class Iter implements Iterator<Map.Entry<String, String>> {

            private Entry entry = new Entry(-1);

            @Override
            public boolean hasNext() {
                return entry.index < size - 1;
            }

            @Override
            public Map.Entry<String, String> next() {
                entry.index++;
                return entry;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }


        @Override
        public Iterator<Map.Entry<String, String>> iterator() {
            return new Iter();
        }
    }

    private static Set<Map.Entry<String, String>> entries = new EntrySet(DATA.length);

    @Override
    public Set<Map.Entry<String, String>> entrySet() {
        return entries;
    }

    static Map<String, String> select(final int size) {
        return new FlyweightMap() {
            public Set<Map.Entry<String, String>> entrySet() {
                return new EntrySet(size);
            }
        };
    }

    static Map<String, String> map = new FlyweightMap();

    public static Map<String, String> capitals() {
        return map;
    }

    public static Map<String, String> captals(int size) {
        return select(size);
    }

    static List<String> names = new ArrayList<>(map.keySet());

    public static List<String> names() {
        return names;
    }

    public static List<String> names(int size) {
        return new ArrayList<String>(select(size).keySet());
    }


    public static void main(String[] args) {
        System.out.println(captals(10));
        System.out.println(names(10));
    }
}
