@Test
    public void testMapKeyToGroup() {
        KeyToGroupMap m1 = new KeyToGroupMap("G1");

        // map a key to the default group
        m1.mapKeyToGroup("K1", "G1");
        assertEquals("G1", m1.getGroup("K1"));

        // map a key to a new group
        m1.mapKeyToGroup("K2", "G2");
        assertEquals("G2", m1.getGroup("K2"));

        // clear a mapping
        m1.mapKeyToGroup("K2", null);
        assertEquals("G1", m1.getGroup("K2"));  // after clearing, reverts to
                                                // default group

        // check handling of null key
        boolean pass = false;
        try {
            m1.mapKeyToGroup(null, "G1");
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    