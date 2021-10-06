@Test
    public void testGetValueByIndex() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.addObject("Obj1", "R1", "C1");
        data.addObject("Obj2", "R2", "C2");
        assertEquals("Obj1", data.getObject(0, 0));
        assertEquals("Obj2", data.getObject(1, 1));
        assertNull(data.getObject(0, 1));
        assertNull(data.getObject(1, 0));

        // check invalid indices
        boolean pass = false;
        try {
            data.getObject(-1, 0);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            data.getObject(0, -1);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            data.getObject(2, 0);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            data.getObject(0, 2);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    