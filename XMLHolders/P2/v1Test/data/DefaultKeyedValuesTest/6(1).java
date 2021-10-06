@Test
    public void testGetIndex() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        assertEquals(-1, v1.getIndex("K1"));

        DefaultKeyedValues v2 = new DefaultKeyedValues();
        v2.addValue("K1", 1);
        v2.addValue("K2", 2);
        v2.addValue("K3", 3);
        assertEquals(2, v2.getIndex("K3"));

        // try null
        boolean pass = false;
        try {
            v2.getIndex(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    