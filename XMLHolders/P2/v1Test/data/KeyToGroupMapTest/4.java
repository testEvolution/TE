@Test
    public void testGetGroup() {
        KeyToGroupMap m1 = new KeyToGroupMap("Default Group");

        // a key that hasn't been mapped should return the default group
        assertEquals("Default Group", m1.getGroup("K1"));

        m1.mapKeyToGroup("K1", "G1");
        assertEquals("G1", m1.getGroup("K1"));
        m1.mapKeyToGroup("K1", "G2");
        assertEquals("G2", m1.getGroup("K1"));
        m1.mapKeyToGroup("K1", null);
        assertEquals("Default Group", m1.getGroup("K1"));

        // a null argument should throw an exception
        boolean pass = false;
        try {
            Comparable g = m1.getGroup(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    