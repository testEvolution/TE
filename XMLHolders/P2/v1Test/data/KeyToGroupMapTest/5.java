@Test
    public void testEquals() {
        KeyToGroupMap m1 = new KeyToGroupMap("Default Group");
        KeyToGroupMap m2 = new KeyToGroupMap("Default Group");
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));

        m1.mapKeyToGroup("K1", "G1");
        assertFalse(m1.equals(m2));
        m2.mapKeyToGroup("K1", "G1");
        assertTrue(m1.equals(m2));
    }

    