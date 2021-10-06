public void testSerialization() {
        DefaultKeyedValuesDataset d1 = new DefaultKeyedValuesDataset();
        d1.setValue("C1", 234.2);
        d1.setValue("C2", null);
        d1.setValue("C3", 345.9);
        d1.setValue("C4", 452.7);

        KeyedValuesDataset d2 = (KeyedValuesDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

}