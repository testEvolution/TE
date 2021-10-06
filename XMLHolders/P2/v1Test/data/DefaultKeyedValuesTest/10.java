@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.addValue("V1", 1);
        v1.addValue("V2", null);
        v1.addValue("V3", 3);
        DefaultKeyedValues v2 = (DefaultKeyedValues) v1.clone();
        assertTrue(v1 != v2);
        assertTrue(v1.getClass() == v2.getClass());
        assertTrue(v1.equals(v2));

        // confirm that the clone is independent of the original
        v2.setValue("V1", 44);
        assertFalse(v1.equals(v2));
    }

    