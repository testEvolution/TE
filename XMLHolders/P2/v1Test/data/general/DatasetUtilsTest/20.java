@Test
    public void testFindMinimumDomainValue() {
        XYDataset dataset = createXYDataset1();
        Number minimum = DatasetUtils.findMinimumDomainValue(dataset);
        assertEquals(1.0, minimum);
    }

    