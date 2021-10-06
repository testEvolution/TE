@Test
    public void testRemoveColumnByIndex() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("Obj1", "R1", "C1");
        data.setObject("Obj2", "R2", "C2");
        data.removeColumn(0);
        assertEquals(1, data.getColumnCount());
        assertEquals("Obj2", data.getObject(1, 0));

        // try negative column index
        boolean pass = false;
        try {
            data.removeColumn(-1);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        // try column index too high
        pass = false;
        try {
            data.removeColumn(data.getColumnCount());
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    