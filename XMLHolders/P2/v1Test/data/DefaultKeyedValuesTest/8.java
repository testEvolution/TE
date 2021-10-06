@Test
    public void testAddValue() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.addValue("A", 1.0);
        assertEquals(1.0, v1.getValue("A"));
        v1.addValue("B", 2.0);
        assertEquals(2.0, v1.getValue("B"));
        v1.addValue("B", 3.0);
        assertEquals(3.0, v1.getValue("B"));
        assertEquals(2, v1.getItemCount());
        v1.addValue("A", null);
        assertNull(v1.getValue("A"));
        assertEquals(2, v1.getItemCount());

        boolean pass = false;
        try {
            v1.addValue(null, 99.9);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    