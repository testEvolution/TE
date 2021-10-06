@Test
    public void testGetIndex() {
        KeyedObjects ko1 = new KeyedObjects();
        ko1.addObject("Key 1", "Object 1");
        ko1.addObject("Key 2", null);
        ko1.addObject("Key 3", "Object 2");
        assertEquals(0, ko1.getIndex("Key 1"));
        assertEquals(1, ko1.getIndex("Key 2"));
        assertEquals(2, ko1.getIndex("Key 3"));

        // check null argument
        boolean pass = false;
        try {
            ko1.getIndex(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    