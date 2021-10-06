@Test
    public void testRemoveColumnByKey() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("Obj1", "R1", "C1");
        data.setObject("Obj2", "R2", "C2");
        data.removeColumn("C2");
        assertEquals(1, data.getColumnCount());
        assertEquals("Obj1", data.getObject(0, 0));

        // try unknown column key
        boolean pass = false;
        try {
            data.removeColumn("XXX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        // try null column key
        pass = false;
        try {
            data.removeColumn(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    