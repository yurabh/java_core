package homeWork46;

import java.util.*;

public class RunnerBankTransaction {
    public static void main(String[] args) {

        Client key = new Client("aura", "aahlay");

        Client key1 = new Client("bolik", "bnegerjov");

        Client key2 = new Client("castja", "cedorcyk");

        Client key3 = new Client("dhawa", "dalina");

        Client key4 = new Client("eana", "erkadiivna");

        Client key5 = new Client("fodja", "fedunj");

        Client key6 = new Client("grusja", "git");

        BankTransaction transaction = new BankTransaction("Trylovskoho", "1231231231", 4000);

        BankTransaction transaction1 = new BankTransaction("Antonuca", "5457082344", 10500);

        BankTransaction transaction2 = new BankTransaction("volova", "91546797843", 9400);

        BankTransaction transaction3 = new BankTransaction("gnatyka", "43242342423", 75000);

        BankTransaction transaction4 = new BankTransaction("Patona", "423423423415", 6000);

        BankTransaction transaction5 = new BankTransaction("wovkivsjka", "112211211", 3500);

        BankTransaction transaction6 = new BankTransaction("powarna", "99999999999", 3000);

        transaction.setTransaction();

        transaction1.setTransaction();

        transaction2.setTransaction();

        transaction3.setTransaction();

        transaction4.setTransaction();

        transaction5.setTransaction();

        transaction6.setTransaction();

        TreeMap<Client, BankTransaction> transactionBank = new TreeMap<>();

        transactionBank.put(key, transaction);

        transactionBank.put(key1, transaction1);

        transactionBank.put(key2, transaction2);

        transactionBank.put(key3, transaction3);

        transactionBank.put(key4, transaction4);

        transactionBank.put(key5, transaction5);

        transactionBank.put(key6, transaction6);


        System.out.println("Size: " + transactionBank.size());

        System.out.println("Hash Cod: " + transactionBank.hashCode());

        System.out.println("IsEmpty: " + transactionBank.isEmpty());

        Client keyUsers8 = new Client("yura", "bahlay");

        System.out.println("ContainsKey: " + transactionBank.containsKey(keyUsers8));

        BankTransaction transaction9 = new BankTransaction("powarna", "99999999999", 3000);

        transaction9.setTransaction();

        System.out.println("Contains Value: " + transactionBank.containsValue(transaction6));

        Map<Client, BankTransaction> newTranzaction = new TreeMap<>();

        System.out.println("Equals: " + transactionBank.equals(newTranzaction));

        System.out.println("Equals: " + transactionBank.equals(transactionBank));

        Client ki = new Client("sdsdf", "sfsfsf");

        BankTransaction ob5 = transactionBank.get(ki);

        System.out.println("GetKey: " + ob5);

        Set<Client> kyes = transactionBank.keySet();

        System.out.println("KeySet" + kyes);

        System.out.println(transactionBank.getOrDefault(key3, transaction6));

        BankTransaction removeKey = transactionBank.remove(key);

        System.out.println("Remove: " + removeKey);

        System.out.println("Size: " + transactionBank.size());

        Collection<BankTransaction> ob1 = transactionBank.values();

        System.out.println(ob1);

        Iterator<BankTransaction> it = ob1.iterator();


        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("RemoveWith Key And Value:" + transactionBank.remove(key1, transaction));

        Map.Entry<Client, BankTransaction> object = transactionBank.ceilingEntry(key6);

        System.out.println(object);

        Client cli = transactionBank.ceilingKey(key4);

        System.out.println(cli);

        NavigableSet<Client> na = transactionBank.descendingKeySet();

        System.out.println(na.toString());

        Map<Client, BankTransaction> maps = transactionBank.descendingMap();

        System.out.println(maps);

        Map.Entry<Client, BankTransaction> first = transactionBank.firstEntry();

        System.out.println(first);

        Client firstKey = transactionBank.firstKey();

        System.out.println(firstKey);

        Client lastKey = transactionBank.lastKey();

        System.out.println(lastKey);

        Map.Entry<Client, BankTransaction> last = transactionBank.lastEntry();

        System.out.println(last);

        Client kis = transactionBank.floorKey(key4);

        System.out.println(kis);

        Set<Map.Entry<Client, BankTransaction>> ob = transactionBank.entrySet();
        for (Map.Entry<Client, BankTransaction> item : ob) {
            Client keys = item.getKey();
            BankTransaction value = item.getValue();
            keys.showKey();
            value.showTransaction();
            System.out.println(" ");
        }
    }
}
