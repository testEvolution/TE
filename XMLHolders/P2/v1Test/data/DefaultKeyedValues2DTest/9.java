@Test
    public void testGetColumnKey() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        boolean pass = false;
        try {
            d.getColumnKey(0);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
        d.addValue(1.0, "R1", "C1");
        d.addValue(1.0, "R1", "C2");
        assertEquals("C1", d.getColumnKey(0));
        assertEquals("C2", d.getColumnKey(1));
    }

    