@Test
    public void testRemoveValue() {
        KeyedObjects ko1 = new KeyedObjects();
        ko1.setObject("Key 1", "Object 1");
        ko1.setObject("Key 2", null);
        ko1.setObject("Key 3", "Object 2");

        ko1.removeValue(1);
        assertEquals(2, ko1.getItemCount());
        assertEquals(1, ko1.getIndex("Key 3"));

        ko1.removeValue("Key 1");
        assertEquals(1, ko1.getItemCount());
        assertEquals(0, ko1.getIndex("Key 3"));

        // try unknown key
        boolean pass = false;
        try {
            ko1.removeValue("UNKNOWN");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        // try null argument
        pass = false;
        try {
            ko1.removeValue(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    