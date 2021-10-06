@Test
    public void testGetValue() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        d.addValue(1.0, "R1", "C1");
        assertEquals(1.0, d.getValue("R1", "C1"));
        boolean pass = false;
        try {
            d.getValue("XX", "C1");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            d.getValue("R1", "XX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    