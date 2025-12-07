public class treeRuangan {
  nodeRuangan root;

  public void insert(int id, String namaRuangan) {
    nodeRuangan newRuangan = new nodeRuangan(id, namaRuangan);
    if (root == null) {
      root = newRuangan;
    } else {
      nodeRuangan current = root;
      while (current.next != null)
        current = current.next;
      current.next = newRuangan;
    }
  }

  public nodeRuangan search(int id) {
    nodeRuangan current = root;
    while (current != null) {
      if (current.id == id)
        return current;
      current = current.next;
    }
    return null;
  }
}