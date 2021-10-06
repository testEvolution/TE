@Test
    public void testRemoveRowByIndex() {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("Obj1", "R1", "C1");
        data.setObject("Obj2", "R2", "C2");
        data.removeRow(0);
        assertEquals(1, data.getRowCount());
        assertEquals("Obj2", data.getObject(0, 1));

        // try negative row index
        boolean pass = false;
        try {
            data.removeRow(-1);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);

        // try row index too high
        pass = false;
        try {
            data.removeRow(data.getRowCount());
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    