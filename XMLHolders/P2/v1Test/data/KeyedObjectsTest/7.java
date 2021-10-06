@Test
    public void testSetObject() {
        KeyedObjects ko1 = new KeyedObjects();
        ko1.setObject("Key 1", "Object 1");
        ko1.setObject("Key 2", null);
        ko1.setObject("Key 3", "Object 2");

        assertEquals("Object 1", ko1.getObject("Key 1"));
        assertEquals(null, ko1.getObject("Key 2"));
        assertEquals("Object 2", ko1.getObject("Key 3"));

        // replace an existing value
        ko1.setObject("Key 2", "AAA");
        ko1.setObject("Key 3", "BBB");
        assertEquals("AAA", ko1.getObject("Key 2"));
        assertEquals("BBB", ko1.getObject("Key 3"));

        // try a null key - should throw an exception
        boolean pass = false;
        try {
            ko1.setObject(null, "XX");
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    