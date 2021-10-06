@Test
    public void testRemoveValue() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", null);
        data.addValue("C", 3.0);
        data.addValue("D", 2.0);
        assertEquals(1, data.getIndex("B"));
        data.removeValue("B");
        assertEquals(-1, data.getIndex("B"));

        boolean pass = false;
        try {
            data.removeValue("XXX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    