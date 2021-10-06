@Test
    public void testGetGroupIndex() {
        KeyToGroupMap m1 = new KeyToGroupMap("Default Group");

        // the default group is always at index 0
        assertEquals(0, m1.getGroupIndex("Default Group"));

        // a non-existent group should return -1
        assertEquals(-1, m1.getGroupIndex("G3"));

        // indices are assigned in the order that groups are originally mapped
        m1.mapKeyToGroup("K3", "G3");
        m1.mapKeyToGroup("K1", "G1");
        m1.mapKeyToGroup("K2", "G2");
        assertEquals(1, m1.getGroupIndex("G3"));
        assertEquals(2, m1.getGroupIndex("G1"));
        assertEquals(3, m1.getGroupIndex("G2"));
    }

    