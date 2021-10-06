@Test
    public void testKeyCount() {
        KeyToGroupMap m1 = new KeyToGroupMap("Default Group");

        // a new map always has 1 group (the default group)
        assertEquals(0, m1.getKeyCount("Default Group"));

        // simple case
        m1.mapKeyToGroup("K1", "G1");
        assertEquals(1, m1.getKeyCount("G1"));
        m1.mapKeyToGroup("K1", null);
        assertEquals(0, m1.getKeyCount("G1"));

        // if there is an explicit mapping to the default group, it is counted
        m1.mapKeyToGroup("K2", "Default Group");
        assertEquals(1, m1.getKeyCount("Default Group"));

        // complicate things a little...
        m1.mapKeyToGroup("K3", "Default Group");
        m1.mapKeyToGroup("K4", "G2");
        m1.mapKeyToGroup("K5", "G2");
        m1.mapKeyToGroup("K6", "Default Group");
        assertEquals(3, m1.getKeyCount("Default Group"));
        assertEquals(2, m1.getKeyCount("G2"));

        // now overwrite group "G2"...
        m1.mapKeyToGroup("K4", "G1");
        m1.mapKeyToGroup("K5", "G1");
        assertEquals(2, m1.getKeyCount("G1"));
        assertEquals(0, m1.getKeyCount("G2"));
    }

    