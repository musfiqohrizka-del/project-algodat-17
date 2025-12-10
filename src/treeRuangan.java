public class treeRuangan {
    nodeRuangan root;

    public treeRuangan() {
        this.root = null;
    }

    public void insert(int id, String nama) {
        root = insertRec(root, id, nama);
    }

    private nodeRuangan insertRec(nodeRuangan root, int id, String nama) {

        if (root == null) {
            root = new nodeRuangan(id, nama);
            return root;
        }

        if (id < root.id) {
            root.left = insertRec(root.left, id, nama);
        } else if (id > root.id) {
            root.right = insertRec(root.right, id, nama);
        }

        return root;
    }

    public nodeRuangan search(int id) {
        return searchRec(root, id);
    }

    private nodeRuangan searchRec(nodeRuangan root, int id) {
        if (root == null || root.id == id) {
            return root;
        }

        if (root.id > id) {
            return searchRec(root.left, id);
        }

        return searchRec(root.right, id);
    }
    //In Order
    public void displayTree() {
        System.out.println("\n=== STRUKTUR RUANGAN RUMAH SAKIT (BST) ===");
        inOrderRec(root);
        System.out.println("==========================================\n");
    }

    private void inOrderRec(nodeRuangan root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println("ID Ruangan: " + root.id + " | Nama: " + root.namaRuangan);
            inOrderRec(root.right);
        }
    }
}