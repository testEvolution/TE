@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValuesDataset d1 = new DefaultKeyedValuesDataset();
        d1.setValue("V1", 1);
        d1.setValue("V2", null);
        d1.setValue("V3", 3);
        DefaultKeyedValuesDataset d2 = (DefaultKeyedValuesDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));
    }

    