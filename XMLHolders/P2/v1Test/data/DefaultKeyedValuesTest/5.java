@Test
    public void testGetKey() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        try {
            /* Comparable k = */ v1.getKey(-1);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            /* Comparable k = */ v1.getKey(0);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
        DefaultKeyedValues v2 = new DefaultKeyedValues();
        v2.addValue("K1", 1);
        v2.addValue("K2", 2);
        v2.addValue("K3", 3);
        assertEquals("K2", v2.getKey(1));
    }

    