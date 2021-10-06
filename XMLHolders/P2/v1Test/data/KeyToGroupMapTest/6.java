@Test
    public void testCloning() throws CloneNotSupportedException {
        KeyToGroupMap m1 = new KeyToGroupMap("Test");
        m1.mapKeyToGroup("K1", "G1");
        KeyToGroupMap m2 = (KeyToGroupMap) m1.clone();
        assertTrue(m1 != m2);
        assertTrue(m1.getClass() == m2.getClass());
        assertTrue(m1.equals(m2));

        // a small check for independence
        m1.mapKeyToGroup("K1", "G2");
        assertFalse(m1.equals(m2));
        m2.mapKeyToGroup("K1", "G2");
        assertTrue(m1.equals(m2));
    }

    