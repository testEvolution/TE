@Test
    public void testRemoveRowByKey() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("Obj1", "R1", "C1");
        data.setObject("Obj2", "R2", "C2");
        data.removeRow("R2");
        assertEquals(1, data.getRowCount());
        assertEquals("Obj1", data.getObject(0, 0));

        // try unknown row key
        boolean pass = false;
        try {
            data.removeRow("XXX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        // try null row key
        pass = false;
        try {
            data.removeRow(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    