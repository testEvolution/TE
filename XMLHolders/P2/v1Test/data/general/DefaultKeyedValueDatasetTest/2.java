@Test
    public void testCloneIndependence() throws CloneNotSupportedException {
        DefaultKeyedValueDataset d1
            = new DefaultKeyedValueDataset("Key", 10.0);
        DefaultKeyedValueDataset d2 = (DefaultKeyedValueDataset) d1.clone();
        assertTrue(d1.equals(d2));
        d2.updateValue(99.9);
        assertFalse(d1.equals(d2));
        d2.updateValue(10.0);
        assertTrue(d1.equals(d2));
    }

    