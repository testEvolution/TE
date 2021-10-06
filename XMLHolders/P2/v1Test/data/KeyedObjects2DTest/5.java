@Test
    public void testSetObject() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("Obj1", "R1", "C1");
        data.setObject("Obj2", "R2", "C2");
        assertEquals("Obj1", data.getObject("R1", "C1"));
        assertEquals("Obj2", data.getObject("R2", "C2"));
        assertNull(data.getObject("R1", "C2"));
        assertNull(data.getObject("R2", "C1"));

        // confirm overwriting an existing value
        data.setObject("ABC", "R2", "C2");
        assertEquals("ABC", data.getObject("R2", "C2"));

        // try null keys
        boolean pass = false;
        try {
            data.setObject("X", null, "C1");
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            data.setObject("X", "R1", null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    