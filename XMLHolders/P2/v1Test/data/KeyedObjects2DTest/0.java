@Test
    public void testEquals() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        KeyedObjects2D k2 = new KeyedObjects2D();
        assertTrue(k1.equals(k2));
        assertTrue(k2.equals(k1));

        k1.addObject(99, "R1", "C1");
        assertFalse(k1.equals(k2));
        k2.addObject(99, "R1", "C1");
        assertTrue(k1.equals(k2));
    }

    