@Test
    public void testGetRowKey() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        boolean pass = false;
        try {
            d.getRowKey(0);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
        d.addValue(1.0, "R1", "C1");
        d.addValue(1.0, "R2", "C1");
        assertEquals("R1", d.getRowKey(0));
        assertEquals("R2", d.getRowKey(1));

        // check sorted rows
        d = new DefaultKeyedValues2D(true);
        d.addValue(1.0, "R1", "C1");
        assertEquals("R1", d.getRowKey(0));
        d.addValue(0.0, "R0", "C1");
        assertEquals("R0", d.getRowKey(0));
        assertEquals("R1", d.getRowKey(1));
    }

    