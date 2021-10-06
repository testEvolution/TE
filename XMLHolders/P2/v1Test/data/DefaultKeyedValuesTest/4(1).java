@Test
    public void testGetValue() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        try {
            /* Number n = */ v1.getValue(-1);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            /* Number n = */ v1.getValue(0);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
        DefaultKeyedValues v2 = new DefaultKeyedValues();
        v2.addValue("K1", Integer.valueOf(1));
        v2.addValue("K2", Integer.valueOf(2));
        v2.addValue("K3", Integer.valueOf(3));
        assertEquals(3, v2.getValue(2));

        boolean pass = false;
        try {
            /* Number n = */ v2.getValue("KK");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    