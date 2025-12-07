public class SortingPasien {

    public static void sortByTekananDarah(linkedPasien list) {
        if (list.Head == null || list.Head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            nodePasien current = list.Head;

            while (current.next != null) {
                if (current.systolic > current.next.systolic) {
                    swapData(current, current.next);
                    swapped = true;
                }

                current = current.next;
            }

        } while (swapped);
    }


    private static void swapData(nodePasien a, nodePasien b) {
        int tempId = a.id;
        String tempName = a.name;
        int tempAge = a.age;
        int tempSys = a.systolic;
        int tempDia = a.diastolic;
        String tempPeny = a.penyakit;
        boolean tempDar = a.darurat;

        a.id = b.id;
        a.name = b.name;
        a.age = b.age;
        a.systolic = b.systolic;
        a.diastolic = b.diastolic;
        a.penyakit = b.penyakit;
        a.darurat = b.darurat;

        b.id = tempId;
        b.name = tempName;
        b.age = tempAge;
        b.systolic = tempSys;
        b.diastolic = tempDia;
        b.penyakit = tempPeny;
        b.darurat = tempDar;
    }
}