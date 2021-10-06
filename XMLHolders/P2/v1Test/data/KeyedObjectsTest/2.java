@Test
    public void testInsertAndRetrieve() {

        KeyedObjects data = new KeyedObjects();
        data.addObject("A", 1.0);
        data.addObject("B", 2.0);
        data.addObject("C", 3.0);
        data.addObject("D", null);

        // check key order
        assertEquals(data.getKey(0), "A");
        assertEquals(data.getKey(1), "B");
        assertEquals(data.getKey(2), "C");
        assertEquals(data.getKey(3), "D");

        // check retrieve value by key
        assertEquals(data.getObject("A"), 1.0);
        assertEquals(data.getObject("B"), 2.0);
        assertEquals(data.getObject("C"), 3.0);
        assertEquals(data.getObject("D"), null);

        boolean pass = false;
        try {
            data.getObject("Not a key");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        // check retrieve value by index
        assertEquals(data.getObject(0), 1.0);
        assertEquals(data.getObject(1), 2.0);
        assertEquals(data.getObject(2), 3.0);
        assertEquals(data.getObject(3), null);

    }

    