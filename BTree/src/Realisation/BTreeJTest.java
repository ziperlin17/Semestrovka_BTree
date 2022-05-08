package Realisation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BTreeJTest {
    @Test
    void searchChecker() {
        BTree tree = new BTree(3);
        tree.Insert(1);
        tree.Insert(2);
        tree.Insert(666);
        tree.Insert(4);
        Assertions.assertTrue(tree.Search(tree.root,666) != null);
    }

    @Test
    void addChecker() {
        BTree tree = new BTree(3);
        tree.Insert(1);
        tree.Insert(2);
        tree.Insert(666);
        tree.Insert(4);
        tree.Insert(5);
        tree.Insert(6);
        Assertions.assertTrue(tree.Contain(1));
        Assertions.assertTrue(tree.Contain(666));
        Assertions.assertFalse(tree.Contain(7));
    }

    @Test
    void removeChecker() {
        BTree tree = new BTree(3);
        tree.Insert(1);
        tree.Insert(2);
        tree.Insert(666);
        tree.Insert(4);
        tree.Insert(5);
        tree.Insert(6);
        tree.Remove(666);
        Assertions.assertTrue(tree.Search(tree.root,666) == null);

    }
}
