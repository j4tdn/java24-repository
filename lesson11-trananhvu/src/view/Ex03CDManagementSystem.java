package view;

import bean.Disk;

import java.math.BigDecimal;
import java.util.*;

public class Ex03CDManagementSystem {
    public static void main(String[] args) {
        Set<Disk> disks = new HashSet<>();

        // add disk
        addDisk(disks, new Disk(1, "Nhac tru tinh", "Bang Kieu", 10, 100.0));
        addDisk(disks, new Disk(2, "Nhac xua", "Quang Le", 5, 140.0));

        //get size
        System.out.println(disks.size());

        //sum of cd prices
        System.out.println(sumOfDiskPrice(disks));

        //Sap xep theo gia thanh
        System.out.println("Sap xep giam dan theo gia thanh:");
        sort(disks, (o1, o2) -> o2.getPrice().compareTo(o1.getPrice()));

        //Sap xep tang dan theo ma cd
        System.out.println("\nSap xep tang dan theo ma cd:");
        sort(disks, (o1, o2) -> o1.getId()-(o2.getId()));
    }

    private static void addDisk(Collection<Disk> disks, Disk disk) {
        boolean res = disks.add(disk);
        if(res) System.out.println("Them thanh cong!");
        else System.out.println("Dia da ton tai!");
    }

    private static Double sumOfDiskPrice(Collection<Disk> disks) {
        Double sum = 0.0;
        for (Disk disk : disks) {
            sum += disk.getPrice();
        }
        return sum;
    }

    private static void sort(Collection<Disk> disks, Comparator<Disk> comparator) {
        List<Disk> sorted = new ArrayList<>(disks);
        sorted.sort(comparator);
        for (Disk disk : sorted) {
            System.out.println(disk);
        }
    }

}
